package selenium_ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class EcommerceWishlistShare {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\seleniumweb_driver\\FirefoxDriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        try 
        {
            driver.get("http://live.techpanda.org/");
            driver.findElement(By.xpath("/html/body/div/div/header/div/div[2]/div/a/span[2]")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("/html/body/div/div/header/div/div[5]/div/ul/li[5]/a")).click();
            Thread.sleep(2000);

            driver.findElement(By.id("firstname")).sendKeys("Hari");
            driver.findElement(By.id("lastname")).sendKeys("Suresh");
            String email = "hari" + System.currentTimeMillis() + "@test.com";
            driver.findElement(By.id("email_address")).sendKeys(email);
            driver.findElement(By.id("password")).sendKeys("Test@123");
            driver.findElement(By.id("confirmation")).sendKeys("Test@123");

            driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/form/div[2]/button")).click();
            Thread.sleep(3000);

            driver.findElement(By.xpath("/html/body/div/div/header/div/div[3]/nav/ol/li[2]/a")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div[1]/div[2]/ul/li[1]/div/h2/a")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/form/div[4]/div/ul[1]/li[1]/a")).click();
            Thread.sleep(2000);

            driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/form[1]/div/div/button[1]/span/span")).click();
            Thread.sleep(2000);

            driver.findElement(By.id("email_address")).sendKeys("friend@test.com");
            driver.findElement(By.id("message")).sendKeys("Please check my wishlist.");
            Thread.sleep(1000);

            driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div[2]/button")).click();
            Thread.sleep(2000);

            WebElement successMsg = driver.findElement(By.cssSelector(".success-msg"));
            System.out.println("Confirmation: " + successMsg.getText());

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Thread.sleep(2000);
        }

	}

}
