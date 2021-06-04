

public interface Stack {
	public void push(Object element) throws FullStackException;
	public Object pop() throws EmptyStackException ;
}
