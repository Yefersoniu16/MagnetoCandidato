package com.magnetocandidato.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/search_and_apply _to_vacancy.feature",
        glue = "com.magnetocandidato.stepdefinitions",
        tags = "",
        snippets = SnippetType.CAMELCASE)
public class SearchVacancyRunner {
}
