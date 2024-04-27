package live.alokdev;

import appium2grid4.CommonUtils;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

public class MainAndroid {
    public AndroidDriver driver;
    IOSDriver iosDriver;
    public AppiumDriverLocalService service;

    @BeforeClass
    public void setupAndroid() throws IOException, InterruptedException {
//        service = new AppiumServiceBuilder().withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
//                .withIPAddress("127.0.0.1").usingPort(4725).build();
//        service.start();
//        CommonUtils.executePermissionToScripts();
//        CommonUtils.runScript("RunGrid.sh");
//        CommonUtils.runScript("RunAppium.sh");
//        CommonUtils.runScript("RegisterNode.sh");
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("emulator-5554");
//        options.setUdid("emulator-5554");
        options.setAutomationName("UiAutomator2");
        options.setPlatformName("android");
        options.setPlatformVersion("12");
        options.setApp("/Volumes/Alok/Automation/MobileAutomation/src/test/resources/General-Store.apk");
        driver = new AndroidDriver(new URL("http://10.106.27.66:4444/"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//        XCUITestOptions options = new XCUITestOptions();
//        options.setDeviceName("iPhone 15 Pro");
//        options.setApp("/Volumes/Alok/Automation/MobileAutomation/src/test/resources/UIKitCatalog.app");
////        	options.setApp("//Users//rahulshetty//workingcode//Appium//src//test//java//resources//TestApp 3.app");
//        options.setPlatformVersion("17.4");
//        options.withBrowserName(Browser.SAFARI.browserName());
//        options.setUdid("8CCBB297-D010-430B-963B-A25B60049C26");
//        //Appium- Webdriver Agent -> IOS Apps.
//        options.setWdaLaunchTimeout(Duration.ofSeconds(20));
//        iosDriver = new IOSDriver(new URL("http://10.106.27.66:4444/wd/hub"), options);
//        iosDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void test() {
        System.out.println("Hi");
    }

    @AfterClass
    public void tearDown() {

        iosDriver.quit();
//            service.stop();

    }
}
