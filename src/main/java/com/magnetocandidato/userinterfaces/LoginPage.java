package com.magnetocandidato.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target EMAIL_USER = Target.the("Emeil del usuario").
            located(By.id("email"));
    public static final Target PASSWORD_USER = Target.the("Contraseña del usuario").
            located(By.id("password"));
    public static final Target  BUTTON_INGRESAR = Target.the("Botton ingresar").
            located(By.xpath("//button[@class='ant-btn ant-btn-primary card__container__button--primary card__container__button--primary--soft']"));
    public static final Target CHECK_MAIL  = Target.the("Mensaje de dato incorrecto").
            located(By.xpath("//div[@class='ant-form-item-explain ant-form-item-explain-error']"));

}
//(//button[@class='ant-btn card__container__button--secundary social-media__button'])[1]

//div[@class='ant-form-item-explain ant-form-item-explain-error']