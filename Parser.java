
/**
 * Write a description of class Parser here.
 *
 * @author (Kelvin Likollari)
 * @version (04.06.2021)
 */
public class Parser {
   private Lexer lex;
   
   
    public Parser() { 
        lex = new Lexer();
    }
    
    
    public Parser (String s)
        {
            lex = new Lexer (s);
        }

        public ExpTree parseLine() {
          
            lex.init();
          
            lex.getToken();
          
            ExpTree result = parseExp(true);
          
            if (lex.token==Lexer.where) {
              
                lex.getToken();
              
                ExpTree defs = parseDefList();
              
                result = makeWhereTree(result, defs);
            
            }
            
            return result;
        
        }
        
        
        
        public String getLine() {
            
            return lex.getLine();
        
        }
        
        
        private ExpTree parseExp(boolean idsAllowed) {
            
            ExpTree result = parseTerm(idsAllowed);
            
            { while (lex.token == Lexer.plus || lex.token == Lexer.minus)
            
                { int op = lex.token;
            
                    lex.getToken();
            
            
                    if (op == Lexer.plus)
            
                    result = makePlusTree(result, parseTerm(idsAllowed));
            
                    else
            
                    result = makeMinusTree(result, parseTerm(idsAllowed));
            
                }
            
            }
            
            return result;
        
        }
        

          
        private ExpTree parseTerm(boolean idsAllowed)
        
        { ExpTree result = parseOpd(idsAllowed);
        
            { while (lex.token==Lexer.times || lex.token==Lexer.div || lex.token==Lexer.mod)
        
                { int op = lex.token;
        
                    lex.getToken();
        
                    if (op==Lexer.times)
        
                    result = makeTimesTree(result, parseOpd(idsAllowed));
        
                    else if (op==Lexer.mod)
        
                    result = makeModTree(result, parseOpd(idsAllowed));
        
                    else
        
                    result = makeDivideTree(result, parseOpd(idsAllowed));
        
                }
        
            }
        
            return result;
        
        }

        
        private ExpTree parseOpd(boolean idsAllowed)
        
        { ExpTree result;
        
            switch(lex.token)
        
            { case Lexer.num:
        
                result = makeNumberLeaf(lex.numval);
        
                lex.getToken();
        
                return result;
        
                case Lexer.id:
        
                if (!idsAllowed)
        
                throw new ParseException("identifier not allowed in identifier defintion");
        
                result = makeIdLeaf(lex.idval);
        
                lex.getToken();
        
                return result;
        
                case Lexer.lp:
        
                lex.getToken();
        
                result = parseExp(idsAllowed);
        
                if (lex.token!=Lexer.rp)
        
                throw new ParseException("right parenthesis expected");
        
                lex.getToken();
        
                return result;
        
                default:
        
                throw new ParseException("invalid operand");
        
            }
        
        }

          
        private ExpTree parseDefList()
        
        { ExpTree result = parseDef();
        
            while (lex.token==Lexer.and)
        
            { lex.getToken();
        
                result = makeAndTree(result, parseDef());
        
            }
        
            return result;
        
        }

        
        
        private ExpTree parseDef()
        
        { 
        
            if (lex.token!=Lexer.id)

            throw new ParseException("definition must start with identifier");
        
            char id = lex.idval;
        
            if (Character.isUpperCase(id))
        
            throw new ParseException("upper-case identifiers cannot be used in defintion list");
        
            lex.getToken();
        
            if (lex.token!=Lexer.eq)
        
            
        
            throw new ParseException("'=' expected");
        
            lex.getToken();

            
              return makeDefTree(id, parseExp(false));
        }
        
      static ExpTree makeNumberLeaf(int n)
      { 
          return new ExpTree(ExpTree.NUM, n, null, null);
        
          // this method should return a new number leaf with value n created using your constructor
        
          // if you've used the abstract class approach you will probably need something like
        
          // return new NumLeaf(n);
        
          // if you've used an ExpTree class that stores the node kind you will probably need something like
        
          // return new ExpTree(ExpTree.numNode, n , null, null);
      }

      static ExpTree makeIdLeaf(char c)
      { 
          return new ExpTree(ExpTree.VAL, c, null, null);
        
          // this method should return a new id leaf with value c
      }

      static ExpTree makePlusTree(ExpTree l, ExpTree r)
      { 
          return new ExpTree(ExpTree.OP, '+', l, r);
        
          // this method should return a new plus node with children l and r created using our constructor
        
          // if you've used the abstract class approach you will probably need something like
        
          // return new OpNode('+', l, r);
        
          // or
       
          // return new PlusNode(l, r);
        
          // if you've used an ExpTree class that stores the node kind you will probably need something like
       
          // return new ExpTree(ExpTree.opMode, '+', l, r);
      }

      public static ExpTree makeMinusTree(ExpTree l, ExpTree r)
      { 
          return new ExpTree(ExpTree.OP, '-', l, r);
        
          // this method should return a new minus node with children l and r
      }

      public static ExpTree makeTimesTree(ExpTree l, ExpTree r)
      { 
          return new ExpTree(ExpTree.OP, '*', l, r);
        
          // this method should return a new times node with children l and r
      }

      public static ExpTree makeDivideTree(ExpTree l, ExpTree r)
      { 
          return new ExpTree(ExpTree.OP, '/', l, r);
        
          // this method should return a new divide node with children l and r
      }

      public static ExpTree makeModTree(ExpTree l, ExpTree r)
      { 
          return new ExpTree(ExpTree.OP, '%', l, r);
        
          // this method should return a new mod (%) node with children l and r
      }

      

      public static ExpTree makeWhereTree(ExpTree l, ExpTree r)
      { 
          // remove the following line if you modify this method; leave it here if you do not attempt part 6
        
          System.out.println("Part 6 not attempted");
        
          return null;
        
          // this method should return a new 'where' node with children l and r
      }

      public static ExpTree makeAndTree(ExpTree l, ExpTree r)
      { 
          return null;
        
          // this method should return a new 'and' node with children l and r
      }

      public static ExpTree makeDefTree(char c, ExpTree t)
      { 
          return null;
        
          // this method should return a new definition node with identifier c and child t
        
          // if your definition nodes have 2 children you should put a new id leaf in the left child and use t as the right child
      }
}
