package test.java;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.thoughtworks.selenium.Selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
import static org.apache.commons.lang3.StringUtils.join;

/*
        this is to test version2.2

                this is to test version 3.1 */


public class AppTest{
    public Selenium selenium;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String baseUrl = "http://www.V1.com/";
        driver.get(baseUrl);
        driver.quit();
    }

    @Test
    public void testEbayAdvancedSearch() throws Exception {
        setUp();
 //       selenium.open("/"); dsafsaf
        selenium.waitForPageToLoad("30000");
        selenium.click("id=gh-as-a");
        selenium.type("id=_nkw", "JUnit");
        selenium.select("id=e1-1", "value=267");
        selenium.click("id=LH_TitleDesc");
        selenium.click("css=button.btn.btn-prim");
        selenium.waitForPageToLoad("30000");
        for (int second = 0;; second++) {
            if (second >= 60) fail("timeout");
            try { if (selenium.isElementPresent("css=span.listingscnt")) break; } catch (Exception e) {}
            Thread.sleep(1000);
        }

        assertEquals("Объявлений: 488", selenium.getText("css=span.listingscnt"));
    }

    @Test
    public void test1(){
        System.setProperty("Webdriver.chrome.driver", "C:\\SeleniumWebdrivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.ca");
        System.out.println("this is test v3.1");
        driver.close();
        driver.quit();

    }


    @After
    public void tearDown() throws Exception {
        selenium.stop();
    }

        public void demo() throws Exception {
            System.out.println( "Hello World! This is from test" );
            AppTest at=new AppTest();
            at.testEbayAdvancedSearch();
            at.tearDown();
        }
}



