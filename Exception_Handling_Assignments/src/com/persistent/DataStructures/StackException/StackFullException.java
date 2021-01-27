package com.persistent.DataStructures.StackException;

public class StackFullException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public StackFullException(){
        super();
    }
    
    public StackFullException(String message){
        super(message);
    }
}
