package com.codewithshubham.blog;

import java.util.*;

public class AverageOfNumber {

	public static void main(String[] args) {
		// This is reduce logic 
		/*List<Integer> numbers=Arrays.asList(2,5,6,7,4,0);
		Optional<Integer> avg=numbers.stream().reduce((a,b)->a+b);
		System.out.println("average is:>"+avg.get()/numbers.size());*/
		
		//This is logic without reduce
		List<Integer> numbers=Arrays.asList(2,5,6,7,4,0);
		double avg=numbers.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println("average is:"+avg);
	}
}
