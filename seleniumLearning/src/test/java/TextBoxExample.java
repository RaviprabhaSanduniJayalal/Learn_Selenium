import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TextBoxExample {

    WebDriver driver;

    @BeforeMethod
    public void openTextBoxTestPage(){
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/link.xhtml");
    }

    @Test
    public void textBoxTest(){
        driver.findElement(By.id("j_idt88:name")).sendKeys("Raviprabha");
        driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Sri Lanka");
       boolean enabled= driver.findElement(By.id("j_idt88:j_idt93")).isEnabled();
        System.out.println("Is the text box enabled? " + enabled);
    }
}
