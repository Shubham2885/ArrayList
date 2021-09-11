package com.bz.arraylistdemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> arrayList = new ArrayList<String>();
		
		arrayList.add("1");
		arrayList.add("2");
		System.out.println(arrayList.add("3"));
		arrayList.add("4");
		arrayList.add("5");
		
				
		for(String string : arrayList) {
			System.out.println("List of content :: "+string);
		}
		
		arrayList.forEach(string ->{
			System.out.println("Content :: "+string);
		});
		
		System.out.println(arrayList.contains("7"));
		
		System.out.println(arrayList.get(2));
		
		System.out.println("Newly added ");
	}
}
