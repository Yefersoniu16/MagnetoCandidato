package com.magnetocandidato.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static com.magnetocandidato.userinterfaces.LoginPage.EMAIL_USER;
import static com.magnetocandidato.userinterfaces.LoginPage.PASSWORD_USER;
import static com.magnetocandidato.utils.Contant.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserLoginMailFailDomain implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(EMAIL_DOMAIN_FAIL).into(EMAIL_USER),
                Enter.theValue(PASSWORD).into(PASSWORD_USER)
        );
    }
    public static UserLoginMailFailDomain loginPageDomainFail(){
        return instrumented(UserLoginMailFailDomain.class);}
}
