// Soojin Choi
// APCS2 pd08
// HW33 -- What A Racket
// 2018-04-12
/*****************************************************
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Steal underpants.
 *   2. Add to the stack from right to left until it hits a operation to execute.
 *   3. Do this operation on the values on the top of the stack until it hits an end parenthesis
 *   4. Add the return value and continue to repeat until you have gone though all the items.
 *   5. Profit!
 *
 * STACK OF CHOICE: ALStack by
 * It was the cleaner of all the Stacks I had written and there didn't seem to be much of a difference.
 ******************************************************/

public class Scheme
{
  /******************************************************
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   ******************************************************/
  public static String evaluate( String expr )
  {
    Stack<String> holder = new ALStack<String>();
    String[] temp = expr.split("\\s+");

    for (int x = temp.length - 1; x >= 0; x--){
      String curr = temp[x];
      if (curr.equals("+")){
        holder.push(unload(1,holder));
        x -= 1;
      }
      else if (curr.equals("-")){
        holder.push(unload(2,holder));
        x -= 1;
      }
      else if (curr.equals("*")){
        holder.push(unload(3,holder));
        x -= 1;
      }
      else{
        holder.push(curr);
      }
    }
    return holder.pop();
  }//end evaluate()

public static void sop(String print){
  System.out.println(print);
}

  /******************************************************
   * precond:  Assumes top of input stack is a number.
   * postcond: Performs op on nums until closing paren is seen thru peek().
   *           Returns the result of operating on sequence of operands.
   *           Ops: + is 1, - is 2, * is 3
   ******************************************************/
  public static String unload( int op, Stack<String> numbers )
  {
    int total = Integer.parseInt(numbers.pop());
    if (op == 1){
      while (!numbers.peek().equals(")")){
        //System.out.println(numbers.peek());
        total += Integer.parseInt(numbers.pop());
      }
    }
    else if (op == 2){
      while (!numbers.peek().equals(")")){
        //System.out.println(numbers.peek());
        total -= Integer.parseInt(numbers.pop());
      }
    }
    else{
      while (!numbers.peek().equals(")")){
        //System.out.println(numbers.peek());
        total = total * Integer.parseInt(numbers.pop());
      }
    }

    numbers.pop();
    return total + "";
  }//end unload()


  /*
  //optional check-to-see-if-its-a-number helper fxn:
  public static boolean isNumber( String s ) {
  try {
  Integer.parseInt(s);
  return true;
	}
  catch( NumberFormatException e ) {
  return false;
	}
  }
  */


  //main method for testing
  public static void main( String[] args )
  {


      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17


      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main

}//end class Scheme
