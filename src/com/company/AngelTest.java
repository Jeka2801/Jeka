package com.company;



import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
/**
 * Created by Евгений on 08.04.2015.
 */
public class AngelTest {
    private WebDriver dr;

    @Test
    public void test() {

        dr.findElement(By.name("master")).sendKeys("12345678");
        dr.findElement(By.name("site")).sendKeys("gmail.com", Keys.ENTER);
        String F = dr.findElement(By.name("password")).getAttribute("value");
        String A = "W3Hdka0c1a";
        Assert.assertEquals(A, F);

    }

    @After
    public void clean() {
        dr.quit();
    }

    @Before
    public void kjdshcdsmcb() {

        System.setProperty("webdriver.chrome.driver",
                "C:/Program/chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("http://angel.net/~nic/passwd.sha1.1a.html");

    }

    @Test
    public void test1() {

        dr.findElement(By.name("master")).sendKeys("");
        dr.findElement(By.name("site")).sendKeys("gmail.com", Keys.ENTER);
        String F = dr.findElement(By.name("password")).getAttribute("value");
        String A = "zmcHOAyf1a";
        Assert.assertEquals(A, F);
    }

    @Test
    public void test2() {

        dr.findElement(By.name("master")).sendKeys("12345678");
        dr.findElement(By.name("site")).sendKeys("", Keys.ENTER);
        String F = dr.findElement(By.name("password")).getAttribute("value");
        String A = "9Ixm2r5X1a";
        Assert.assertEquals(A, F);
    }

    @Test
    public void test3() {

        dr.findElement(By.name("master")).sendKeys("");
        dr.findElement(By.name("site")).sendKeys("", Keys.ENTER);
        String F = dr.findElement(By.name("password")).getAttribute("value");
        String A = "BaefBs8/1a";
        Assert.assertEquals(A, F);
    }

    @Test
    public void test4() {
        String y = "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy" +
                "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy" +
                "yyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyy";
        String x = "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
                "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx" +
                "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
        dr.findElement(By.name("master")).sendKeys(y);
        dr.findElement(By.name("site")).sendKeys(x, Keys.ENTER);
        String F = dr.findElement(By.name("password")).getAttribute("value");
        String A = "514UELTc1a";
        Assert.assertEquals(A, F);

    }
    @Test
    public void test5() {

        dr.findElement(By.name("master")).sendKeys("!@#$%^&*()");
        dr.findElement(By.name("site")).sendKeys("!@#$%^&*()", Keys.ENTER);
        String F = dr.findElement(By.name("password")).getAttribute("value");
        String A = "zZMDkc+s1a";
        Assert.assertEquals(A, F);
    }

    @Test
    public void test6() {

        String a = dr.findElements(By.tagName("input")).get(2).getAttribute("value");
        String b = "Generate";
        Assert.assertEquals( a,b );

    }
}