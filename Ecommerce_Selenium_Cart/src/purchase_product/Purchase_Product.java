package purchase_product;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Purchase_Product {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "F:\\seleniumweb_driver\\FirefoxDriver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        try {
            driver.get("http://live.techpanda.org/");
            driver.findElement(By.linkText("MY ACCOUNT")).click();
            driver.findElement(By.id("email")).sendKeys("hari@gmail.com");
            driver.findElement(By.id("pass")).sendKeys("harisuresh07");
            driver.findElement(By.id("send2")).click();
            driver.findElement(By.linkText("MY WISHLIST")).click();
    driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div[1]/form[1]/div/table/tbody/tr/td[5]/div/button/span/span")).click();
            driver.findElement(By.cssSelector("button[title='Proceed to Checkout']")).click();

            driver.findElement(By.name("billing[street][]")).clear();
            driver.findElement(By.name("billing[street][]")).sendKeys("ABC");
            driver.findElement(By.name("billing[country_id]")).sendKeys("United States");
            driver.findElement(By.name("billing[region_id]")).sendKeys("New York");
            driver.findElement(By.name("billing[city]")).sendKeys("New York");
            driver.findElement(By.name("billing[postcode]")).sendKeys("542896");
            driver.findElement(By.name("billing[telephone]")).sendKeys("12345678");

            driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[1]/div[2]/form/div/div/button/span/span")).click();

            driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[3]/div[2]/form/div[3]/button/span/span")).click();

            driver.findElement(By.xpath("//*[@id=\"p_method_checkmo\"]")).click();
            driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[4]/div[2]/div[2]/button")).click();

            driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/ol/li[5]/div[2]/div/div[2]/div/button")).click();

            String orderNumber = driver.findElement(By.xpath("//p[contains(text(),'Your order # is')]")).getText();
            System.out.println("Order placed successfully! " + orderNumber);

        } catch (Exception e) {
            e.printStackTrace();
        }
        }
    }
