package com.company;

import org.omg.CORBA.SystemException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver",
        "C:/Program/chromedriver.exe");

        WebDriver h = new ChromeDriver();

        h.manage().window().maximize();

        h.get("http://google.com");

        Thread.sleep(5000);

        h.quit();
    }
}

