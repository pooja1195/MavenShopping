package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrBaseClass {
	public WebDriver Driver;
	public Properties prop;
	
	public void initializeDriver() throws IOException {
	FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Prdata.properties");
	prop = new Properties();
	prop.load(fis);
	String browsername = prop.getProperty("browser");
	String url = prop.getProperty("url");
	
	if(browsername.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		Driver = new ChromeDriver();
	}
	else if (browsername.equalsIgnoreCase("edge")) {
		//code
		}
	else if (browsername.equalsIgnoreCase("Internetexplorer")) {
		//code
		}
	}
	
	public void url() throws IOException {
		initializeDriver();
		String url = prop.getProperty("url");
		Driver.get(url);
	}
	
}
