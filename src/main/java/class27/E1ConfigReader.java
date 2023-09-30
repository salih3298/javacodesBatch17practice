package class27;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class E1ConfigReader {
    public static void main(String[] args) throws IOException {

        String url = "http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String userName = "Admin";
        String password = "Hum@nhrm123";

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
        WebElement userNameField = driver.findElement(By.id("txtUsername"));
        userNameField.sendKeys(userName);

        WebElement passwordNameField = driver.findElement(By.id("txtPassword"));
        passwordNameField.sendKeys(password);

        WebElement loginBtn = driver.findElement(By.id("btnLogin"));
        //loginBtn.sendKeys(Keys.ENTER);
        loginBtn.click();

    }
}
