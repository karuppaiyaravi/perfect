package org.dff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class baseClass {

public WebDriver driver;
public static void BrowerLunch() {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\heardstoper\\eclipse-workspace\\Selenium\\src\\driver\\chromedriver.exe");
WebDriver driver  =new ChromeDriver();

}
}
