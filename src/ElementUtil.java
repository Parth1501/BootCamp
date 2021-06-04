import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ElementUtil {
	public static <T> List<T> allMatches(List<T> objs,Predicate<T> predicate) {
		List<T> list=new ArrayList<T>();
		for(T obj:objs) {
			if(predicate.test(obj))
				list.add(obj);
		}
		return list;
		
	}
	public static <T,R> List<R> transformedElement(List<T> objs,Function<T, R> function) {
		List<R> ans=new ArrayList<>();
		for(T obj:objs) {
			ans.add(function.apply(obj));
		}
		return ans;
		
	}
	
	
	

}
