package class15;

import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver c=new ChromeDriver();
       c.get("https://www.akakce.com/");
        System.out.println(c.getTitle());
        Thread.sleep(5000);
       c.navigate().to("https://www.amazon.com.tr/ref=nav_logo");
        System.out.println(c.getTitle());
        Thread.sleep(5000);
       c.close();
    }
}
