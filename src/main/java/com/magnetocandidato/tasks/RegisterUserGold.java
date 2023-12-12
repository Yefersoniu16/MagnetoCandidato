package com.magnetocandidato.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;import java.nio.file.Path;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Upload;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;


import java.net.URISyntaxException;

import java.nio.file.Paths;
import java.util.Random;
import java.util.logging.Logger;

import static com.magnetocandidato.userinterfaces.RegisterBronze.*;
import static com.magnetocandidato.utils.Contant.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class RegisterUserGold implements Task {
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
                Click.on(CHECK_DATA_PROCESSING),
                Click.on(FINAL_CHECK_CONDITIONS),
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
                //WaitUntil.the(SELECT_CATEGORIES_ONE, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                Click.on(SELECT_CATEGORIES_ONE),
                Click.on(SELECT_CATEGORIES_TWO),
                Click.on(SELECT_CATEGORIES_THREE),
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
                //Click.on(GO_TO_PROFILE),
                Click.on(BUTTON_CONTINUE_REGISTER_FINAL),//Gold
                Enter.theValue("Proactivo").into(INPUT_SKILL).thenHit(Keys.ENTER),
                //Click.on(LEVEL_SKILL),
                Click.on(BUTTON_NEXT),
                //bloquear cargas
                Click.on(BUTTON_LOAD_VIDEO)
        );
        Path data = null;
        try {
            data = Paths.get(ClassLoader.getSystemResource("video.mp4").toURI());
        } catch (URISyntaxException ignore) {
            Logger.getLogger("No found");
        }

        actor.attemptsTo(
                Upload.theFile(data).to(BUTTON_SELECT_LOAD),//Mapeo file
                Click.on(BUTTON_SAVE_LOAD),

                Click.on(BUTTON_NEXT),
                WaitUntil.the(DESCRIPTION, WebElementStateMatchers.isVisible()).forNoMoreThan(50).seconds(),
                Enter.theValue(DESCRIPTION).into(FIELD_TEXT_DESCRIPTION),
                Click.on(BUTTON_NEXT));



        try {
            data = Paths.get(ClassLoader.getSystemResource("foto.jpg").toURI());
        } catch (URISyntaxException ignore) {
            Logger.getLogger("No found");
        }

        actor.attemptsTo(
                Upload.theFile(data).to(BUTTON_SELECT_LOAD),
                Click.on(BUTTON_SAVE_PHOTO),
                //Click.on(BUTTON_NEXT),

                Click.on(BUTTON_NEXT),
                Click.on(BUTTON_NEXT),
                Click.on(ADD_CERTIFICATION),
                Enter.theValue(NAME_CERTIFICATION).into(INPUT_NAME_CERTIFICATION),
                Enter.theValue(INSTITUTION_CERTIFICATION).into(INPUT_INSTITUTION_CERTIFICATION),
                Click.on(INPUT_CERTIFICATION_EXPIRE),
                Click.on(INPUT_DATE_CERTIFICATION),
                Click.on(INPUT_SELECT_DATE),
                Enter.theValue(CREDENTIAL).into(INPUT_CREDENTIAL),
                Enter.theValue(URL_EVIDENCE).into(INPUT_URL_CERTIFICATION));


        try {
            data = Paths.get(ClassLoader.getSystemResource("hv_load.pdf").toURI());
        } catch (URISyntaxException ignore) {
            Logger.getLogger("No found");
        }


        actor.attemptsTo(
                Upload.theFile(data).to(BUTTON_SELECT_LOAD),
                Click.on(BUTTON_SAVE_CERTIFICATION),
                Click.on(BUTTON_NEXT),
                Click.on(ADD_ACKNOWLEDGMENTS),
                Enter.theValue(NAME_ACKNOWLEDGMENTS).into(INPUT_NAME_ACKNOWLEDGMENTS),
                Enter.theValue(INSTITUTION_ACKNOWLEDGMENTS).into(INPUT_INSTITUTION_ACKNOWLEDGMENTS),
                Click.on(INPUT_DATE_ACKNOWLEDGMENTS),
                Click.on(INPUT_SELECT_DATE),
                Enter.theValue(URL_EVIDENCE).into(INPUT_URL_ACKNOWLEDGMENTS)

        );

        try {
            data = Paths.get(ClassLoader.getSystemResource("hv_load.pdf").toURI());
        } catch (URISyntaxException ignore) {
            Logger.getLogger("No found");
        }


        actor.attemptsTo(
                Upload.theFile(data).to(BUTTON_SELECT_LOAD),
                Click.on(BUTTON_SAVE_ACKNOWLEDGMENTS),
                Click.on(BUTTON_NEXT),
                Upload.theFile(data).to(BUTTON_SELECT_LOAD),
                WaitUntil.the(CONFIRM_LOAD_CV, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds(),
                WaitUntil.the(CONFIRM_LOAD_CV, WebElementStateMatchers.isNotVisible()).forNoMoreThan(30).seconds(),
                Click.on(BUTTON_NEXT),
                Enter.theValue(URL_EVIDENCE).into(INPUT_URL_WEBSITE),
                //Enter.theValue(URL_EVIDENCE).into(INPUT_URL_TWITTER),
                //Enter.theValue(URL_EVIDENCE).into(INPUT_URL_LINKEDIN),
                //Enter.theValue(URL_EVIDENCE).into(INPUT_URL_FACEBOOK),

                Click.on(BUTTON_NEXT),
                Enter.theValue(HOBBIES).into(INPUT_HOBBIES),
                Click.on(BUTTON_NEXT)
                //Enter.theValue(LANGUAGE).into(INPUT_LANGUAGE).thenHit(Keys.ENTER),
                //WaitUntil.the(SELECT_LANGUAGE, WebElementStateMatchers.isClickable()).forNoMoreThan(30).seconds(),
                //Click.on(SELECT_LANGUAGE)
        );

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        actor.attemptsTo(
                Click.on(BUTTON_NEXT),
                Click.on(GO_TO_PROFILE),
                Click.on(CURRICULUM_VITAE)
                //WaitUntil.the(VERY, WebElementStateMatchers.isClickable()).forNoMoreThan(60).seconds()

        );


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    public static RegisterUserGold registerGold(){
        return instrumented(RegisterUserGold.class);
    }
}
