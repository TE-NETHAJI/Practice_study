package com.tyss.mycollection.arraylist;

public class Student implements Comparable<Student>{
	int id;
	String name;
	int standard;
	double marks;

	public Student() {
		super();
	}

	public Student(int id, String name, int standard, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.standard = standard;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", standard=" + standard + ", marks=" + marks + "]";
	}

	@Override
	public int hashCode() {
		return this.id;
	}

	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		return this.hashCode() == student.hashCode();
	}
	
	@Override
	public int compareTo(Student o) {
		return this.hashCode()-o.hashCode();
	}

}
