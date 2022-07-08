package pages;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Homepage{

	private WebDriver driver;

	public Homepage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this .driver=driver;
	}
	
	public void SelectHeadphone() {
		driver.findElement(By.xpath("//span[contains(.,'Headphones')]")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	}
	
	public void SelectFirstpod() {
		driver.findElement(By.xpath("(//img[contains(@class,'self-center w-10/12 mx-auto')])[4]")).click();
		 WebElement p=driver.findElement(By.xpath("(//p[contains(.,'Duopods A25')])[2]"));
		 p.getText();
		 System.out.println(" First Headphone Selcted :"+p.getText());
	}
    public void ScrollDown() {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
	       js.executeScript("window.scrollBy(0,-350)", "");
		 
    }
    
    public void SelectSecondPod() {
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    	 driver.findElement(By.xpath("(//img[contains(@class,'self-center w-10/12 mx-auto')])[7]")).click();
         WebElement secondpod=driver.findElement(By.xpath("//p[contains(.,'DUOPODS M20')]"));
		 secondpod.getText();
		 System.out.println(" Second Headphone Selcted :"+secondpod.getText());
    }
	
    
    public void SelectThirdpod() {
    	driver.findElement(By.xpath("(//img[contains(@class,'self-center w-10/12 mx-auto')])[6]")).click();
        WebElement Thirdpod=driver.findElement(By.xpath("//p[contains(.,'DUOPODS M40')]"));
		 Thirdpod.getText();
		 System.out.println(" Third Headphone Selcted :"+Thirdpod.getText());
	
}
    
    public void SelectFourthPod() {
    	driver.findElement(By.xpath("(//img[contains(@class,'self-center w-10/12 mx-auto')])[5]")).click();
        WebElement Fourthpod=driver.findElement(By.xpath("//p[contains(.,'DUOPODS M80')]"));
		 Fourthpod.getText();
		 System.out.println(" Fourth Headphone Selcted :"+Fourthpod.getText());
    }
    
    public void Addtocart() {
    	driver.findElement(By.xpath("//span[contains(.,'Add to Cart')]")).click();
    }
    
    
    public void Checkout() {
    	driver.findElement(By.xpath("//button[contains(.,'Checkout')]")).click();
    }
    
    public void EnterPhoneNumber() {
    	driver.findElement(By.xpath("(//input[@name='phone'])[1]")).sendKeys("9999999999");
    }
    public void ClickonContinue() {
    	driver.findElement(By.xpath("(//button[contains(.,'Continue')])[1]")).click();
    }
    
    public void EnterOTP() {
    	driver.findElement(By.xpath("(//input[@type='tel'])[1]")).sendKeys("1");
    	driver.findElement(By.xpath("(//input[@type='tel'])[2]")).sendKeys("1");
    	driver.findElement(By.xpath("(//input[@type='tel'])[3]")).sendKeys("0");
    	driver.findElement(By.xpath("(//input[@type='tel'])[4]")).sendKeys("1");
    	driver.findElement(By.xpath("(//input[@type='tel'])[5]")).sendKeys("1");
    	driver.findElement(By.xpath("(//input[@type='tel'])[6]")).sendKeys("0");
    	
    	
    	
    }
    
    public void PlaceOrder() {
    	driver.findElement(By.xpath("//button[contains(.,'Place Order')]")).click();
    }
    
    public void GetPinCode() {
//    	JavascriptExecutor jse = (JavascriptExecutor)driver;
//    	jse.executeScript("window.scrollBy(0,-400)");
    	
    	Actions a = new Actions(driver);
    	//scroll down a page
    	//a.sendKeys(Keys.PAGE_DOWN).build().perform();
    	//scroll up a page
    	a.sendKeys(Keys.PAGE_UP).build().perform();
    	
    	
    	
    	
    	//((JavascriptExecutor)driver).executeScript("scroll(0,-400)");
    WebElement Pincode=	driver.findElement(By.xpath("(//input[@type='number'])[1]"));
    Pincode.getAttribute("value");
    System.out.println("Pincode is "+Pincode.getAttribute("value"));
    }
    
    public void Makepayment() {
    	driver.findElement(By.xpath("//button[contains(.,'Make Payment')]")).click();
    }
    
    public void CashonDelivery() {
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    	driver.findElement(By.xpath("//li[contains(.,'CASH ON DELIVERY')]")).click();
    }
    
    public void ClickonPlaceorder() {
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    	driver.findElement(By.xpath("(//a[contains(.,'Place Order')])[1]")).click();
    }
    
    public void secondorder() {
    	
    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
    			driver.findElement(By.xpath("(//button[@class='inline-block bg-neon-green flex flex-wrap items-center justify-center text-dark-gray uppercase text-center text-12 font-extrabold px-8 tracking-20 h-12'])[2]")).click();
    }
    
    public void GetOrderId() {
    	WebElement Orderid= driver.findElement(By.xpath("//p[@class='text-16 pb-4 border-b border-gray-200 mb-4']"));
    	//Orderid.getText();
    	
    	System.out.println("order id is =#" +Orderid.getText());
    	
    	WebElement Orderid2= driver.findElement(By.xpath("(//span[@class='font-bold'])[1]"));
    	//Orderid.getText();
    	
    	System.out.println("order id is =#" +Orderid2.getText());
    	
    	
    	
    	
    	
    	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		driver.get("https://storefront-staging.mivi.in/my-account/");
		
		
		
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		   WebElement PrOrderid =driver.findElement(By.xpath("(//p[@class='my-account-order-number font-bold pl-2'])[1]"));
		   //PrOrderid=PrOrderid.
		   System.out.println("order id on Profile page is =" +PrOrderid.getText());
    	
	   if(Orderid.equals(PrOrderid)){
	            System.out.println("Pass");
	        }
	            else {
	                System.out.println("Fail");
	            }
    	
    }
    	
    	public void ClickOnProfile() {
//    		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
//    		driver.get("https://storefront-staging.mivi.in/my-account/");
    		
    	}
    	
    	
    public void Orderidonprofile() {
//    	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
//   WebElement PrOrderid =driver.findElement(By.xpath("(//p[@class='my-account-order-number font-bold pl-2'])[1]"));
//   System.out.println("order id on Profile page is =" +PrOrderid.getText());
   
}
//    public void CompareOrderid() {
//    	
//    	if(Orderid.equals(Orderid2)){
//            System.out.println("Pass");
//        }
//            else {
//                System.out.println("Fail");
//            }
//    }
}




	


