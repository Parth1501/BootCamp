package Iterator;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class StringRemove {
	private static List sizeAfterRemove(List<? extends String> list,int k) {
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			String string=iterator.next().toString();
			if(string.length()<k) {
				iterator.remove();
			}
			
		}
		return list;
	}
	public static void main(String[] args) {
		List<String> list=new LinkedList<>();
		list.add("Ab");
		list.add("AbcDEF");
		list.add("AbcGH");
		list.add("AbcGSH");
		list.add("AbcOLA");
		list.add("AbcSD");
		list.add("AbcDSHJDH");
		list.add("AbcAHDH");
		list.add("AbcDSABFB");
		System.out.println(list.size());
		List newList=sizeAfterRemove(list, 3);
		
		System.out.println(list.size());
		
		
	}

}
