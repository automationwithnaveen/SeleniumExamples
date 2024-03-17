package myjava.examples.advanced;

import java.util.Arrays;

public class Demo4 {

	public static void main(String[] args) 
	{
		
		int [] subjects = {90,89,9,19,30,45};
		
		System.out.println(" Average = "+Arrays.stream(subjects).average());
		
		System.out.println("Total = "+Arrays.stream(subjects).sum());

	}

}
