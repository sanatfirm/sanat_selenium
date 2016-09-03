import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class LogOut extends YahooLoginLogout {
@Test
public void logout()
{
	driver=new FirefoxDriver();
	driver.findElement(By.xpath("")).click();
	driver.navigate().back();
}

}
