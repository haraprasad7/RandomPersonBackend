package com.app.RandomPersonService;

import java.util.ArrayList;
import java.util.Random;

public class RandomBuilder {
	static Random rand = new Random();
	
	static String s[] = { "a" ,"b", "c","d","e,",
			"f", "g", "h", "i", "j" ,
			"k" ,"l", "m","n","o",
			"p", "q", "r", "s", "t",
			"u" ,"v", "w","x","y",
			"z"};
	public static int randomNumber(int noOfDigits) {
		if (noOfDigits <= 0) {
			return 1234;
		}
		int range = 10;
		for (int i = 1; i < noOfDigits; i++) {
			range  = range * 10;
		}
		System.out.println(range);
		int randomInt =  (int) ((Math.random() * ((range - 1) - (range/10))) + range/10);
		return randomInt;
	}
	
	public static String StringRandomName() {
		ArrayList<String> randomStrings = new ArrayList<String>();
		int randomIntFirstName =  (int) ((Math.random() * (9 - 2)) + 2);
		int randomIntLastName = (int) ((Math.random() * (9 - 2)) + 2);
		for (int i = 0 ; i < randomIntFirstName ; i++) {
			randomStrings.add(RandomBuilder.s[rand.nextInt(25)]);
		}
		randomStrings.add(" ");
		for (int i = 0 ; i < randomIntLastName ; i++) {
			randomStrings.add(RandomBuilder.s[rand.nextInt(25)]);
		}
		StringBuffer sb = new StringBuffer();
	      
	      for (String s : randomStrings) {
	         sb.append(s);
	      }
	      String str = sb.toString();
	      return str;
	}
	
	public static String RandomAddress() {
		ArrayList<String> randomStrings = new ArrayList<String>();
		int address1 =  (int) ((Math.random() * (9 - 2)) + 2);
		int address2 = (int) ((Math.random() * (9 - 2)) + 2);
		int address3 = (int) ((Math.random() * (9 - 2)) + 2);
		int address4 = (int) ((Math.random() * (9 - 2)) + 2);
		for (int i = 0 ; i < address1 ; i++) {
			randomStrings.add(RandomBuilder.s[rand.nextInt(25)]);
		}
		randomStrings.add(" ");
		for (int i = 0 ; i < address2 ; i++) {
			randomStrings.add(RandomBuilder.s[rand.nextInt(25)]);
		}
		randomStrings.add(" ");
		for (int i = 0 ; i < address3 ; i++) {
			randomStrings.add(RandomBuilder.s[rand.nextInt(25)]);
		}
		randomStrings.add(" ");
		randomStrings.add(" ");
		for (int i = 0 ; i < address4 ; i++) {
			randomStrings.add(RandomBuilder.s[rand.nextInt(25)]);
		}
		StringBuffer sb = new StringBuffer();
	      
	      for (String s : randomStrings) {
	         sb.append(s);
	      }
	      String str = sb.toString();
	      return str;
	}
	
	public static int randomAge() {
		return RandomBuilder.rand.nextInt(99);
	}
	
	public static String randomSex() {
		String sex[] = {"Male", "Female", "other" };
		return sex[RandomBuilder.rand.nextInt(2)];
	}

}
