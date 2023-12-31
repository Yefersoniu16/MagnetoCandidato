package com.magnetocandidato.runners;




import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/login_user.feature",
glue = "com.magnetocandidato.stepdefinitions", snippets = SnippetType.CAMELCASE)

public class LoginUser {
}
