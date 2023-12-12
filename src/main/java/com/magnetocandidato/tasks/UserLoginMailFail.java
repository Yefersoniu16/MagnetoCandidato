package com.magnetocandidato.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;


import static com.magnetocandidato.userinterfaces.LoginPage.*;
import static com.magnetocandidato.utils.Contant.EMAIL_SYMBOL_FAIL;
import static com.magnetocandidato.utils.Contant.PASSWORD;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UserLoginMailFail implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(EMAIL_SYMBOL_FAIL).into(EMAIL_USER),
                Enter.theValue(PASSWORD).into(PASSWORD_USER)


        );
    }
public static UserLoginMailFail loginPageSymbolFail(){
        return instrumented(UserLoginMailFail.class);}
}
