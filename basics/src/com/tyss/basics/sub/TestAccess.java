package com.tyss.basics.sub;

import java.io.IOException;

import com.tyss.basics.main.ParentClass;

public class TestAccess{
	public static void main(String[] args) throws IOException {
//		TestAccess class1  = new TestAccess();
//		class1.printId();
//		
//		MyInterfaceImpl impl = new MyInterfaceImpl();
//		impl.getData();
		
		try {
			int a =0;
			int b =10;
			System.out.println(b/a);
			SubClass class1 = new SubClass();
			ParentClass class2 = new ParentClass();
			
			
		}
		finally {
			System.out.println("finally block");
			System.out.println();
		}
	}
}
