package GGPoker_Ireland;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_Account {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        // This will redirect to this link
        driver.get("https://nsus.my.site.com/clubgg/s/");
        System.out.println("We have reached the destination");
        Thread.sleep(3000);

        //This is the code for finding My Account
        WebElement Account = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[1]/div/div/c-g-g-poker-navbar-ireland/div/div[1]/div[2]/ul/li[1]/p"));
        Account.click();

        //This is the code for clicking in KYC L2
        Thread.sleep(2000);
        WebElement article = driver.findElement(By.xpath("//div[@class='article_card']//p[contains(text(),'KYC')]"));
        article.click();

        System.out.println("We have Entered in the Article Section");
        Thread.sleep(2000);

        // This is the code for opening a Article !!!
        WebElement OpenedArt = driver.findElement(By.xpath("//p[normalize-space()='Can I change the country registered to my account?']"));
        OpenedArt.click();
        System.out.println("Testing is Successful");
        Thread.sleep(3000);
        driver.quit();

//        Actions action = new Actions(driver);
//        action.moveToElement(Account).click();

    }
}
