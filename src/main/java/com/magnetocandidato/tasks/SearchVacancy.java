package com.magnetocandidato.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.magnetocandidato.userinterfaces.ApplyVacancy.*;
import static com.magnetocandidato.userinterfaces.RegisterBronze.CLICK_CITY;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchVacancy implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SUGGESTED_BUTTONS),
                WaitUntil.the(TITTLE_VACANCY, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Enter.theValue("Prueba de postulacion 2").into(SEARCH).thenHit(Keys.ENTER),
                WaitUntil.the(TITTLE_VACANCY, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(TITTLE_VACANCY),
                Click.on(BUTTON_APPLY_VACANCY),
                Click.on(ANSWER_ONE),
                Click.on(SEND_ANSWER),
                Click.on(ACTIVE_PROCESSES_BUTTON),
                WaitUntil.the(VERIFY_PROCESS, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds()

        );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static SearchVacancy applyVacancy(){
        return instrumented(SearchVacancy.class);}
}
