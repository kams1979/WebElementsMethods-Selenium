package WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webmethod1 {
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement element = driver.findElement(By.className("gLFyf"));
	String text = element.getText();
	System.out.println(text);
    boolean displayed = element.isDisplayed();	
    System.out.println(displayed);
    boolean enabled = element.isEnabled();
    System.out.println(enabled);
    boolean selected = element.isSelected();
    System.out.println(selected);
    String attribute = element.getAttribute("class");
	System.out.println(attribute);
	String tagName = element.getTagName();
	System.out.println(tagName);
	Point location = element.getLocation();
	System.out.println(location);
	Dimension size = element.getSize();
	System.out.println(size);
	String cssValue = element.getCssValue("input");
	System.out.println(cssValue);
	
    	}

}
