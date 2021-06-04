import java.awt.List;
import java.util.ArrayList;

public class StackApp {
	public static void main(String[] args) {
		StackUser sUser = new StackUser();
		
		FixedArrayStack fixedArrayStack = new FixedArrayStack(10);
		sUser.fill(fixedArrayStack);
		sUser.fill(fixedArrayStack);
		try {
			sUser.empty(fixedArrayStack);
		} catch (EmptyStackException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sUser.fill(fixedArrayStack);

	}

}
