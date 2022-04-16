package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class NavigateTo {
    public static Performable theYandexBrowserMainScreen() {
        return Task.where("{0} opens the Yandex Browser main screen",
                YandexBrowserAndroidApp.start());
    }
}
