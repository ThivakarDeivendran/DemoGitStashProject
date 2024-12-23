package com.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class Test {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        String value = driver.getTitle();
        System.out.println(value);
        System.out.println("Testing");
        System.out.println("Testing y");
        System.out.println("Testing Eclipse");
        System.out.println("Testing visual Studio code");
        System.out.println("Testing the git stash in visual Studio code");
    }
    
}
