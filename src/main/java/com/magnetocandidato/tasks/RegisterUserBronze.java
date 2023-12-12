package com.magnetocandidato.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.Random;

import static com.magnetocandidato.userinterfaces.RegisterBronze.*;
import static com.magnetocandidato.utils.Contant.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserBronze implements Task {
    private int code;
    private int code2;
    private Random  random = new Random();
    @Override
    public <T extends Actor> void performAs(T actor) {

        code = this.random.nextInt(9999) + 1;
        code2 = this.random.nextInt(9999) + 1;
        System.out.println(code);
        System.out.println(code2);
        actor.attemptsTo(
                //Click.on(ACCEPT_COOKIES),
                //Click.on(CLICK_CREATE_REGISTER),
                Click.on(CLICK_CREATE_ALTERNATIVO),
                WaitUntil.the(INPUT_EMAIL_REGISTER, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                Enter.theValue("correo"+code+"@correo.com").into(INPUT_EMAIL_REGISTER),
                Enter.theValue("correo"+code+"@correo.com").into(INPUT_CONFIRMATION_EMAIL_REGISTER),
                Click.on(BUTTON_CREATE_ACCOUNT),
                Enter.theValue(FIRSTNAME_USER).into(INPUT_NAME_REGISTER),
                Enter.theValue(LASTNAME_USER).into(INPUT_LAST_REGISTER),
                Click.on(BUTTON_NEXT),
                Click.on(COUNTRY_YOU),
                Click.on(BUTTON_NEXT),
                //Click.on(CHECK_PRIVACY_POLICIES),
                //Click.on(BUTTON_NEXT),
                Enter.theValue(PASSWORD).into(INPUT_PASSWORD_REGISTER),



                // Enter.theValue(PASSWORD).into(INPUT_PASSWORD_CONFIRMATION_REGISTER),
                Enter.theValue(PASSWORD).into(INPUT_PASSWORD_CONFIRMATION_REGISTER));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                //WaitUntil.the(BUTTON_NEXT, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(BUTTON_NEXT),
                //Click.on(BUTTON_CONTINUE_REGISTER_SILVER),//Bronce
                Click.on(INPUT_CATEGORIES),
                //Click.on(SELECT_CATEGORIES),
                Click.on(INPUT_CATEGORIES),
               // Click.on(SELECT_CATEGORIES),
                Click.on(INPUT_CATEGORIES),
               // Click.on(SELECT_CATEGORIES),
                //Click.on(BUTTON_NEXT),
                Enter.theValue(PROFESSION).into(INPUT_PROFESSION).thenHit(Keys.ENTER),
                Click.on(INPUT_FREQUENCY),
                Click.on(CLICK_FREQUENCY),

                //Enter.theValue(FREQUENCY).into(INPUT_FREQUENCY).thenHit(Keys.ENTER),
                Enter.theValue(SALARY).into(INPUT_SALARY).thenHit(Keys.ENTER),
                //Click.on(INPUT_CITY_JOD),
                Enter.theValue(CITY_JOB).into(INPUT_CITY_JOD),
                WaitUntil.the(CLICK_CITY_ONE, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(CLICK_CITY_ONE),
                Click.on(WORK_MODE_CHECK),
                Click.on(BUTTON_AVAILABILITY),
                Click.on(BUTTON_CREATE_HV),
                Click.on(GO_TO_PROFILE),
                WaitUntil.the(CURRICULUM_VITAE, WebElementStateMatchers.isVisible()).forNoMoreThan(50).seconds(),
                Click.on(CURRICULUM_VITAE),
                WaitUntil.the(VERY, WebElementStateMatchers.isVisible()).forNoMoreThan(50).seconds(),
                WaitUntil.the(VERY, WebElementStateMatchers.isVisible()).forNoMoreThan(50).seconds()


                );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static RegisterUserBronze register(){
        return instrumented(RegisterUserBronze.class);
    }
}
