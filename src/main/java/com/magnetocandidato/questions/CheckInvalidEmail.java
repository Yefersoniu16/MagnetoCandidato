package com.magnetocandidato.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


import static com.magnetocandidato.userinterfaces.LoginPage.*;

public class CheckInvalidEmail implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
      return CHECK_MAIL.resolveFor(actor).isCurrentlyVisible();
    }
    public static Question <Boolean> verifyMail() {
        return new CheckInvalidEmail();
    }
}
//      return CHECK_MAIL.resolveFor(actor).getText().equals("Linkedin");