import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class LogIn extends YahooLoginLogout {
	@Test
	public void login()
	{
		driver=new FirefoxDriver();
		driver.get("https://yahoo.com");
		driver.findElement(By.xpath("")).sendKeys("sanat.choudhury@yahoo.com");
		driver.findElement(By.xpath("")).sendKeys("sanat0339@");
		driver.findElement(By.xpath("")).click();
	}

}
