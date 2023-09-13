package class20;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class E5SeleniumProfessional {
    public static void main(String[] args) throws InterruptedException {
        WebDriver[] arr = {new ChromeDriver(), new EdgeDriver()};
        for (WebDriver d : arr) {
            d.manage().window().maximize();
            Thread.sleep(2000);
            d.navigate().to("https://www.mondialmotor.com.tr/model/scooter/125-strada");
            System.out.println(d.getTitle());
            Thread.sleep(2000);
            d.navigate().to("https://www.google.com.tr/");
            System.out.println(d.getTitle());
            Thread.sleep(2000);
            d.navigate().to("https://www.amazon.com.tr/ref=nav_logo");
            System.out.println(d.getTitle());
            Thread.sleep(2000);
            d.navigate().back();
            d.close();
        }

    }

}
