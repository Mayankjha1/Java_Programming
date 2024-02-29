package GGPoker_Ireland;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Membership {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // This will redirect to this link
        driver.get("https://nsus.my.site.com/clubgg/s/");
        System.out.println("We have reached the destination");
        Thread.sleep(3000);

        //This is the code for finding Membership
        WebElement Membership = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div/c-g-g-poker-navbar-ireland/div/div[1]/div[2]/ul/li[2]/p"));
        Membership.click();
        System.out.println("Clicked on Membership");

        Thread.sleep(2000);
        WebElement Platinum = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[1]/ul/li[2]/ul/li[1]"));
        Platinum.click();
        System.out.println("Platinum has been clicked");

        Thread.sleep(2000);
        WebElement Platinum_Art = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[2]/c-data-tablefor-categories-_-ireland/div/table/tbody/tr[2]/td/p"));
        Platinum_Art.click();
        System.out.println("Platinum Article has been clicked");

        Thread.sleep(2000);
        WebElement Standard = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[1]/ul/li[2]/ul/li[2]"));
        Standard.click();
        System.out.println("Standard has been clicked");

        Thread.sleep(2000);
        WebElement Other_Membership_Queries = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[1]/ul/li[2]/ul/li[3]"));
        Other_Membership_Queries.click();
        System.out.println("Other Membership Queries has been clicked");

        Thread.sleep(2000);
        WebElement Other_Membership_Queries_Art = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[2]/c-data-tablefor-categories-_-ireland/div/table/tbody/tr[3]/td/p"));
        Other_Membership_Queries_Art.click();
        System.out.println("Other Membership Queries Article has been clicked");


        System.out.println("All the test cases are automated Successfully !!!!");
        Thread.sleep(15000);
        driver.quit();

    }
}
