package myexceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) 
	{
		// a simple cal 
		// cal operations like : + ,- , * and /
		
		
		int no1,no2;
		
		Scanner input = new Scanner(System.in);
		
		try
		{
			System.out.println("Enter 1st Number : ");
			no1 = input.nextInt(); // 10
			System.out.println("Enter 2nd Number : ");
			no2 = input.nextInt(); // two
		
			System.out.println("Sum "+(no1+no2));
		
			try
			{
				System.out.println("Div "+(no1/no2));
			}
			catch(ArithmeticException ae)
			{
				//System.out.println(ae.getMessage());
				System.out.println("Please don't / By Zero");
			}
		
			System.out.println("Mul "+(no1*no2));
			System.out.println("Sub "+(no1-no2));
		
		}
		catch(InputMismatchException ime)
		{
			System.out.println("Please Enter Integers only...!");
		}
		
		System.out.println("Thanks You");

	}

}
