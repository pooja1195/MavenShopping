package PageObjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Resources.PrBaseClass;

public class ItemPOM{
	WebDriver Driver;	
	private By sp = By.xpath("//a[contains(text(),'Smartphones and accessories')]");
	private By sc = By.xpath("//div[contains(text(),'Samsung Cell Phones and Smartphones')]");
	private By rd = By.xpath("//h3[contains(text(),'Read* Samsung Galaxy S20 5G - Grey - 128GB (T-Mobile) ~50761')]");
	private By ac = By.xpath("//span[contains(text(),'Add to cart')]");
	private By it = By.xpath("//span[contains(text(),'Item (1)')]");
	private By mh = By.xpath("(//a[contains(text(),'Electronics')])[2]");
	private By ip = By.xpath("//input[@aria-label='Search for anything']");
	private By sr = By.xpath("//input[@value='Search']");
	private By pr = By.xpath("(//span[contains(text(),'Apple iPhone 8 - 64GB - All Colors - T-Mobile - Good Condition')])[1]");
	private By cr = By.xpath("(//span[@class='ux-call-to-action__cell'])[4]/span");
	private By im = By.xpath("(//span[@class='text-display-span'])[34]/span/span");
	private By spr = By.xpath("//div[@class='item-price font-title-3']/span/span/span");
	private By ipr = By.xpath("(//div[@class='item-price font-title-3'])[1]/span/span/span");
	private By tpr = By.xpath("//div[@data-test-id='SUBTOTAL']/span/span/span");
	
	public ItemPOM(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		Driver = driver2;
	}
	public WebElement phones() {
		return Driver.findElement(sp);
	}
	public WebElement cell() {
		return Driver.findElement(sc);
	}
	public WebElement galaxy() {
		return Driver.findElement(rd);
	}
	public WebElement cart() {
		return Driver.findElement(ac);
	}
	public WebElement Itemadd() {
		return Driver.findElement(it);
	}
	public WebElement mhover() {
		return Driver.findElement(mh);
	}
	public WebElement iphone() {
		return Driver.findElement(ip);
	}
	public WebElement search() {
		return Driver.findElement(sr);
	}
	public WebElement product() {
		return Driver.findElement(pr);
	}
	public WebElement cart2() {
		return Driver.findElement(cr);
	}
	public WebElement item2() {
		return Driver.findElement(im);
	}
	public WebElement spr() {
		return Driver.findElement(spr);
	}
	public WebElement ipr() {
		return Driver.findElement(ipr);
	}
	public WebElement tpr() {
		return Driver.findElement(tpr);
	}
	
	
}
