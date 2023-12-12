package com.magnetocandidato.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CandidateProfile {

    public static final Target VERIFY_LOGIN_SUCCESSFUL  = Target.the("Verificar login correcto").
            located(By.xpath("//h2[@class='fill-profile__progress-title']"));
}
