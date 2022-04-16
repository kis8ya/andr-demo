package starter.navigation;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.thucydides.core.annotations.Step;

public class YandexBrowserAndroidApp implements Performable {

    public static YandexBrowserAndroidApp start() {
        return new YandexBrowserAndroidApp();
    }

    @Override
    @Step("{0} starts Yandex.Browser")
    public <T extends Actor> void performAs(T user) {
        /* We can set up driver here
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "device");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.FULL_RESET, false);
        // automation engine
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AutomationName.ANDROID_UIAUTOMATOR2);
        // start Ya.Bro
        capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.yandex.browser");
        capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".YandexBrowserMainActivity");

        try {
            AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
         */
    }

}
