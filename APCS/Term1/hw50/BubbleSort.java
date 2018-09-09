// Soojin Choi
// APCS1 pd02
// HW50 -- Dat Bubbly Tho
// 2017-12-10
/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 ******************************/

import java.util.ArrayList;

public class BubbleSort {

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
	    //     offset + rand int on interval [lo,hi]
	    retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
	    size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al ) {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
	    //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
	    //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
      for (int x = 0; x < data.size(); x++){
	  	for (int y = data.size() - 1; y > 0; y--){
	      if ((data.get(y - 1)).compareTo(data.get(y)) > 0){
			  //checks if the num at index y -1 is greater than the num at index y. If it is, it swaps them.
		  	data.add(y - 1, data.get(y));
		  	data.remove(y + 1);
		  	//System.out.println("Swapped "+ holder+ " with "+ other);
	      }
	  	}//check the elements from right to left.
      }// by size-1, the array should be ordered.
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
	  ArrayList copyInput = new ArrayList(input.size());
	  for (int a = 0; a < input.size(); a++){
		  copyInput.add(a,input.get(a));//copies values to the new array
	  }
	  bubbleSortV(copyInput);//sorts the copied array
	  return copyInput;//returns the new sorted array; original array remain the same.
  }


  public static void main( String [] args )
  {

 /*===============for VOID methods=============  
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      bubbleSortV(glen);
      System.out.println( "ArrayList glen after sorting:\n" + glen );
 
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
 
      ============================================*/

 
    	ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n" 
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );
   
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      ArrayList cocoSorted = bubbleSort( coco );
      System.out.println( "sorted version of ArrayList coco:\n" 
      + cocoSorted );
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      System.out.println( coco );
   /*==========for AL-returning methods==========
      ============================================*/

  }//end main

}//end class BubbleSort
