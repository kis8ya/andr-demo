package starter.search;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

class SearchForm {
    static Target SEARCH_FIELD = Target.the("search field")
            .locatedBy("//android.widget.EditText[@content-desc=\"Smart address bar\"]");

    static Target SUGGEST_OMNIBOX = Target.the("suggest omnibox")
            .locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.EditText");

    static Target OMNIBOX_SEARCH_BUTTON = Target.the("omnibox search button")
            .located(MobileBy.id("suggest_omnibox_action_button"));

}
