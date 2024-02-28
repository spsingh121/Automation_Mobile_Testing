package sp;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import java.net.MalformedURLException;
import java.net.URL;
public class dialer {
    public static void main(String[] args) throws MalformedURLException {

        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.android.dialer");
        dc.setCapability("appActivity", ".DialtactsActivity");
        AndroidDriver ad = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);

        var el1 = ad.findElement(AppiumBy.accessibilityId("dial pad"));
        el1.click();
        var el2 = ad.findElement(AppiumBy.id("com.android.dialer:id/dialpad_key_voicemail"));
        el2.click();
        var el3 = ad.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.android.dialer:id/dialpad_key_number\" and @text=\"0\"]"));
        el3.click();
        var el4 = ad.findElement(AppiumBy.xpath("//android.widget.TextView[@resource-id=\"com.android.dialer:id/dialpad_key_number\" and @text=\"8\"]"));
        el4.click();
        var el5 = ad.findElement(AppiumBy.accessibilityId("dial"));
        el5.click();
        var el6 = ad.findElement(AppiumBy.accessibilityId("End Call"));
        el6.click();
        Assert.assertEquals(ad.findElement(AppiumBy.id("com.android.calculator2:id/result")).getText(), "9");


    }
}