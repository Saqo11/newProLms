//package com.lms.automation;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class UserSectionTest extends MainTest {
//
//    @BeforeEach
//    public void singIn() throws InterruptedException {
//
//        loginAdminPage
//                .goTo()
//                .fillEmailField("saqo21harutyunyan+19@gmail.com")
//                .fillPassField("7rujd12f")
//                .clickLoginButton()
//                .ifDisplayedText();
//        userSectionPage
//                .goUserSection();
//
//    }
//
//    @Test
//    public void leaveAllFieldEmpty_NegCase() throws InterruptedException {
//        userSectionPage
//                .leaveAllFieldEmpty();
//
//        WebElement danger = driver.findElement(By.cssSelector(".alert.alert-danger"));
//        boolean userWasAdded = danger.isDisplayed();
//        assertEquals(true, userWasAdded);
//
//    }
//
//    @Test
//    public void createUser() throws InterruptedException {
//        userSectionPage
//                .createNewUser();
//
//        WebElement success = driver.findElement(By.cssSelector(".alert.alert-success"));
//        boolean userWasAdded = success.isDisplayed();
//        assertEquals(true, userWasAdded);
//
//
//    }
//
//    @Test
//    public void deactivateUserLMS() throws InterruptedException {
//
//        userSectionPage
//                .createNewUser()
//                .deactivateUser();
//
//        WebElement success = driver.findElement(By.cssSelector(".alert.alert-success"));
//        boolean userWasAdded = success.isDisplayed();
//        assertEquals(true, userWasAdded);
//
//
//    }
//
//    @Test
//    public void checkCustomFields() throws InterruptedException {
//        userSectionPage
//                .chooseCustomField();
//
//        WebElement success = driver.findElement(By.cssSelector("[onclick='removeCustomFilter(this)']"));
//        boolean showDeleteButton = success.isDisplayed();
//        assertEquals(true, showDeleteButton);
//
//
//    }
//
//
//    @AfterEach
//    public void deleteUserProfile() throws InterruptedException {
//        userSectionPage
//                .goUserSection()
//                .deleteUser();
//
//
//    }
//
//}
//
