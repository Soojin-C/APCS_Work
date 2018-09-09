//Soojin Choi
//APCS02 pd08
//HW34 -- The English Do Not Wait In Line
//2018-04-15
public class NodeQueue<E> implements Queue<E>{
  LLNode<E> _head;
  LLNode<E> _tail;
  int _size;
  public NodeQueue(){
    _head = null;
    _tail = null;
    _size = 0;
  }
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public E dequeue(){
    if (isEmpty()){
      return _head.getValue(); //throw new RuntimeException();
    }
    else{
      _size--;
      E holder = peekFront();
      _head = _head.getNext();
      return holder;
    }
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( E x ){
    LLNode<E> temp = new LLNode<E>( x , null );
    _tail = temp;
    if (isEmpty()){
      _head = temp;
      _size++;
      return;
    }
    else{
      LLNode<E> holder = _head;
      for (int i = 1; i < _size; i++){
        holder = holder.getNext();
      }
      holder.setNext(temp);
      _size++;
    }
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty(){
    return _size == 0;
  }
  //Returns the first element of the queue without dequeuing it.
  public E peekFront(){
    return _head.getValue();
  }
  public String toString(){
    String retStr = "";
    LLNode<E> temp = _head;
    while (temp != _tail){
      retStr += temp.getValue();
      temp = temp.getNext();
    }
    retStr += temp.getValue();
    return retStr;
  }
  public static void main( String[] args){
	  NodeQueue<int> test = new NodeQueue<int>();
	  int counter = 0;
	  while (counter < 6){
		  test.enqueue(counter);
	  }
	  System.out.println(test);
	  while (!test.isEmpty()){
		System.out.println(test.peekFront());
	  	test.dequeue();
		System.out.println(test);
	  }
  }
}
