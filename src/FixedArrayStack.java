public class FixedArrayStack implements Stack{
	private int size;
	private int top;
	private Object[] stack;
	public FixedArrayStack(int size) {
		this.size=size;
		stack=new Object[size];
		top=-1;
	}
	@Override
	public void push(Object element) throws FullStackException {
		// TODO Auto-generated method stub
		if(top==size-1)
			throw new FullStackException("Stack is Full");
		 stack[++top]=element;
		
	}

	@Override
	public Object pop() throws EmptyStackException {
		if(top==-1)
			throw new EmptyStackException("Stack is empty");
		return stack[top--];
	}

}
