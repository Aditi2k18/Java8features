package com.aditi.java8;

import java.util.ArrayList;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
	List <String> names=new ArrayList<String>();
	names.add("Tom");
	names.add("Dick");
	names.add("Harry");
	//method reference
	names.forEach(System.out::println);
	
	}

}
