package myjava.examples.advanced;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Demo3 
{
	public static void main(String[] args) 
	{
		// 1 Student -- 6 subjects
	
		
		int [] subjects = new int[6];
		
		subjects[0] = 90;
		subjects[1] = 89;
		subjects[2] = 9;
		subjects[3] = 99;
		subjects[4] = 90;
		subjects[5] = 45;
		
		System.out.println(" Average = "+Arrays.stream(subjects).average());
		
		System.out.println("Total = "+Arrays.stream(subjects).sum());
		
		
		
	}
}

