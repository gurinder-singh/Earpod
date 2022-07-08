package testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Homepage;

public class EarPod {
	
	public String baseUrl = "https://storefront-staging.mivi.in";
    String driverPath = "C:\\Users\\Dell\\Downloads\\chromedriver.exe";
    public WebDriver driver ; 
     
     @BeforeTest
      public void launchBrowser() {
          System.out.println("launching firefox browser"); 
          System.setProperty("webdriver.chrome.driver", driverPath);
          driver = new ChromeDriver();
          driver.get(baseUrl);
          driver.manage().window().maximize();
      }
      @Test
      public void GetOrderId() {
    	  Homepage home = new Homepage(driver);
  		home.SelectHeadphone();
  		home.SelectFirstpod();
  		home.ScrollDown();
  		home.Addtocart();
  		home.SelectHeadphone();
  		home.ScrollDown();
  		home.SelectSecondPod();
  		
  		home.ScrollDown();
  		home.Addtocart();
  		home.SelectHeadphone();
  		home.ScrollDown();
  		home.SelectThirdpod();
  		home.ScrollDown();
  		home.Addtocart();
  		home.SelectHeadphone();
  		home.ScrollDown();
  		home.SelectFourthPod();
  		home.ScrollDown();
  		home.Addtocart();
  		home.Checkout();
  		home.ScrollDown();
  		home.EnterPhoneNumber();
  		home.ClickonContinue();
  		home.EnterOTP();
  		home.ClickonContinue();
  		home.ScrollDown();
  		home.PlaceOrder();
  		home.GetPinCode();
  		home.ScrollDown();
  		home.Makepayment();
  		home.ScrollDown();
  		home.CashonDelivery();
  		home.ClickonPlaceorder();
  		
  		home.secondorder();
  		home.GetOrderId();
     }
      @AfterTest
      public void terminateBrowser(){
          driver.close();
      }

}
