package com.magnetocandidato.stepdefinitions;

import com.magnetocandidato.tasks.UserLoginSuccessFul;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DataApplyVacancySstepdefinitions {


    @Given("^the user enters the page and performs login$")
    public void theUserEntersThePageAndPerformsLogin() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://oauth2-stage.magneto365.com/candidates"));
        theActorInTheSpotlight().attemptsTo(UserLoginSuccessFul.loginPageFull());
    }

    @When("^the user fills in the fields to apply for a vacancy$")
    public void theUserFillsInTheFieldsToApplyForAVacancy() {

    }

    @Then("^The user verifies that they can apply for vacancies$")
    public void theUserVerifiesThatTheyCanApplyForVacancies() {

    }


}
