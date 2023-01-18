package PrShopping;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import PageObjectmodel.ItemPOM;
import PageObjectmodel.PrCommonUtilities;
import Resources.PrBaseClass;
import Resources.PrTestData;

public class PrShoppingTest extends PrBaseClass{
	@Test
	public void ebay() throws InterruptedException, IOException {
		url();
		
//		Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Driver.manage().window().maximize();		
		
		ItemPOM ipom = new ItemPOM(Driver);
		PrCommonUtilities cu = new PrCommonUtilities(Driver);
		
		WebElement mhover = ipom.mhover();
		cu.mouseh(mhover);
		
		cu.waits(5, ipom.phones());
		ipom.phones().click();
		ipom.cell().click();
		ipom.galaxy().click();
		
		Iterator<String> it = cu.windowh();
		String parent = it.next();
		String child = it.next();
		Driver.switchTo().window(child);
		
		ipom.cart().click();
		
		String cart = ipom.Itemadd().getText();
		String exp = PrTestData.exp;
		String msg = PrTestData.msg;
		cu.softassert(cart, exp, msg);
		System.out.println(PrTestData.Fmsg1);
		
//price store		
		Double pr4 = cu.price(ipom.spr());		
				
//adding another item
		ipom.iphone().sendKeys(PrTestData.iphone);
		ipom.search().click();
		ipom.product().click();
		
		Iterator<String> it1 = cu.windowh();
		String grand = it1.next();
		String subparent = it1.next();
		String subchild = it1.next();
		
		Driver.switchTo().window(subchild);
		ipom.cart2().click();
		String item2 = ipom.item2().getText();
		String exp2 = PrTestData.exp2;
		String msg2 = PrTestData.msg;
		
		cu.softassert(item2, exp2, msg2);
		System.out.println(PrTestData.Fmsg2);
		
		Double ipr4 = cu.price(ipom.ipr());	

//total price
		
		Double tpr4 = cu.price(ipom.tpr());
		Double Sum = pr4 + ipr4;
		String fmsg = PrTestData.fmsg;
		cu.doubleassert(Sum, tpr4, fmsg);
		Driver.quit();
	}
}

