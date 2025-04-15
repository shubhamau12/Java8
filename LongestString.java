package com.codewithshubham.blog;

import java.util.*;
public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList=Arrays.asList("shubh","jaiswal","Manav","Charu","Tushar");
		Optional<String> longestWord=strList.stream().reduce((word1,word2)-> word1.length()>word2.length() ? word1 : word2);
		System.out.println("Longest word is:>"+longestWord.get());
		

	}

}
