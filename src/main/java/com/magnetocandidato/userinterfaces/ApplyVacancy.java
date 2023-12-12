package com.magnetocandidato.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ApplyVacancy {

    public static final Target SEARCH  = Target.the("Buscador de vacante ingresando la categoria").
            located(By.xpath("//div[@class='mg_searchbar_SearchbarComponent_ek9y1']//form//input"));
    public static final Target TITTLE_VACANCY  = Target.the("Vacante").
            located(By.xpath("(//td[@class='ant-table-cell'])[2]"));
    public static final Target BUTTON_APPLY_VACANCY  = Target.the("Botton Aplicar a Vacante").
            located(By.xpath("//button[@class='application-button apply-btn']"));
    public static final Target  ANSWER_ONE = Target.the("Botton respuesta uno prefiltro").
            located(By.xpath("(//button[@class='question-possible-answer-button'])[1]"));
    public static final Target  SEND_ANSWER = Target.the("Botton enviar respuesta ").
            located(By.xpath("//button[@class='send-answer-btn send-btn']"));
    public static final Target  SUGGESTED_BUTTONS = Target.the("Botton procesos Sugeridos ").
            located(By.xpath("(//a[@class='mg_header_tab_headerTabComponent_13m5r'])[1]"));
    public static final Target  ACTIVE_PROCESSES_BUTTON = Target.the("Botton procesos activos ").
            located(By.xpath("(//a[@class='mg_header_tab_headerTabComponent_13m5r'])[3]"));
    public static final Target VERIFY_PROCESS  = Target.the("Verificar mis procesos  ").
            located(By.xpath("//div[@class='processesNavbar_title']"));

}
