package com.tyss.basics.sub;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.sound.midi.Soundbank;

public class MyInterfaceImpl implements MyInterface{
	
	static MyInterface interface1 = new MyInterfaceImpl();
//	public static void main(String[] args) throws FileNotFoundException {
////		MyInterface.name();
////		interface1.getName();
////		String str = null;
////		str.length();
//		
//		FileReader fileReader = new FileReader("");
//		}
	
	public void getData() throws IOException  {
		FileInputStream fileInputStream = new FileInputStream("src/demo.txt");
		System.out.println(fileInputStream);
		
		int i = fileInputStream.read();
		while (i !=-1) {
		System.out.print((char) i);
		i = fileInputStream.read();	
		}
	}
}
