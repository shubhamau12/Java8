package com.codewithshubham.blog;

import java.util.*;

public class Square_filter_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers=Arrays.asList(2,3,5,6);
		double res=numbers.stream().map(e->e*e).filter(e->e>10).mapToInt(e->e).average().getAsDouble();
		System.out.println("average greater than 10 is:"+res);

	}

}
