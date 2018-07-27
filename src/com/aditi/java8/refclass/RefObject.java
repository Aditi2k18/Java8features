package com.aditi.java8.refclass;

import java.util.function.Consumer;

public class RefObject implements Consumer<String>{
@Override
	public void accept(String val) {
		System.out.println("Name : : "+val);
	}
	
}

