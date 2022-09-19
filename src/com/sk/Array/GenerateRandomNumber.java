package com.sk.Array;

import java.util.Random;

public class GenerateRandomNumber {
	public static void main(String[] args) {
		// Generate Random Number
		Random random = new Random();
		// four digit
		// int nextInt = random.nextInt(999)+1000;
		
		// six digit
		int rand = random.nextInt(99999) + 100000;
		          
		// random String Generator
                    String string = random.toString();	
                    System.out.println(string);
		
       //   Apache commons lang  api  for 
          //1. Random Number
     //   String int=  RandomStringUtils.randomNumber(count);
        
            //2. random String
      //    String str =RandomStringUtils.randomAlphbetic(count);
          
	}
}
