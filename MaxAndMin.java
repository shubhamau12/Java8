package com.codewithshubham.blog;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MaxAndMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls= Arrays.asList(1,3,-55,33,44,234,4);
		int max= ls.stream().max(Comparator.comparing(Integer :: valueOf)).get();
		int min = ls.stream().min(Comparator.comparing(Integer :: valueOf)).get();
		System.out.println("maximum value:"+max);
		System.out.println("min value:"+min);

	}

}
