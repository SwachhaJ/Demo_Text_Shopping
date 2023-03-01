import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_for_Name {
     static String baseurl= "http://tutorialsninja.com/demo/index.php?route=account/login";
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","utilis/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get(baseurl);

        try {
            Thread.sleep(5000);

            driver.findElement(By.name("email")).sendKeys("sweak22@gmail.com");

            driver.findElement(By.name("password")).sendKeys("123456");

            driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div[2]/div/form/input")).click();

            Thread.sleep(5000);

            driver.close();
        }
        catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}