package com.magnetocandidato.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.util.Random;

import static com.magnetocandidato.userinterfaces.RegisterBronze.*;
import static com.magnetocandidato.utils.Contant.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserSilver implements Task {
    private int code;
    private int code2;
    private Random random = new Random();
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
                Click.on(SELECT_CATEGORIES),
                Click.on(INPUT_CATEGORIES),
                Click.on(SELECT_CATEGORIES),
                Click.on(INPUT_CATEGORIES),
                Click.on(SELECT_CATEGORIES),
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
                Click.on(BUTTON_CONTINUE_REGISTER_GOLD),//plata
                Click.on(BUTTON_ADD_EXPERIENCE),
                Enter.theValue(POST).into(INPUT_NAME_POST),
                Click.on(INPUT_EQUIVALENT_CHARGE),
                Click.on(CLICK_EQUIVALENT_CHARGE),
                Click.on(INPUT_LEVEL_CHARGE),
                Click.on(CLICK_LEVEL_CHARGE),
                Enter.theValue(COMPANY).into(INPUT_COMPANY),
                Enter.theValue(CITY_JOB).into(INPUT_CITY_WHERE_WORK),
                WaitUntil.the(CLICK_CITY_WORK, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(CLICK_CITY_WORK),
                Enter.theValue(DESCRIPTION).into(INPUT_WORK_DESCRIPTION),
                Click.on(INPUT_CURRENT_WORK_CHECK),
                Enter.theValue("01/2023").into(INPUT_START_DATE_EXPERIENCES).thenHit(Keys.ENTER),
                Click.on(BUTTON_SAVE_EXPERIENCES),
                Click.on(BUTTON_NEXT),
                Click.on(BUTTON_ADD_STUDIES),
                Enter.theValue(STUDY).into(INPUT_ADD_TITLE_STUDIES),
                Enter.theValue(STUDY_INSTITUTION).into(INPUT_ADD_INSTITUTION),
                Enter.theValue(TITLE_STUDY).into(INPUT_ADD_PROFESSION),
                Click.on(INPUT_COUNTRY_STUDY),
                Enter.theValue(COUNTRY).into(INPUT_COUNTRY_STUDY).thenHit(Keys.ENTER),
                Click.on(INPUT_TYPE_STUDY),
                WaitUntil.the(CLICK_TYPE_STUDY, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(CLICK_TYPE_STUDY),
                Click.on(INPUT_CURRENT_STUDY_CHECK),
                Enter.theValue("01/2023").into(INPUT_START_DATE_STUDY).thenHit(Keys.ENTER),
                Click.on(BUTTON_SAVE_STUDY),
                Click.on(BUTTON_NEXT),
                Click.on(BUTTON_NEXT),
                Click.on(INPUT_BIRTH_DATE),
                Click.on(CLICK_BIRTHDATE),
                Enter.theValue(CITY_JOB).into(INPUT_CITY_BIRTH),
                WaitUntil.the(CLICK_CITY, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(CLICK_CITY),
                Click.on(BUTTON_NEXT),
                Enter.theValue(NUMBER_PHONE).into(INPUT_NUMBER_PHONE),
                Enter.theValue(CITY_JOB).into(INPUT_CITY_LOCATION),
                WaitUntil.the(CLICK_CITY, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(CLICK_CITY),
                Enter.theValue(DRESS).into(INPUT_DRESS),
                Click.on(BUTTON_NEXT_LOCATION),
                Click.on(BUTTON_SEX_MAN),
                Click.on(BUTTON_GENDER_MALE),
                Click.on(BUTTON_NEXT),
                Click.on(CIVIL_STATUS),
                Click.on(INPUT_IDENTIFICATION),
                Click.on(IDENTIFICATION_DOCUMENT),
                Enter.theValue(IDENTIFICATION).into(NUMBER_IDENTIFICATION),
                Click.on(BUTTON_NEXT),
                Click.on(GO_TO_PROFILE),
                Click.on(CURRICULUM_VITAE)
               // WaitUntil.the(VERY, WebElementStateMatchers.isVisible()).forNoMoreThan(50).seconds()//Quitar cuando este disponible la question


                );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public static RegisterUserSilver registerSilver(){
        return instrumented(RegisterUserSilver.class);
    }
}
