package com.magnetocandidato.stepdefinitions;

import com.magnetocandidato.questions.CheckInvalidEmail;
import com.magnetocandidato.questions.CheckValidMail;
import com.magnetocandidato.tasks.UserLoginMailFail;
import com.magnetocandidato.tasks.UserLoginMailFailDomain;
import com.magnetocandidato.tasks.UserLoginSuccessFul;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class LoginUserStepDefinitions {

    @Before
    public void preparation(){


        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Yeferson");
    }

    @Given("^the user enters the page$")
    public void theUserEntersThePage() {
        theActorInTheSpotlight().wasAbleTo(Open.url("https://oauth2-stage.magneto365.com/candidates"));

    }

    @When("^enter the mail without the symbol$")
    public void enterTheMailWithoutTheSymbol() {
        theActorInTheSpotlight().attemptsTo(UserLoginMailFail.loginPageSymbolFail());

    }

    @Then("^incorrect mail message is displayed$")
    public void incorrectMailMessageIsDisplayed() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckInvalidEmail.verifyMail()));

    }
    @When("^enter the mail without the domain$")
    public void enterTheMailWithoutTheDomain() {
        theActorInTheSpotlight().attemptsTo(UserLoginMailFailDomain.loginPageDomainFail());

    }

    @When("^Enter correct email and password$")
    public void enterCorrectEmailAndPassword() {
        theActorInTheSpotlight().attemptsTo(UserLoginSuccessFul.loginPageFull());
    }

    @Then("^verify correct entry$")
    public void verifyCorrectEntry() {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(CheckValidMail.verifyLoginSuccessful()));

    }
}
