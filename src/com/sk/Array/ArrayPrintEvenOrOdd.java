package com.sk.Array;

import java.util.HashMap;
import java.util.Map;

public class ArrayPrintEvenOrOdd {

	  public static void main(String[] args) {
		    int eCount=0;
		    int oCount=0;
			int[] arr = { 2, 5, 8, 6, 9, 4 };
      Map<String, Integer> map=new HashMap<>(); 
			for(int a:arr) {
				if(a%2==0) eCount++;
				if(a%2==1) oCount++;
			}
			
			map.put("Event", eCount);
			map.put("Odd", oCount);
	  System.out.println(map);
	}
}
