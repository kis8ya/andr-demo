package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;
import starter.navigation.NavigateTo;
import starter.search.LookForInformation;
import starter.search.SearchEngineResultPage;

public class SearchStepDefinitions {

    @Given("{actor} is looking for translation on SERP")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theYandexBrowserMainScreen());
    }

    @When("{actor} looks up {string}")
    public void searchesFor(Actor actor, String term) {
        actor.attemptsTo(
                LookForInformation.about(term)
        );
    }

    @Then("{actor} should see translation {string}")
    public void shouldSeeTranslationBlock(Actor actor, String translationText) {
        actor.attemptsTo(
                Ensure.that(SearchEngineResultPage.SERP_FEATURE_TRANSLATOR).hasText(translationText)
        );
    }
}
