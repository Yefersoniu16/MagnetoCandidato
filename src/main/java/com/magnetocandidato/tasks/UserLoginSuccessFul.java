package com.magnetocandidato.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.magnetocandidato.userinterfaces.CandidateProfile.VERIFY_LOGIN_SUCCESSFUL;
import static com.magnetocandidato.userinterfaces.LoginPage.*;
import static com.magnetocandidato.utils.Contant.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserLoginSuccessFul implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(EMAIL_FULL).into(EMAIL_USER),
                Enter.theValue(PASSWORD).into(PASSWORD_USER),
               // WaitUntil.the(BUTTON_INGRESAR, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds(),
                Click.on(BUTTON_INGRESAR),
                WaitUntil.the(VERIFY_LOGIN_SUCCESSFUL, WebElementStateMatchers.isVisible()).forNoMoreThan(30).seconds()



                );
    }
    public static UserLoginSuccessFul loginPageFull(){
        return instrumented(UserLoginSuccessFul.class);
    }


}
