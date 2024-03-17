package myjava.examples.advanced;

public class Demo1 {

	public static void main(String[] args) 
	{
		// 1 Student -- 6 subjects
		
		int sub1,sub2,sub3,sub4,sub5,sub6;
		
		sub1 = 90;
		sub2 = 90;
		sub3 = 9;
		sub4 = 99;
		sub5 = 90;
		sub6 = 45;
		
		// Total marks
		// high
		// low
		// Average 
		
		int total = sub1+sub2+sub3+sub4+sub5+sub6;
		System.out.println("Total Marks = "+total);
		
		
		int high = 0;
		
		if(high <= sub1)
		{
			high = sub1;
		}
		
		if(high <= sub2)
		{
			high = sub2;
		}
		
		if(high <= sub3)
		{
			high = sub3;
		}
		
		if(high <= sub4)
		{
			high = sub4;
		}
		
		if(high <= sub5)
		{
			high = sub5;
		}
		
		if(high <= sub6)
		{
			high = sub6;
		}
		
		System.out.println("High Score = "+high);
	}

}
