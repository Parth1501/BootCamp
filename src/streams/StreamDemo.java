//
//Part 1
//For all the exercises, start with a List of Strings similar to this:
//• List<String> words = Arrays.asList("hi", "hello", ...);
//1. Loop down the words and print each on a separate line, with two spaces in front of each word.
//Don’t use map.
//2. Repeat the previous problem, but without the two spaces in front. This is trivial if you use the same
//approach as in #1, so the point is to use a method reference here, as opposed to an explicit lambda
//in problem 1.
//3. In the previous exercise, we produced transformed lists like this:
//• List<String> excitingWords = StringUtils.transformedList(words, s -> s + "!");
//• List<String> eyeWords = StringUtils.transformedList(words, s -> s.replace("i", "eye"));
//• List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
//Produce the same lists as above, but this time use streams and the builtin “map” method.
//4. In the previous exercise, we produced filtered lists like this:
//• List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
//• List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
//• List<String> evenLengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
//Produce the same lists as above, but this time use “filter”.


package streams;
import java.lang.Math;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.DoubleStream;

public class StreamDemo {
	private static void mapAndFilter() {
		String[] string= new String[]{"This","Is","elephant","on","the","earth","badal","bubble"};
		List<String> strings=Arrays.asList(string);
		System.out.println("-------------------1------------------");
		strings.stream().forEach(w->System.out.println("  "+w));
		System.out.println("-------------------2------------------");
		strings.stream().forEach(System.out::println);

		System.out.println("----------------Map---------------------");
		System.out.println("-----------------2.1--------------------");
		strings.stream().map(s->s+'!').forEach(System.out::println);
		System.out.println("-----------------2.2--------------------");
		strings.stream().map(s->s.replace("i", "eye")).forEach(System.out::println);
		System.out.println("------------------2.3-------------------");
		strings.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println("-------------------Filter------------------");
		System.out.println("------------------3.1-------------------");
		strings.stream().filter(s->s.length()<4).forEach(System.out::println);
		System.out.println("-------------------3.2------------------");
		strings.stream().filter(s->s.contains("b")).forEach(System.out::println);
		System.out.println("--------------------3.3-----------------");
		strings.stream().filter(s->s.length()%2==0).forEach(System.out::println);
		
	}
	private static void part2() {
		String[] string= new String[]{"This","Is","elephant","on","the","earth","badal","bubble"};
		List<String> strings=Arrays.asList(string);
		
		String str1=strings.stream().reduce("",(s1,s2)->s1.toUpperCase()+s2.toUpperCase());
		System.out.println(str1);
		
		
		
		String str2=strings.stream().map(String::toUpperCase).reduce("",String::concat);
		System.out.println(str2);
		
		String str3=strings.stream().reduce((s1,s2)->s1+","+s2).orElse("");
		System.out.println(str3);
		
		double[] d=new Random().doubles(1000000).toArray();
		
			
		double ans1=DoubleStream.of(d).reduce((d1,d2)->  Math.sqrt(d1)+Math.sqrt(d2)).orElse(0);
		System.out.println(ans1);
		double ans2=DoubleStream.of(d).parallel().reduce((d1,d2)->  Math.sqrt(d1)+Math.sqrt(d2)).orElse(0);
		System.out.println(ans2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		mapAndFilter();
		part2();
	}

}
