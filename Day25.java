//Robot class
package Robot_class;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class QspidersDemo {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// open the browser
		ChromeDriver driver = new ChromeDriver();

		// maximize the browser
		driver.manage().window().maximize();

		// waiting condition
		Thread.sleep(2000);

		// enter the dws page
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='block w-[100%] h-full']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//ul[@class='pt-2 pe-1']/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//section[@class='pt-4 flex flex-col items-center']/a")).click();
		Thread.sleep(2000);

		Robot r = new Robot();

		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);

		r.keyPress(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_D);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_ENTER);

		
		r.keyRelease(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
		
//		
//		String expected_url = "https://demoapps.qspiders.com/";
//		String actual_url = driver.getCurrentUrl();
//		if(!expected_url.equals(actual_url)) {
//			driver.navigate().back();
//		}
		
		Thread.sleep(2000);
		driver.quit();


	}

}
