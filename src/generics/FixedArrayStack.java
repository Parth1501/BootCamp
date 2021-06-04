package generics;

import java.awt.List;
import java.util.ArrayList;

public class FixedArrayStack<E> implements Stack<E>{
	private int size;
	private int top;
	private ArrayList<E> stack;
 	public FixedArrayStack(int size) {
		this.size=size;
		stack=new ArrayList<E>();
		top=-1;
	}
	@Override
	public void push(E element) throws FullStackException {
		// TODO Auto-generated method stub
		if(top==size-1)
			throw new FullStackException("Stack is Full");
		 stack.add(element);
		
	}

	@Override
	public E pop() throws EmptyStackException {
		if(top==-1)
			throw new EmptyStackException("Stack is empty");
		E value=stack.get(stack.size()-1);
		stack.remove(stack.size()-1);
		return value;
		
	}

}
