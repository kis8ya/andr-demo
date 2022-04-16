package starter.search;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

public class LookForInformation {
    public static Performable about(String searchTerm) {
        return Task.where("{0} searches for '" + searchTerm + "'",
                Click.on(SearchForm.SEARCH_FIELD).then(
                    Enter.theValue(searchTerm)
                            .into(SearchForm.SUGGEST_OMNIBOX)
                            .then(
                                    Click.on(SearchForm.OMNIBOX_SEARCH_BUTTON).withNoDelay()
                            )
                )
        );
    }
}
