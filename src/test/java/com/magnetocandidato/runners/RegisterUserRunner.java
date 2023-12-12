package com.magnetocandidato.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/register_user.feature",
        glue = "com.magnetocandidato.stepdefinitions" ,
        tags = "@GoldRecord",
        snippets = SnippetType.CAMELCASE)

public class RegisterUserRunner {
}
