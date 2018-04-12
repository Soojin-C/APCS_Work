// Soojin Choi
// APCS2 pd08
// HW32 -- Leon Leonwood Stack
// 2018-04-11
import java.util.LinkedList;
public class LLStack<E> implements Stack<E> {

  LinkedList<E> _stack = new LinkedList<E>();
  int _stackSize;

  public LLStack(){
    _stack = new LinkedList<E>();
    _stackSize = 0;
  }

///*
  //Return true if this stack is empty, otherwise false.
  public boolean isEmpty(){
    return _stackSize == 0;
  }

  //Return top element of stack without popping it.
  public E peek(){
    return _stack.get(0);
  }

  //Pop and return top element of stack.
  public E pop(){
    if (!isEmpty()){
      E temp = peek();
      _stack.remove(0);
      _stackSize--;
      return temp;
    }
    return null;
  }

  //Push an element onto top of this stack.
  public void	push( E x ){
    _stack.add(0,x);
    _stackSize++;
  }
  //*/

  /*
  //Return true if this stack is empty, otherwise false.
    public boolean isEmpty(){
      return _stackSize == 0;
    }

    //Return top element of stack without popping it.
    public E peek(){
      return _stack.peek();
    }

    //Pop and return top element of stack.
    public E pop(){
      _stackSize--;
      return _stack.pop();
    }

    //Push an element onto top of this stack.
    public void	push( E x ){
      _stack.push( x);
      _stackSize ++;
    }
    */
}
