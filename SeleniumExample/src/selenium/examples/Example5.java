package selenium.examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example5 {

	public static void main(String[] args) 
    {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        
        driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]/div")).click();

        driver.findElement(By.xpath("//*[@id=\"APjFqb\"]")).sendKeys("Selenium Dev naveen students from UK");
        
        String location = driver.findElement(By.xpath("/html/body/div[1]/div[6]/div[1]")).getText();
        
        System.out.println("Current Location : "+location);
        
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
    }

}
