/*  
 Avoid--> ChormeOptions  class
                  |
                  v
              "disable-notification"



*/

package Robot_class;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class AvoidNotifications {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.get("https://www.easemytrip.com/");
		

	}

}
