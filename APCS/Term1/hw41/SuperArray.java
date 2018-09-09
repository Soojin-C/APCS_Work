// Soojin Choi
// APCS1 pd02
// HW41 -- Array of Steel
// 2017-11-27 
/***************************
 * class SuperArray
 * Wrapper class for array. Facilitates resizing,
 * getting and setting element values.
 ***************************/

public class SuperArray
{

  private int[] _data;  //underlying container
  private int _size;    //number of elements in this SuperArray


  //default constructor – initializes 10-item array
  public SuperArray()
  {
      _size = 10;
      _data = new int[_size];
  }
    
  //output SuperArray in [a,b,c] format
  public String toString()
  {
      String collector = "[ "; //begins the String for of an array
      for (int counter = 0; counter < _data.length - 1; counter++){
	  collector += _data[counter] + ",";
      }
      collector += _data[_data.length - 1] + " ]"; //adds the last item without a comma at the end
      return collector;
  }


  //double capacity of SuperArray
  private void expand()
  {
      _size *= 2; //doubles the size of the array.
      int[] holder = new int[_size];
      for (int x = 0; x < (_size / 2 ); x++){
	  holder[x] = get(x);
      }
      _data = holder; //sets the holder array to _data
  }


  //accessor -- return value at specified index
  public int get( int index )
  {
      return _data[index];//returns the item at the index
  }


  //mutator -- set value at index to newVal,
  //           return old value at index
  public int set( int index, int newVal )
  {
      int oldValue = _data[index];//saves the oldVal
      _data[index] = newVal;//sets the item at index to the newVal.
      return oldValue;
  }


  //main method for testing
  public static void main( String[] args )
  {
   
      SuperArray curtis = new SuperArray();
      System.out.println( "Printing empty SuperArray curtis..." );
      System.out.println( curtis );

      for( int i = 0; i < curtis._data.length; i++ ) {
      curtis.set( i, i * 2 );
      }

      System.out.println("Printing populated SuperArray curtis...");
      System.out.println(curtis);

      for( int i = 0; i < 3; i++ ) {
      curtis.expand();
      System.out.println("Printing expanded SuperArray curtis...");
      System.out.println(curtis);
      }
      /*~~~~~~~~move~me~down~~~~~~~~~~~~~~V~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|~~~~~~~~*/
  }//end main()


}//end class
