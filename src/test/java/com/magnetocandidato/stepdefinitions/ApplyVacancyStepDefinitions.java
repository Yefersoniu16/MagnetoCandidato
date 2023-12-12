package com.magnetocandidato.stepdefinitions;

import com.magnetocandidato.tasks.SearchVacancy;
import com.magnetocandidato.tasks.UserLoginMailFail;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ApplyVacancyStepDefinitions {

    @When("^enter category and select vacancy$")
    public void enterCategoryAndSelectVacancy() {
        theActorInTheSpotlight().attemptsTo(SearchVacancy.applyVacancy());

    }

    @Then("^Verify application$")
    public void verifyApplication() {

    }
}
