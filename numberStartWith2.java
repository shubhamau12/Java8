package com.codewithshubham.blog;

import java.util.*;
import java.util.stream.Collectors;

public class numberStartWith2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls= Arrays.asList(2,22,234,342,33,243);
		List<Integer> StartWithPrefix=ls.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).map(Integer :: valueOf).collect(Collectors.toList());
         System.out.println(StartWithPrefix);
	}

}
