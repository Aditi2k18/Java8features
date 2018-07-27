package com.aditi.java8;
import java.util.ArrayList;
import java.util.List;

import com.aditi.java8.refclass.*;
public class StatciMethodRef1 {

	 public static void print (String val)
	 {System.out.println(val);
	 }
	 public static void main (String my[])
	 {
		 
		 List<String> names=new ArrayList<String>();
		 names.add("Ram");
		 names.add("Shyam");
		 RefObject ob= new RefObject();
		 names.forEach(ob);
		 /*the lambda alternative*/
		 // names.forEach(ob -> System.out.println("name lamba::"+ob));
		 
	 }
	 
}
