package coding.com;

import java.util.*;
import java.util.stream.Collectors;

public class CountChar {
	public static void main(String[] args) {
//		List<String> l1 = Arrays.asList("Prathamesh");/

		String name = "Prathamesh";
		String name1 = "Prathamesh ";

		Map<Character, Long> result = name.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(result);
		
		Map<Character, Long> res = name1.chars().mapToObj(i-> (char)i).collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(res);
	}
}
