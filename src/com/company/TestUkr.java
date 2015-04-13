package com.company;

import org.apache.http.impl.client.StandardHttpRequestRetryHandler;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by Евгений on 11.04.2015.
 */

@RunWith(JUnit4.class)
public class TestUkr {
    private WebDriver dr;

    @Before
    public void dlfkdlfk() {
        System.setProperty("webdriver.chrome.driver",
                "C:/Program/chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("https://www.ukr.net/");

    }


    @Test
    public void Test1() {
        dr.findElement(By.name("Login")).sendKeys("Realplus");
        dr.findElement(By.name("Password")).sendKeys("5264452", Keys.ENTER);

        dr.manage().window().maximize();

    }

    @After
    public void clean() {
        dr.quit();
    }
    @Test
    public  void Test2(){
        String a = dr.findElements(By.tagName("input")).get(2).getAttribute("value");
        String b = "Пошук";
        Assert.assertEquals( a,b );

        }
    }



