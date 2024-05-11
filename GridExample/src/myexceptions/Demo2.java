package myexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2
{
	public void readInput()
	{
		int no1,no2;
		Scanner input = new Scanner(System.in);
		try
		{
			System.out.println("Enter 1st Number : ");
			no1 = input.nextInt(); 
			System.out.println("Enter 2nd Number : ");
			no2 = input.nextInt(); 
			calc(no1,no2);
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Please Enter Integers only...!");
		}
		catch(ArithmeticException ae)
		{
			//System.out.println(ae.getMessage());
			System.out.println("Please don't / By Zero");
		}
	}
	
	public void calc(int no1,int no2)
	{
		System.out.println("Sum "+(no1+no2));
		if(no2 == 0)
		{
			throw new ArithmeticException();
		}
		System.out.println("Div "+(no1/no2));
		System.out.println("Mul "+(no1*no2));
		System.out.println("Sub "+(no1-no2));
	}

	public static void main(String n[])
	{
		Demo2 d = new Demo2();
		d.readInput();
	}
}
