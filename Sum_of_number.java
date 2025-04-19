package com.codewithshubham.blog;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Sum_of_number {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= Arrays.asList(2,34,4,3,55,67,21,2,45);
		Optional<Integer> sum=list.stream().reduce((a,b)->a+b);
		System.out.println("sum="+sum.get());

	}
}
