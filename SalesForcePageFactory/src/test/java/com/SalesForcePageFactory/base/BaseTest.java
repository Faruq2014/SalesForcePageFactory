	package com.SalesForcePageFactory.base;
	
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Properties;
	import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.AfterSuite;
	import org.testng.annotations.BeforeSuite;
	
	import io.github.bonigarcia.wdm.WebDriverManager;
	
	public class BaseTest {
	public static WebDriver driver;
	
	public static Properties config= new Properties();
	public static FileInputStream fis;
	public static String projectPath=System.getProperty("user.dir");
	public static String browser;//may be we do not need
	public static Logger log=LogManager.getLogger(BaseTest.class);
	@BeforeSuite
	public void setUp() {
		if (driver==null) {
			try {
				fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\properties\\Config.properties");
			log.info("properties path loaded. add something");
			} catch (FileNotFoundException e) {
			
				e.printStackTrace();
			}
	
			try {
				config.load(fis);
			} catch (IOException e) {
		
				e.printStackTrace();
			}
		}
		
		if (config.getProperty("browser").equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup(); 
			driver = new ChromeDriver();
			log.info("chrome browser loaded add something");
				
		}else if (config.getProperty("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
			driver = new FirefoxDriver();
			log.info("chrome browser loaded add something");
		}
		
		driver.get(config.getProperty("url"));
		log.warn("Salesforce open");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getProperty("implicit.wait")), TimeUnit.SECONDS);
		
	}
	 @AfterSuite
	public void tearDown() {
		if (driver!=null) {
		driver.quit();
		log.info("driver close add something");
		}
	}
	
	}
