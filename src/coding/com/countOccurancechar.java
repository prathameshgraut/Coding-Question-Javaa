package coding.com;

import java.util.Map;
import java.util.stream.Collectors;

public class countOccurancechar {

	public static void main(String[] args) {
		//Count occurrences of each character in a string (using stream API)
		
		
		String str="Prathamesh_Raut";
		
		Map<Character, Long> res = str.chars().mapToObj(i->(char) i).collect(Collectors.groupingBy(i-> i,Collectors.counting()));
	    System.out.println(res);
	    
	    
	    
	    String name ="Sanika";
	    
	    Map<Character , Long> map = name.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting()));
	    System.out.println(map);
	    
	    
	    
	    String st="Devendra";
	    Map<Character, Long> stt= st.chars().mapToObj(i->(char)i).collect(Collectors.groupingBy(i->i,Collectors.counting()));
	    System.out.println(stt);
	    
	}

}
