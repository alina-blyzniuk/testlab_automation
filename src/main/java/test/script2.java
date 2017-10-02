package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class script2 {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\JetBrains\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1300, 1000));
    }

    @Test
    public void testMenuItems() throws Exception {
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("webinar.test@gmail.com");

        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");

        driver.findElement(By.name("submitLogin")).click();

        Thread.sleep(3000);

        String item1 = driver.findElement(By.className("title")).getText();
        System.out.println(item1);

        String oldUrl = driver.getCurrentUrl().toString();
        driver.navigate().refresh();
        String newUrl = driver.getCurrentUrl().toString();
        Assert.assertEquals(oldUrl, newUrl);

        String item2 = driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentOrders\"]/a/span")).getText();
        System.out.println(item2);

        String oldUrl2 = driver.getCurrentUrl().toString();
        driver.navigate().refresh();
        String newUrl2 = driver.getCurrentUrl().toString();
        Assert.assertEquals(oldUrl2, newUrl2);

        Thread.sleep(3000);

        String item3 = driver.findElement(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a")).getText();
        System.out.println(item3);

        String oldUrl3 = driver.getCurrentUrl().toString();
        driver.navigate().refresh();
        String newUrl3 = driver.getCurrentUrl().toString();
        Assert.assertEquals(oldUrl3, newUrl3);

        Thread.sleep(3000);

        String item4 = driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentCustomer\"]/a/span")).getText();
        System.out.println(item4);

        String oldUrl4 = driver.getCurrentUrl().toString();
        driver.navigate().refresh();
        String newUrl4 = driver.getCurrentUrl().toString();
        Assert.assertEquals(oldUrl4, newUrl4);

        Thread.sleep(3000);

        String item5 = driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentCustomerThreads\"]/a/span")).getText();
        System.out.println(item5);

        String oldUrl5 = driver.getCurrentUrl().toString();
        driver.navigate().refresh();
        String newUrl5 = driver.getCurrentUrl().toString();
        Assert.assertEquals(oldUrl5, newUrl5);

        Thread.sleep(3000);

        String item6 = driver.findElement(By.xpath("//*[@id=\"subtab-AdminStats\"]/a/span")).getText();
        System.out.println(item6);

        String oldUrl6 = driver.getCurrentUrl().toString();
        driver.navigate().refresh();
        String newUrl6 = driver.getCurrentUrl().toString();
        Assert.assertEquals(oldUrl6, newUrl6);

        Thread.sleep(3000);

        String item7 = driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentModulesSf\"]/a")).getText();
        System.out.println(item7);

        String oldUrl7 = driver.getCurrentUrl().toString();
        driver.navigate().refresh();
        String newUrl7 = driver.getCurrentUrl().toString();
        Assert.assertEquals(oldUrl7, newUrl7);

        Thread.sleep(3000);

        String item8 = driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentThemes\"]/a/span")).getText();
        System.out.println(item8);

        String oldUrl8 = driver.getCurrentUrl().toString();
        driver.navigate().refresh();
        String newUrl8 = driver.getCurrentUrl().toString();
        Assert.assertEquals(oldUrl8, newUrl8);

        Thread.sleep(3000);

        String item9 = driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentShipping\"]/a/span")).getText();
        System.out.println(item9);

        String oldUrl9 = driver.getCurrentUrl().toString();
        driver.navigate().refresh();
        String newUrl9 = driver.getCurrentUrl().toString();
        Assert.assertEquals(oldUrl9, newUrl9);

        Thread.sleep(3000);

        String item10 = driver.findElement(By.xpath("//*[@id=\"subtab-AdminParentPayment\"]/a/span")).getText();
        System.out.println(item10);

        String oldUrl10 = driver.getCurrentUrl().toString();
        driver.navigate().refresh();
        String newUrl10 = driver.getCurrentUrl().toString();
        Assert.assertEquals(oldUrl10, newUrl10);

        Thread.sleep(3000);

        String item11 = driver.findElement(By.xpath("//*[@id=\"subtab-AdminInternational\"]/a/span")).getText();
        System.out.println(item11);

        String oldUrl11 = driver.getCurrentUrl().toString();
        driver.navigate().refresh();
        String newUrl11 = driver.getCurrentUrl().toString();
        Assert.assertEquals(oldUrl11, newUrl11);

        Thread.sleep(3000);

        String item12 = driver.findElement(By.xpath("//*[@id=\"subtab-ShopParameters\"]/a/span")).getText();
        System.out.println(item12);

        String oldUrl12 = driver.getCurrentUrl().toString();
        driver.navigate().refresh();
        String newUrl12 = driver.getCurrentUrl().toString();
        Assert.assertEquals(oldUrl12, newUrl12);

        Thread.sleep(3000);

        String item13 = driver.findElement(By.xpath("//*[@id=\"subtab-AdminAdvancedParameters\"]/a")).getText();
        System.out.println(item13);

        String oldUrl13 = driver.getCurrentUrl().toString();
        driver.navigate().refresh();
        String newUrl13 = driver.getCurrentUrl().toString();
        Assert.assertEquals(oldUrl13, newUrl13);


    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}
