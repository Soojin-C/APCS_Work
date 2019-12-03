# Homework

## Term 1

### hw37
* Rational.java
  * Is a rational number with a numerator and a denominator. 
  * Rational() 
    * Default constructor sets the number to 0/1
  * toString()
  * floatBalue()
  * mulitply(Rational s)
  * divide(Rational s)
  * add(Rational s)
  * subtract(Rational t)
  * gcd(int a, int b)
  * gcd()
  * reduce()
  * compareTo(Rational l)
* Stats.java
  * mean(int/double a, int/double b)
  * max(int/double a, int/double b)
  * max(int/double a, int/double b, int/double c)
  * min(int/double a, int/double b)
  * geoMean(int/double a, int/double b)
  * geoMean(int/double a, int/double b, int/double c)

## Term 2

### hw32 - ALStack and LLStack
* Stack.java
  * An INTERFACE for Stack<PANCAKE>
  * isEmpty()
  * peek()
  * pop()
  * push( PANCAKE x )
* ALStack.java
  * implements Stack<T> using an ArrayList<T>
  * ALStack()
  * isEmpty()
  * peek()
  * pop()
  * push( T x )
* LLStack.java
  * implements Stack<E> using a LinkedList<E>
  * LLStack()
  * isEmpty()
  * peek()
  * pop()
  * push( E x )
* Stckr.java
  * Driver for the LLStack and ALStack

### hw33 - Expression Evaluation with Stacks
* Scheme.java
  * Simulates a rudimentary Scheme interpreter using choice of Stack (ALStack)
  * evaluate( String expr )
    * Assumes that the expr is a PREFIX expression
    * Returns the simplified value of the expression, as a String
  * unload( int op, Stack<String> numbers)
    * Assumes top of input stack is a number
    * Returns the result of operating on sequence of operands
* ALStack.java
* Stack.java
 
### hw34 - NodeQueue
* Queue.java
  * An INTERFACE for Queue<Quasar>
  * dequeue()
  * enqueue( E x )
  * isEmpty()
  * peekFront()
* LLNode.java
  * Implements a node, for use in lists and other container classes
  * LLNode( T value, LLNode<T> next )
  * getValue()
  * getNext()
  * setValue( T newCargo )
  * setNext( LLNode<T> newNext )
  * toString()
* NodeQueue.java
  * Implements Queue<E> using Nodes
  * NodeQueue()
  * dequeue()
  * enqueue( E x )
  * isEmpty()
  * peekFront()
  * toString()
* NodeQueueDriver.java
  * DRIVER class for NodeQueue

### hw35 - ALQueue
* Queue.java
  * An INTERFACE for Queue<Quasar>
  * dequeue()
  * enqueue( E x )
  * isEmpty()
  * peekFront()
* ALQueue.java
  * Implements Queue<E> using an ArrayList<E>
  * ALQueue()
  * dequeue()
  * enqueue( E x )
  * isEmpty()
  * peekFront()
  * toString()

### hw36
* Queue.java
  * An INTERFACE for Queue<Quasar>
  * dequeue()
  * enqueue( E x )
  * isEmpty()
  * peekFront()
* LLNode.java
  * Implements a node, for use in lists and other container classes
  * LLNode( T value, LLNode<T> next )
  * getValue()
  * getNext()
  * setValue( T newCargo )
  * setNext( LLNode<T> newNext )
  * toString()
* RQueue.java
  * A linked-list-based, randomized queue

### hw33
