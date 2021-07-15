package com.lms.automation;

import com.Eleap.Algorithms.com.Admin.page.LoginAdminPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAdminTest  {
    WebDriver driver;
    public LoginAdminPage loginAdminPage;
    @BeforeAll
    static void setupClass() {

        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {



        driver = new ChromeDriver();
        loginAdminPage = new LoginAdminPage(driver);
    }

    @AfterEach
    void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void SingInPositiveTest() {
        loginAdminPage.goTo()
                .fillEmailField("saqo21harutyunyan+19@gmail.com")
                .fillPassField("7rujd12f")
                .clickLoginButton()
                .ifDisplayedText();


    }
}

