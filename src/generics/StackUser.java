package generics;
public class StackUser<E> {
	public void fill(Stack s) {
		StackApp val=new StackApp();
		for(int i=0;i<10;i++) {
			try {
			s.push(val);
			System.out.println("Push -------->"+val);
			}
			catch(FullStackException e) {
				System.out.println(e);
				return;
			}
		}
	}
	public void empty(Stack s) throws EmptyStackException{
		for(int i=0;i<10;i++) {
			s.pop();
		}
	}
}
