package generics;


public interface Stack<E> {
	public void push(E element) throws FullStackException;
	public E pop() throws EmptyStackException ;
	
}
