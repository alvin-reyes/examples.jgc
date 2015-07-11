package com.jgc.main;

import java.io.FileInputStream;
import java.io.IOException;

public class TryCatchSample {

	private static void printFileJava7() throws IOException {

	    try(FileInputStream input = new FileInputStream("file.txt")) {

	        int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
	    }
	}
	
	private static void myAutoClosable() throws Exception {

	    try(MyAutoClosable myAutoClosable = new MyAutoClosable()){
	        myAutoClosable.doIt();
	    }
	}
	
}
