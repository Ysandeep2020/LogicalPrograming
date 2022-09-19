package com.sk.java8;

import java.util.stream.IntStream;

public class Print1To100 {

	public static void main(String[] args) {
		//print 1 to 100   with the help of range()  and rangeClosed()
   	 
  	  IntStream.rangeClosed(1, 100).forEach( val ->{
  		 System.out.print(val+" ");  
  		 
  	  });
  	  
	}
}
