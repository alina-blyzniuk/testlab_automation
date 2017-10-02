package test;

        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import org.openqa.selenium.By;
        import org.openqa.selenium.Dimension;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class script1 {
    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\JetBrains\\Drivers\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.manage().window().setSize(new Dimension(1300, 1000));
    }

    @Test
    public void testLogin() throws Exception {
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");

        driver.findElement(By.id("email")).click();
        driver.findElement(By.id("email")).sendKeys("webinar.test@gmail.com");

        driver.findElement(By.id("passwd")).click();
        driver.findElement(By.id("passwd")).sendKeys("Xcg7299bnSmMuRLp9ITw");

        driver.findElement(By.name("submitLogin")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"employee_infos\"]/a/span/img")).click();

        driver.findElement(By.id("header_logout")).click();

    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}











