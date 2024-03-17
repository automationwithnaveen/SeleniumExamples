package myjava.examples.advanced;

import java.util.Arrays;

public class Demo2
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
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(subjects[i]);
		}
		
		Arrays.sort(subjects);
		
		System.out.println("After Sort");
		
		for(int i=0;i<=5;i++)
		{
			System.out.println(subjects[i]);
		}
		
		System.out.println("Low Marks = "+subjects[0]);
		System.out.println("High Marks = "+subjects[5]);
	}
}
