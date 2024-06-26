package com.vijay.eightfeatures;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams {

	public static void main(String[] args) {
		
		 List<String> list = new ArrayList<>();
	                
	       list.add("vijay");
	       list.add("kss");
	       list.add("vvsv");
	       list.add("me");
	       list.add("uhhcsc");
	       list.add("yes");
	      Stream<String> stream =list.stream();
	      stream.filter(name -> name.startsWith("v")).forEach(System.out::println);
	     
	      stream = list.stream();
	      List<String> sortedList = stream.sorted().collect(Collectors.toList());
	      System.out.println("Sorted List: " + sortedList);
	      

}
}
