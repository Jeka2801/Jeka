package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Евгений on 06.04.2015.
 */
      public class Main7{
       public static void main(String[] args) {


           System.setProperty("webdriver.chrome.driver",
                   "C:/Program/chromedriver.exe");

           WebDriver h = new ChromeDriver();

           h.manage().window().maximize();

           h.get("http://google.com");
           System.out.println(h.getTitle());

    }


}
