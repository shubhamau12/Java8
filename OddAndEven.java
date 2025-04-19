package com.codewithshubham.blog;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddAndEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> ls= Arrays.asList(2,3,4,5,6,7,8,9);
       List<Integer> even= ls.stream().filter(e->e%2==0).collect(Collectors.toList());
       List<Integer> odd= ls.stream().filter(e->e%2!=0).collect(Collectors.toList());
       List<Integer> square= ls.stream().map(e->e*e).collect(Collectors.toList());
       System.out.println(even);
       System.out.println(square);
       System.out.println(odd);
	}

}
