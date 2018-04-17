//Team SoSoon
//Soojin Choi, Jason Kim
//APCS02 pd08
//HW35 -- ...Nor Do Aussies
//2018-04-16
import java.util.ArrayList;

public class ALQueue<E> implements Queue<E>{
  ArrayList<E> _data;
  public ALQueue(){
    _data = new ArrayList<E>(10);
  }
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public E dequeue(){
    if (isEmpty()){
      return null;
    }
    E holder = peekFront();
    _data.remove(0);
    return holder;
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( E x ){
    _data.add(x);
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty(){
    return _data.size() == 0;
  }

  //Returns the first element of the queue without dequeuing it.
  public E peekFront(){
    return _data.get(0);
  }
  public String toString(){
    return _data.toString();
  }
  public static void main(String[] args) {
    ALQueue<String> soSoon = new ALQueue<String>();
    int counter = 8;
    while (counter > 0){
      soSoon.enqueue(counter + "");
      System.out.println(soSoon);
      counter--;
    }
    while (counter < 4){
      soSoon.dequeue();
      System.out.println(soSoon.peekFront());
      counter++;
    }
  }
}
