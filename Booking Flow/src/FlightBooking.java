import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightBooking {

	
	public String bookFlight() throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Work\\Chromedriver\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://caasco-test3.eysys.com/");
		driver.findElement(By.className("eysys-plane")).click();
		driver.findElement(By.id("one-way")).click();*/
		
		// In case, departure destination has to be cleared
		/*WebElement toClear = driver.findElement(By.id("flights-departing-from"));
		toClear.sendKeys(Keys.CONTROL + "a");
		toClear.sendKeys(Keys.DELETE);*/
		
		/*driver.findElement(By.id("flights-arriving-at")).sendKeys("Seattle (SEA), Seattle Tacoma Intl, United States",Keys.ARROW_DOWN);*/
		
		/*driver.get("https://caasco-test3.eysys.com/search-flights?completeJourney=true&journeyType=ONE_WAY&thisLeg=0&departure=Lester+B+Pearson+Intl&departurefull=Toronto+%28YYZ%29%2C+Lester+B+Pearson+Intl%2C+Canada&destination=Seattle+Tacoma+Intl&destinationfull=Seattle+%28SEA%29%2C+Seattle+Tacoma+Intl%2C+United+States&depdate=Jul-25-19&adults=1&children=0&cabinClass=Any");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//main[@id='content']/div[2]/div[2]/div/form/div[2]/div[2]/div[2]/div[3]/div[4]/div[2]/div[2]/div[2]/a/span"));*/
		
		  driver.get("https://caasco-test3.eysys.com/search-flights?completeJourney=true&journeyType=ONE_WAY&thisLeg=0&departure=Lester+B+Pearson+Intl&departurefull=Toronto+(YYZ)%2C+Lester+B+Pearson+Intl%2C+Canada&destination=Seattle+Tacoma+Intl&destinationfull=Seattle+(SEA)%2C+Seattle+Tacoma+Intl%2C+United+States&depdate=Jul-31-19&retdate=Aug-07-19&adults=1&children=0&cabinClass=Any&sort=price%2Casc");
          String actualTitle="https://caasco-test3.eysys.com/search-flights?completeJourney=true&journeyType=ONE_WAY&thisLeg=0&departure=Lester+B+Pearson+Intl&departurefull=Toronto+(YYZ)%2C+Lester+B+Pearson+Intl%2C+Canada&destination=Seattle+Tacoma+Intl&destinationfull=Seattle+(SEA)%2C+Seattle+Tacoma+Intl%2C+United+States&depdate=Jul-31-19&retdate=Aug-07-19&adults=1&children=0&cabinClass=Any&sort=price%2Casc";
          actualTitle=driver.getTitle();
          String url=driver.getCurrentUrl();
          System.out.println(url);
          String expectedTitle=actualTitle;
          if(actualTitle.contentEquals(expectedTitle)){
              System.out.println("Test pass");
          }
          else{
              System.out.println("Test fail");
          }
          Thread.sleep(10000);
          driver.findElement(By.cssSelector("div.incntrq-travel-site:nth-child(2) div.wrapper div.body-container div.row div.col-sm-8 div.panel.panel-md:nth-child(3) div.page-box div.row:nth-child(2) div.col-xs-6.text-right:nth-child(2) > a.btn.btn-primary.clearfix")).click();
          Thread.sleep(60000);
          driver.findElement(By.id("email")).sendKeys("gatha.kumar@inspiretec.com",Keys.TAB);
          driver.findElement(By.id("email-confirm")).sendKeys("gatha.kumar@inspiretec.com",Keys.TAB);
          driver.findElement(By.id("contact")).sendKeys("6478912345",Keys.TAB);
          driver.findElement(By.xpath("//*[@id=\"firstName-0\"]")).sendKeys("Tester",Keys.TAB);
          driver.findElement(By.xpath("//*[@id=\"middleName-0\"]")).sendKeys("GK",Keys.TAB);
          driver.findElement(By.xpath("//*[@id=\"lastName-0\"]")).sendKeys("Test",Keys.TAB);
          driver.findElement(By.xpath("//*[@id=\"dob-month-0\"]")).sendKeys("May",Keys.TAB);
          driver.findElement(By.xpath("//*[@id=\"dob-day-0\"]")).sendKeys("20",Keys.TAB);
          driver.findElement(By.xpath("//*[@id=\"dob-year-0\"]")).sendKeys("1992",Keys.TAB);
          driver.findElement(By.xpath("//*[@id=\"nationality-0\"]")).sendKeys("Canada",Keys.TAB);
          driver.findElement(By.xpath("//*[@id=\"gender-0\"]")).sendKeys("Male",Keys.TAB);
          driver.findElement(By.xpath("//*[@id=\"reject-insurance\"]")).click();
          driver.findElement(By.xpath("//button[@class='btn btn-primary pull-right']")).click();
          driver.findElement(By.xpath("//*[@id=\"card-type\"]")).sendKeys("Visa",Keys.TAB);
          driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("Gatha Again",Keys.TAB);
          
          Thread.sleep(3000);


          new WebDriverWait(driver, 20).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//*[@id=\"hpci-iframe-1\"]")));
          WebElement card = driver.findElement(By.id("ccNum"));
          card.click();
          card.sendKeys("4111111111111111");
          WebElement cvv = driver.findElement(By.id("ccCVV"));
          cvv.click();
          cvv.sendKeys("123");
          
          
          driver.switchTo().parentFrame();
          
                    
          driver.findElement(By.id("expiry-month")).sendKeys("08",Keys.TAB);
          driver.findElement(By.id("expiry-year")).sendKeys("2023",Keys.TAB);
          driver.findElement(By.id("address1")).sendKeys("Graymalkin Lane",Keys.TAB);
          driver.findElement(By.id("city")).sendKeys("Toronto",Keys.TAB);
          //driver.findElement(By.xpath("//*[@id=\"province\"]")).sendKeys("Alberta",Keys.TAB);
          
        
          Thread.sleep(3000);
          driver.findElement(By.id("postal-code")).sendKeys("A1A 1A1",Keys.TAB);
          driver.findElement(By.id("country-of-residence")).sendKeys("Canada",Keys.TAB);
          
          driver.findElement(By.xpath("//button[@class='btn btn-primary mt-sm-md']")).click();
        
          return "Pass";

}
}
