package GGPoker_Ireland;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clubs_And_Unions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // This will redirect to this link
        driver.get("https://nsus.my.site.com/clubgg/s/");
        System.out.println("We have reached the destination");
        Thread.sleep(3000);

        Thread.sleep(2000);
        WebElement Clubs_And_Unions = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div/c-g-g-poker-navbar-ireland/div/div[1]/div[2]/ul/li[3]/p"));
        Clubs_And_Unions.click();
        System.out.println("Clubs and union has been clicked");

        Thread.sleep(2000);
        WebElement Clubs = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[1]/ul/li[3]/ul/li[1]"));
        Clubs.click();
        System.out.println("Clubs has been clicked");

        Thread.sleep(2000);
        WebElement Clubs_Art = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[2]/c-data-tablefor-categories-_-ireland/div/table/tbody/tr[3]/td/p"));
        Clubs_Art.click();
        System.out.println("Clubs Article has been clicked");

        Thread.sleep(2000);
        WebElement Unions = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[1]/ul/li[3]/ul/li[2]"));
        Unions.click();
        System.out.println("Unions has been clicked");

        Thread.sleep(2000);
        WebElement Unions_Art = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[2]/c-data-tablefor-categories-_-ireland/div/table/tbody/tr[2]/td/p"));
        Unions_Art.click();
        System.out.println("Unions Article has been clicked");

        Thread.sleep(2000);
        WebElement Other_Club_Queries = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[1]/ul/li[3]/ul/li[3]"));
        Other_Club_Queries.click();
        System.out.println("Other clubs Queries has been clicked");

        Thread.sleep(2000);
        WebElement Other_Club_Queries_Art = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[2]/c-data-tablefor-categories-_-ireland/div/table/tbody/tr[4]/td/p"));
        Other_Club_Queries_Art.click();
        System.out.println("Other clubs Queries Articles has been clicked");

        Thread.sleep(2000);
        WebElement Other_Union_Queries = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[1]/ul/li[3]/ul/li[4]"));
        Other_Union_Queries.click();
        System.out.println("Other Union Queries has been clicked");

        Thread.sleep(2000);
        WebElement Other_Union_Queries_Art = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[2]/c-data-tablefor-categories-_-ireland/div/table/tbody/tr/td/p"));
        Other_Union_Queries_Art.click();
        System.out.println("Other Union Queries Article has been clicked");



        System.out.println("All the test cases are automated Successfully !!!!");
        Thread.sleep(15000);
        driver.quit();
    }

}
