package generics;


public class StackApp {
	public static void main(String[] args) {
		StackUser<StackApp> sUser = new StackUser<>();
		
		FixedArrayStack<Integer> fixedArrayStack = new FixedArrayStack<>(10);
		sUser.fill(fixedArrayStack);
		
	}

}
