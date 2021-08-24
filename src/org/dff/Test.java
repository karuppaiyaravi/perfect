package org.dff;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test extends baseClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		BrowerLunch();
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("balafact");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("balafact007");
driver.findElement(By.xpath("//input[@id='login']")).click();
WebElement location = driver.findElement(By.xpath("//select[@id='location']"));
location.click();

Robot r=new Robot();
r.keyPress(KeyEvent.VK_L);
r.keyRelease(KeyEvent.VK_L);
WebElement hotels = driver.findElement(By.xpath("//select[@id='hotels']"));
hotels.click();
Actions a=new Actions(driver);

a.moveToElement(hotels).perform();
r.keyPress(KeyEvent.VK_H);
r.keyRelease(KeyEvent.VK_H);
WebElement roomType = driver.findElement(By.xpath("//select[@id='room_type']"));
r.keyPress(KeyEvent.VK_S);
r.keyRelease(KeyEvent.VK_S);
WebElement child = driver.findElement(By.xpath("//select[@id='child_room']"));
r.keyPress(KeyEvent.VK_2);
r.keyRelease(KeyEvent.VK_2);
WebElement search = driver.findElement(By.xpath("//input[@id='Submit']"));
search.click();
driver.findElement(By.xpath("//input[@id='radiobutton_3']")).click();
driver.findElement(By.xpath("//input[@id='continue']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("vel");
driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("raj");
driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("aundipatty,Theni(dt)");
driver.findElement(By.xpath("//input[@id='cc_num']")).sendKeys("9677306943567687");
WebElement cardDetails= driver.findElement(By.xpath("//select[@id='cc_type']"));
cardDetails.click();
r.keyPress(KeyEvent.VK_V);
r.keyRelease(KeyEvent.VK_V);
WebElement month = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
month.click();
r.keyPress(KeyEvent.VK_M);
r.keyRelease(KeyEvent.VK_M);
WebElement year = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
year.click();
r.keyPress(KeyEvent.VK_2);
r.keyPress(KeyEvent.VK_2);
r.keyPress(KeyEvent.VK_2);
r.keyPress(KeyEvent.VK_2);
r.keyPress(KeyEvent.VK_2);
r.keyPress(KeyEvent.VK_2);
r.keyPress(KeyEvent.VK_2);
r.keyPress(KeyEvent.VK_2);
r.keyPress(KeyEvent.VK_2);
r.keyRelease(KeyEvent.VK_2);
driver.findElement(By.xpath("//input[@id='cc_cvv']")).sendKeys("456");
driver.findElement(By.xpath("//input[@id='book_now']")).click();
Thread.sleep(5000);
WebElement orderId = driver.findElement(By.xpath("//input[@id='order_no']"));
String attribute = orderId.getAttribute("value");
System.out.println(attribute);












	
	}

}
