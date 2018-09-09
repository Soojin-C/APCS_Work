// Soojin Choi
// APCS2 pd08
// HW32 -- Leon Leonwood Stack
// 2018-04-11
import java.util.ArrayList;
public class ALStack<T> implements Stack<T>{

  ArrayList<T> _stack;
  int _stackSize;

  public ALStack(){
    _stack = new ArrayList<T>();
    _stackSize = 0;
  }

  //Return true if this stack is empty, otherwise false.
  public boolean isEmpty(){
    return _stackSize == 0;
  }

  //Return top element of stack without popping it.
  public T peek(){
    return _stack.get(0);
  }

  //Pop and return top element of stack.
  public T pop(){
    if (!isEmpty()){
      T temp = peek();
      _stack.remove(0);
      _stackSize --;
      return temp;
    }
    return null;
  }

  //Push an element onto top of this stack.
  public void	push( T x ){
    _stack.add(0,x);
    _stackSize++;
  }
}
