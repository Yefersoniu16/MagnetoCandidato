package com.magnetocandidato.stepdefinitions;

import com.magnetocandidato.tasks.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegisterUserSteDefinition {

    @Given("^the user enters the registration page$")
    public void theUserEntersTheRegistrationPage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://www-stg.magneto365.com/co/empresas/talenta365"));

    }

    @When("^the user registers bronze$")
    public void theUserRegistersBronze() {
        theActorInTheSpotlight().attemptsTo(RegisterUserBronze.register());
        theActorInTheSpotlight().attemptsTo(DeleteAccount.delete());

    }

    @Then("^user verifies record bronze$")
    public void userVerifiesRecordBronze() {

    }

    @When("^the user registers silver$")
    public void theUserRegistersSilver() {

        theActorInTheSpotlight().attemptsTo(RegisterUserSilver.registerSilver());
        theActorInTheSpotlight().attemptsTo(DeleteAccount.delete());
    }

    @Then("^user verifies record silver$")
    public void userVerifiesRecordSilver() {

    }

    @When("^the user registers gold$")
    public void theUserRegistersGold() {
        theActorInTheSpotlight().attemptsTo(RegisterUserGold.registerGold());
        theActorInTheSpotlight().attemptsTo(DeleteAcconutDiamond.deleteDiamond());
    }

    @Then("^user verifies record gold$")
    public void userVerifiesRecordGold() {

    }

}
