package com.example.demo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;

import static org.junit.Assert.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SeleniumJUnitTest {
    @LocalServerPort
    private Integer port;
    private static WebDriver driver;

    @BeforeAll
    public static void beforeAll() {
//        setup ChromeDriver
    }

    @BeforeEach
    public void beforeEach() {
//        open browser at localhost:port/animal
    }

    @Test
    public void maintest () {
        // perform an automated test with
            // animal: dog
            // adjective: funny

//        assertEquals("We love funny dogs.", //text output on the page);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}
