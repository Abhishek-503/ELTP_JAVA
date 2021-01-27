/*3.	Implement stack for Contact objects. Use exception handling to apply the following rules:
i.	A pop must fail on an uninitialized stack and empty stack
ii.	A push must fail on an uninitialized stack and stack which is already full
iii.	A push must fail on a stack if the Contact object’s validation fails.*/

package com.persistent.DataStructures.Stack;

import com.persistent.DataStructures.StackException.StackEmptyException;
import com.persistent.DataStructures.StackException.StackFullException;

public class Stack<T> {
	 private int size;
    private T[] stackAr;
    private int top;
    
    @SuppressWarnings("unchecked")
    public Stack(int size) {
           this.size = size;
           stackAr = (T[])new Object[size]; //Creation of Generic Stack Array
           top = -1; // initialize Stack to with -1
    }
 
    public void push(T value){
        if(isFull()){
               throw new StackFullException("Cannot push "+value+", Stack is full");
        }
        stackAr[++top] = value;
    }
 
    public T pop() {
        if(isEmpty()){
               throw new StackEmptyException("Stack is empty");
        }
        return stackAr[top--]; // remove item and decrement top as well.
    }
 
    public T peek()
    {
        if (top < 0) {
        	throw new StackEmptyException("Stack is empty");
        }
        else {
            T x = stackAr[top];
            return x;
        }
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public boolean isFull(){
        return (top == size - 1);
    }
}
