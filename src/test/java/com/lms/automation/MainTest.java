//package com.lms.automation;
//
//import com.Eleap.Algorithms.com.Admin.page.*;
//import com.Eleap.Algorithms.user.page.UserDashboardPage;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.TestInstance;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//
//import java.util.concurrent.TimeUnit;
//
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//
//public class MainTest {
//    WebDriver driver;
//
//
//    public LoginAdminPage loginAdminPage;
//
//    public CoursesSectionAdminPage coursesSectionAdminPage;
//
//    public DropDownMenuTab dropDownMenuTab;
//
//    public MyAssignedSelfEnrollmentTab myAssignedSelfEnrollmentTab;
//
//    public ManageCategoriesManageEventsTab manageCategoriesManageEventsTab;
//
//    public QuizResultTabs quizResultTabs;
//
//    public ObservationChecklistTab observationChecklistTab;
//
//    public TrainingPathsAdminPage trainingPathsAdminPage;
//
//    public UserDashboardPage userDashboardPage;
//
//    public static OjtSectionPage ojtSectionPage;
//
//    public  static  UserSectionPage userSectionPage;
//
//
//
//
//    @BeforeEach
//    public void start() {
//
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\QA\\IdeaProjects\\New folder (2)\\eleap-autotest\\chromeDriver\\chromedriver.exe");
//
//        driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//
//        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
//
//        loginAdminPage = new LoginAdminPage(driver);
//
//        coursesSectionAdminPage = new CoursesSectionAdminPage(driver);
//
//        dropDownMenuTab = new DropDownMenuTab(driver);
//
//        myAssignedSelfEnrollmentTab = new MyAssignedSelfEnrollmentTab(driver);
//
//        manageCategoriesManageEventsTab = new ManageCategoriesManageEventsTab(driver);
//
//        quizResultTabs = new QuizResultTabs(driver);
//
//        observationChecklistTab = new ObservationChecklistTab(driver);
//
//        trainingPathsAdminPage = new TrainingPathsAdminPage(driver);
//
//        userDashboardPage = new UserDashboardPage(driver);
//
//        ojtSectionPage = new OjtSectionPage(driver);
//
//        userSectionPage = new UserSectionPage(driver);
//
//    }
//
//
//    @AfterEach
//    public void finish() {
//        driver.quit();
//    }
//
//
//}
//
