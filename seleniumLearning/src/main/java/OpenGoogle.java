import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com");
//        System.out.println("Google opened successfully");
      driver.quit();
    }
}
