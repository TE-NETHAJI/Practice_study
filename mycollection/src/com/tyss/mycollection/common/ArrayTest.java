package com.tyss.mycollection.common;

public class ArrayTest {
	public static void main(String[] args) {
		
		MyArrayList array = new MyArrayList(8);
		System.out.println(array.size()); //0
		int a = 10;
		array.add(a);
		array.add(20);
		array.add("pavan");
		array.add(true);
	
		array.add(20);
		array.add(null);
		System.out.println(array);
		System.out.println("--------------------");
		System.out.println(array.get(3));
		System.out.println("------------------");
		array.set(0, 60);
		System.out.println(array);
		array.remove(1);
		System.out.println("------- after remove --------------");
		System.out.println(array);
		System.out.println(array.get(1));
		System.out.println(array.size()); //3
		
	}
}
