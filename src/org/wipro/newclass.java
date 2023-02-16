package org.wipro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class newclass {
		
	   
	    
public static void main(String[] args) {
	
	 WebDriver driver;
			driver=new ChromeDriver();
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();

}
}
