package com.tyss.mycollection.arraylist;

import java.util.ArrayList;
import java.util.List;

import javax.jws.soap.SOAPBinding;

public class ArrayListImpl {

	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		System.out.println("---- initial -----------");
		System.out.println(arrayList);
		System.out.println(" ---- add with index ----");
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(2, 30);
		arrayList.add(3, 40);
		arrayList.add(10);
		arrayList.add(20);
		arrayList.add(10);
		arrayList.add(20);
		System.out.println(arrayList);
		
		System.out.println(" ---- set with index and element ----- ");
		arrayList.set(2, 90);
		System.out.println(arrayList);
		
		System.out.println(" ----- subList ---- ");
		List<Integer> sublist =	arrayList.subList(1, 5);
		
		System.out.println(sublist);
		
		System.out.println(" ------- indexof and lastIndexof");
		System.out.println(arrayList.indexOf(10));
		System.out.println(arrayList.lastIndexOf(10));
		
		
		
		
	}
}
