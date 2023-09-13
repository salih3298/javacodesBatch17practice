package class20;

import org.openqa.selenium.chrome.ChromeDriver;

public class E5Selenium {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver chrome=new ChromeDriver();
        chrome.manage().window().maximize();
        Thread.sleep(2000);
        chrome.navigate().to("https://www.mondialmotor.com.tr/model/scooter/125-strada");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://www.google.com.tr/");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().to("https://www.amazon.com.tr/ref=nav_logo");
        System.out.println(chrome.getTitle());
        Thread.sleep(2000);
        chrome.navigate().back();
        chrome.close();
    }

}
