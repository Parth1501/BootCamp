public class StackUser {
	public void fill(Stack s) {
		for(int i=0;i<9;i++) {
			try {
			s.push(i);
			}
			catch(FullStackException e) {
				System.out.println(e);
				return;
			}
		}
	}
	public void empty(Stack s) throws EmptyStackException{
		for(int i=0;i<9;i++) {
			s.pop();
		}
	}
}
