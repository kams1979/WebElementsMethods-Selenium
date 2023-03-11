package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement1 {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.search.yahoo.com/?fr2=inr");
		WebElement element = driver.findElement(By.className("text"));
		element.click();
		Thread.sleep(2000);
		WebElement element2 = driver.findElement(By.name("username"));
		element2.sendKeys("kamatchi_rajarun@yahoo.co.in");
		WebElement element3 = driver.findElement(By.id("login-signin"));
		element3.click();
		String text = element3.getText();
		System.out.println(text);
		boolean displayed = element3.isDisplayed();
		System.out.println(displayed);
		boolean enabled = element3.isEnabled();
		System.out.println(enabled);
		boolean selected = element3.isSelected();
		System.out.println(selected);
		String attribute = element2.getAttribute("name");
		System.out.println(attribute);
		String tagName = element2.getTagName();
		System.out.println(tagName);
		Point location = element3.getLocation();
		System.out.println(location);
		Dimension size = element3.getSize();
		System.out.println(size);
		String cssValue = element3.getCssValue("input");
		System.out.println(cssValue);
		
		
		
		
		
		
		
	}

}
