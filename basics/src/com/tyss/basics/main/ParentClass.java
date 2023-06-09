package com.tyss.basics.main;

public class ParentClass {

	public ParentClass(int id, String name, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}

	public ParentClass() {
		
	}
	int id ;
	String name;
	String designation;
	double salary;
	private long accountNo;
	
	public void printName() {
		System.out.println(name);
		System.out.println(accountNo);
	}
	
	protected void printId() {
		System.out.println(id);
	}
	 void printDesignation() {
		 System.out.println(designation);
	 }
	 
	 private void printSalary() {
		System.out.println(salary);
	}

	@Override
	public String toString() {
		return "ParentClass [id=" + id + ", name=" + name + ", designation=" + designation + ", salary=" + salary + "]";
	}
	 
	 
}
