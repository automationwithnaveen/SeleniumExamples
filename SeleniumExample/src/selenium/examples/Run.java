package selenium.examples;

public class Run {

	public static void main(String[] args)throws InterruptedException
	{
		Example7 ex = new Example7();
		ex.signUp();
		ex.loginCheck();
		ex.products();
		ex.pricing();
	}

}
