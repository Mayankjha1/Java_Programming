package GGPoker_Ireland;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Logo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // This will redirect to this link
        driver.get("https://nsus.my.site.com/clubgg/s/");
        System.out.println("We have reached the destination");
        Thread.sleep(5000);

        // This is for hover
        WebElement logo = driver.findElement(By.xpath("//img[@alt='My Image']"));
        Actions action = new Actions(driver);
        action.moveToElement(logo).perform();
        System.out.println("hover is working fine !!");

        //Wait for 5 Second
        Thread.sleep(5000);
        driver.quit();
    }
}
