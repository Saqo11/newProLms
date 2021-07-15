//package com.Eleap.Algorithms.com.Admin.page;
//
//import com.Eleap.Algorithms.BasePage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class UserSectionPage extends BasePage {
//    public UserSectionPage(WebDriver driver) {
//        super(driver);
//    }
//
//    String SITE_URL = ("https://largeaccounttest.eleapdev.com/users/");
//
//    @FindBy(xpath = "//button[text()='Add new user']")
//    private WebElement addNewUserButton;
//
//    @FindBy(xpath = "//div/div[2]/form/div[1]/div[1]/select")
//    private WebElement title;
//
//    @FindBy(css = "[name='first_name']")
//    private WebElement nameField;
//
//    @FindBy(css = "[name='middle_name']")
//    private WebElement middleName;
//
//    @FindBy(css = "[name='last_name']")
//    private WebElement lastName;
//
//    @FindBy(css = "[name='email']")
//    private WebElement emailField;
//
//    @FindBy(xpath = "//button[text()='Add User']")
//    private WebElement addUserButton;
//
//    @FindBy(css = "[placeholder='Search by Name or Email']")
//    private WebElement searchByEmail;
//
//    @FindBy(css = ".d-flex .text-nowrap.clip-text-35")
//    private WebElement displayedUser;
//
//    @FindBy(css = "[name='id[]']")
//    private WebElement checkUser;
//
//    @FindBy(css = ".btn.btn-default")
//    private WebElement applyFilters;
//
//    @FindBy(css = ".select_items_button")
//    private WebElement deleteButton;
//
//    @FindBy(css = ".alert.alert-success")
//    private WebElement success;
//
//    @FindBy(css = "[onclick='showCustomFilterSection(this)']")
//    private WebElement customFieldButton;
//
//    @FindBy(xpath = "//a[text()='ADD FILTER']")
//    private WebElement addFilterButton;
//
//    @FindBy(css = "[title='Deactivate']")
//    private WebElement deactivateButton;
//
//
//    public UserSectionPage goUserSection() {
//        driver.get(SITE_URL);
//        return this;
//    }
//
//    private void clickAddNewUserButton() {
//        addNewUserButton.click();
//    }
//
//    private void chooseTitle() {
//        waitForElementToVisibilityOfElement(driver, title, 15);
//        selectMethod(title, 1);
//    }
//
//    private void fillNameField(CharSequence param) {
//        nameField.sendKeys(param);
//    }
//
//    private void fillMiddleName(CharSequence param) {
//        middleName.sendKeys(param);
//    }
//
//    private void fillLastName(CharSequence param) {
//        lastName.sendKeys(param);
//    }
//
//    private void fillEmailField(CharSequence param) throws InterruptedException {
//        scrollElementDisplayed(driver, lastName);
//        emailField.sendKeys(param);
//    }
//
//    private void clickAddUser() throws InterruptedException {
//        scrollDown(driver);
//        addUserButton.click();
//    }
//
//    private void fillSearchByEmailField(CharSequence param) {
//        searchByEmail.sendKeys(param);
//    }
//
//    private void clickApplyFilters() {
//        applyFilters.click();
//    }
//
//    private void clickToggle() {
//        waitForElementToBeClickable(driver,deactivateButton,10);
//        deactivateButton.click();
//    }
//
//    private void clickCustomFieldButton() {
//        customFieldButton.click();
//    }
//
//    private void clickAddFilterButton() {
//        waitForElementToBeClickable(driver, addFilterButton, 10);
//        addFilterButton.click();
//    }
//
//    private void clickDeleteButton() {
//        checkUser.click();
//        waitForElementToBeClickable(driver, deleteButton, 10);
//        deleteButton.click();
//        alertMethod(driver);
//    }
//
//    private void deleteTheUser() {
//        try {
//            clickDeleteButton();
//
//            boolean UserWasDeleted = success.isDisplayed();
//            assertEquals(true, UserWasDeleted);
//
//        } catch (Exception e) {
//
//
//        }
//    }
//
//
//    public UserSectionPage createNewUser() throws InterruptedException {
//        clickAddNewUserButton();
//        chooseTitle();
//        fillNameField("Robot");
//        fillMiddleName("Auto");
//        fillLastName("User");
//        fillEmailField("rorborbfrf@gcv.ua");
//        clickAddUser();
//
//        return this;
//
//    }
//
//    public UserSectionPage deleteUser() {
//        fillSearchByEmailField("rorborbfrf@gcv.ua");
//        clickApplyFilters();
//        deleteTheUser();
//        return this;
//
//    }
//
//    public UserSectionPage leaveAllFieldEmpty() throws InterruptedException {
//        clickAddNewUserButton();
//        clickAddUser();
//        return this;
//    }
//
//    public UserSectionPage chooseCustomField() {
//        clickCustomFieldButton();
//        clickAddFilterButton();
//        return this;
//
//    }
//
//    public  UserSectionPage deactivateUser(){
//        fillSearchByEmailField("rorborbfrf@gcv.ua");
//        clickApplyFilters();
//        clickToggle();
//        return this;
//
//    }
//
//
//}
