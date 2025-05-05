package com.codewithshubham.blog;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> ls= Arrays.asList(1,2,3,4,5,1,3,1,7);
		Set<Integer> dup=ls.stream().filter(e->Collections.frequency(ls,e)>1).collect(Collectors.toSet());
		System.out.println("duplicate"+dup);
	}

}
