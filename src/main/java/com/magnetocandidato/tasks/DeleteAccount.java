package com.magnetocandidato.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.magnetocandidato.userinterfaces.RegisterBronze.*;
import static com.magnetocandidato.userinterfaces.RegisterBronze.CONFIRM_DELETION;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteAccount implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                //Prueva eliminación
                Click.on(SELECT_AVATAR),
                Click.on(BUTTON_SETTING),
                Click.on(BUTTON_DELETE),
                Click.on(CONFIRM_DELETION));

    }
    public static DeleteAccount delete(){
        return instrumented(DeleteAccount.class);
    }
}
