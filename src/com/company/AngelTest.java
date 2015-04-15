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
      //  dr.get("http://oxogamestudio.com/passwd.current2.htm");
          dr.get(" http://angel.net/~nic/passwd.current.html");
    }

    public void poisk(String S){
        dr.findElement(By.name("master")).sendKeys(S);
    }
    public void site(String F){
        dr.findElement(By.name("site")).sendKeys(F );

    }
    public String vozvrat(){
        String F = dr.findElement(By.name("password")).getAttribute("value");
        return F;
    }

    public void ENTER (){
        dr.findElement(By.name("site")).sendKeys( Keys.ENTER);
    }

    @Test
    public void test() {

        poisk("12345678");
        site("gmail.com");
        ENTER();
        String A = "W3Hdka0clbEI+@1a";
        Assert.assertEquals(A,vozvrat());

    }
    @Test
    public void test1() {

        poisk("");
        site("gmail.com");
        ENTER();
        String A = "W3Hdka0c1a";
        Assert.assertEquals(A,vozvrat());

    }

    @Test
    public void test2() {

        poisk("12345678");
        site("");
        ENTER();
        String A = "9Ixm2r5X1a";
        Assert.assertEquals(A, vozvrat());
    }

    @Test
    public void test3() {

        poisk("");
        site("");
        ENTER();
        String A = "BaefBs8/1a";
        Assert.assertEquals(A, vozvrat());
    }

    @Test
    public void test4() {
        int i = 0;
        for (i=0;i<200;i++){
            poisk("1");
            site ("1");

        }
        ENTER();
        String A = "aR8ztwNB1a";
        Assert.assertEquals(A,vozvrat());

    }
    @Test
    public void test5() {

        poisk("!@#$%^&*()");
        site("!@#$%^&*()");
        ENTER();
        String A = "zZMDkc+s1a";
        Assert.assertEquals(A,vozvrat());
    }

    @Test
    public void test6() {

        String a = dr.findElements(By.tagName("input")).get(2).getAttribute("value");
        String b = "Generate";
        Assert.assertEquals( b,a );

    }
}