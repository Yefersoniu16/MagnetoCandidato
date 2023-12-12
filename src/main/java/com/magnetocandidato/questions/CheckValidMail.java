package com.magnetocandidato.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.magnetocandidato.userinterfaces.CandidateProfile.VERIFY_LOGIN_SUCCESSFUL;

public class CheckValidMail implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return VERIFY_LOGIN_SUCCESSFUL.resolveFor(actor).getText().equals("Mi hoja de vida");
    }
    public static Question <Boolean> verifyLoginSuccessful() {
        return new CheckValidMail();
    }
}
