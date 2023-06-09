package com.tyss.mycollection.arraylist;

public class Person implements Comparable<Person> {

	int id;
	String name;

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}



	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public int compareTo(Person o) {

//		return this.hashCode() - o.hashCode();  ascending order
		return o.hashCode() - this.hashCode();
//		return this.name.compareTo(o.name);
	}

}
