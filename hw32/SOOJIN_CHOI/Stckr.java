// Soojin Choi
// APCS2 pd08
// HW32 -- Leon Leonwood Stack
// 2018-04-11
/*****************************************************
 * class Stckr
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 *****************************************************/

public class Stckr
{
    public static void main( String[] args )
    {
	Stack<String> cakes = new ALStack<String>();
System.out.println("ALStack...");
  cakes.push("I");
  cakes.push("H");
  cakes.push("G");
  cakes.push("F");
  cakes.push("E");
  cakes.push("D");
  cakes.push("C");
  cakes.push("B");
  cakes.push("A");

  while(!cakes.isEmpty()){
    System.out.println(cakes.pop());
  }

System.out.println();
System.out.println("LLStack...");

	Stack<String> cakes42 = new LLStack<String>();
  cakes42.push("R");
  cakes42.push("Q");
  cakes42.push("P");
  cakes42.push("O");
  cakes42.push("N");
  cakes42.push("M");
  cakes42.push("L");
  cakes42.push("K");
  cakes42.push("J");

  while(!cakes42.isEmpty()){
    System.out.println(cakes42.pop());
  }
	//...

    }//end main

}//end class
