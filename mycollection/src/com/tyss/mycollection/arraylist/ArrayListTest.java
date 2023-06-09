package com.tyss.mycollection.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();

		arrayList.add(10);
		arrayList.add(90);
		arrayList.add(50);
		arrayList.add(30);
		arrayList.add(20);

		System.out.println(" ------ for loop -------");

		for (int k = 0; k < arrayList.size(); k++) {
			System.out.println(arrayList.get(k));
		}

		System.out.println(" ---- for each loop ----- ");
		for (Integer object : arrayList) {
			System.out.println(object);
		}

		System.out.println(" --- Iterator --------");

		Iterator<Integer> iterator = arrayList.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());

		}

		System.out.println(" --------  List Iterator (Forward) ------");

		ListIterator<Integer> listIterator = arrayList.listIterator();
		
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		
		System.out.println(" ---- List Iterator (Backwards) ------------");
		
		ListIterator<Integer> listIterator2 = arrayList.listIterator(arrayList.size());
		
		while(listIterator2.hasPrevious()) {
			System.out.println(listIterator2.previous());
		}
		
		System.out.println(" before sort");
		System.out.println(arrayList);
		System.out.println("After Sort");
		Collections.sort(arrayList);
		System.out.println(arrayList);
	}
}
