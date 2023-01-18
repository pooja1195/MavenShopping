package PageObjectmodel;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class PrCommonUtilities {
	WebDriver Driver;
	SoftAssert Assertion;
	public PrCommonUtilities(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		Driver = driver2;
	}
	
	public void softassert(String cart, String exp, String msg) {
		Assertion = new SoftAssert();
		Assertion.assertEquals(cart, exp, msg);
		Assertion.assertAll();
	}
	public void doubleassert(Double sum, Double tpr, String msg) {
		Assertion = new SoftAssert();
		Assertion.assertEquals(sum, tpr, msg);
		Assertion.assertAll();
	}
	
	public void waits(int secs, WebElement xpath) {
		WebDriverWait wb = new WebDriverWait(Driver, Duration.ofSeconds(secs));
		wb.until(ExpectedConditions.visibilityOfAllElements(xpath));
	}
	
	public void mouseh(WebElement mhover) {
		Actions a = new Actions(Driver);
		a.moveToElement(mhover).build().perform();
	}
	
	public Iterator<String> windowh() {
		Set<String> wh1 = Driver.getWindowHandles();
		Iterator<String> it1 = wh1.iterator();		
		return it1;
	}
	
	public Double price(WebElement price) {
	String pr1 = price.getText();
	String[] pr2 = pr1.split(" ");
	String pr3 = "";
	for(int i=0; i<pr2.length; i++) {
		if(pr2[i].startsWith("$") ) {
			pr3 = pr2[i].replace("$", "");
		}
	}
	System.out.println(pr3);
	Double pr4 = Double.parseDouble(pr3);
	return pr4;
	}
	
	
}
