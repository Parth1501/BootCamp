package map;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class BuildMap {
	
	public static void main(String[] args) {
//		Map<String,String> map=new HashMap<>();
//		map.put("E1234","Steve Jobs");
//		map.put("E2345", "Bill Gates ");
//		map.put("E3456","Larry Ellison");
//		map.put("E4567","Jeff Bezos");
//		map.put("E8765","Mark Zuckerberg");
//		map.put("E6789","Larry Page");
//		
//		Scanner s=new Scanner(System.in);
//		while(true) {
//			System.out.print("Enter the id of Employee: ");
//			String val=s.nextLine();
//			if(val.equalsIgnoreCase("Q"))
//				break;
//			String ans=map.get(val);
//			if(ans!=null) {
//				System.out.println(val+" -----------> "+ ans);
//			}
//			else {
//				System.out.println("Employee does not exists");
//			}
//		}
//		for(Map.Entry<String, String> m:map.entrySet()) {
//			System.out.println(m.getKey()+" ---------------> "+ m.get);
//		}
//		setOfWords();
		sortElenment();
		
	}

	private static void sortElenment() {
		// TODO Auto-generated method stub
		Element[] eArray=new Element[10];
		for(int i=0;i<10;i++) {
			Element e=new Element(i+1, null, null);
			eArray[i]=e;
		}
		Arrays.sort(eArray);
		
	}

	private static void setOfWords() {
		Scanner s=new Scanner(System.in);
		Set<String> set=new LinkedHashSet<>();
		while(true) {
			System.out.print("Enter the String: ");
			String string=s.nextLine();
			if(string.equalsIgnoreCase("Quit"))
				break;
			if(set.add(string)) {
				System.out.println(string+" is duplicate");
			}
			
			
		}
		System.out.println("-----------------------");
		Iterator iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	

}
