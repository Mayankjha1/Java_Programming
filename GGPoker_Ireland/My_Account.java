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
        System.out.println("Article has been opened");

        Thread.sleep(2000);
        System.out.println("We have reached for the Club Account");
        WebElement clubAccount = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[1]/ul/li[1]/ul/li[2]"));
        clubAccount.click();
        System.out.println("Club Account has been Clicked !!!");

        Thread.sleep(2000);
        WebElement clubAccountArt = driver.findElement(By.xpath("//p[normalize-space()='Super Agent Position']"));
        clubAccountArt.click();
        System.out.println("Club Article has been clicked !!! ");

        Thread.sleep(2000);
        WebElement Application_Account = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[1]/ul/li[1]/ul/li[3]"));
        Application_Account.click();
        System.out.println("Application Account has been clicked !!! ");

        Thread.sleep(2000);
        WebElement Account_Creation = driver.findElement(By.xpath(" /html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[1]/ul/li[1]/ul/li[4]"));
        Account_Creation.click();
        System.out.println("Account Creation has been clicked !!! ");

        Thread.sleep(2000);
        WebElement Account_Creation_Art = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[2]/c-data-tablefor-categories-_-ireland/div/table/tbody/tr/td/p"));
        Account_Creation_Art.click();
        System.out.println("Account Creation Article has been clicked !!! ");

        Thread.sleep(2000);
        WebElement Account_Deletion = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[1]/ul/li[1]/ul/li[5]"));
        Account_Deletion.click();
        System.out.println("Account Deletion has been clicked !!! ");

        Thread.sleep(2000);
        WebElement Account_Deletion_Art = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[2]/c-data-tablefor-categories-_-ireland/div/table/tbody/tr/td/p"));
        Account_Deletion_Art.click();
        System.out.println("Account Deletion Article has been clicked !!! ");

        Thread.sleep(2000);
        WebElement Other_Accounts_Queries = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div[2]/div/div/c-g-gpoker-content-ireland/div/div[1]/ul/li[1]/ul/li[6]"));
        Other_Accounts_Queries.click();
        System.out.println("Other Accounts Queries has been clicked !!! ");

        System.out.println("All the test cases are automated Successfully !!!!");
        Thread.sleep(15000);
        driver.quit();

//        Actions action = new Actions(driver);
//        action.moveToElement(Account).click();

    }
}
