
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class StringUtils {
	public static void main(String[] args) {
//		letterWithEFirst();
		lambda();
	}
	private static void lambda() {
		String better = betterElement("hi", "hello", (x,y) -> x.length() > y.length());
		System.out.println(better);
		Car car1=new Car("Bugati", 1500);
		Car car2=new Car("marsidi", 1300);
		Car betterCar=betterElement(car1,car2, (c1,c2)-> c1.getPrice()>c2.getPrice());
		System.out.println(betterCar);
	}
	private static <T> T betterElement(T first,T second,TwoStringPredicate<T> decider) {
		if(decider.isFirstBetterThanSecond(first, second)) {
			return first;
		}
		else {
			return second;
		}
	}
	private static void letterWithEFirst() {
		String[] string= new String[]{"This","Is","elephant","on","the","earth"};
		System.out.println(Arrays.asList(string));
		Arrays.sort(string,(s1,s2)->{
			if(s1.contains("e") && !s2.contains("e"))
				return -1;
			if(!s1.contains("e") && s2.contains("e"))
				return 1;
			else
				return 0;
			
		});
		System.out.println(Arrays.asList(string));
	}
	
	public static List<String> transformedElement(List<String> objs,Function<String, String> function) {
		List<String> ans=new ArrayList<>();
		for(String obj:objs) {
			ans.add(function.apply(obj));
		}
		return ans;
		
	}
	
	public static  List<String> allMatches(List<String> objs,Predicate<String> predicate) {
		List<String> list=new ArrayList<String>();
		for(String obj:objs) {
			if(predicate.test(obj))
				list.add(obj);
		}
		return list;
		
	}
	
	
}
