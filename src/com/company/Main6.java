package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Евгений on 06.04.2015.
 */
public class Main6 {
      public static void main(String[] args) {

          System.setProperty("webdriver.chrome.driver",
                  "C:/Program/chromedriver.exe");

          WebDriver h = new ChromeDriver();


          h.manage().window().maximize();

          h.get("http://angel.net/~nic/passwd.sha1.1a.html");

          h.findElement(By.name("master")).sendKeys("12345678", Keys.ENTER);
          h.findElement(By.name("password")).getAttribute("value");


          String s = h.findElement(By.name("password")).getAttribute("value");
          System.out.println(s);

      }
             public static String genPass(WebDriver w, String p, String s){
             WebElement m =






      }

