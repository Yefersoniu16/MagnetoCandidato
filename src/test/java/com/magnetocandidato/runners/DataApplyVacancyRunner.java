package com.magnetocandidato.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/data_to_apply.feature",
        glue = "com.magnetocandidato.stepdefinitions", snippets = SnippetType.CAMELCASE)

public class DataApplyVacancyRunner {
}
