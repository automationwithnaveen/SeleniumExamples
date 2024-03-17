package myjava.examples.advanced;

public class Demo5 {

	public static void main(String[] args) 
	{
		String x = "Ravi";
		String y = "Ravi";
		
		if(x == y)
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
		
		System.out.println("======================");
		
		String a = new String("Ravi");
		
		String b = new String("Ravi");
		
		if(a == b)
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}

		System.out.println("======================");
		
		if(a.equals(b))
		{
			System.out.println("Both are same");
		}
		else
		{
			System.out.println("Both are not same");
		}
	}

}
