package com.magnetocandidato.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegisterBronze {
    public static final Target ACCEPT_COOKIES  = Target.the("Aceptar cookies ").
            located(By.xpath("//button[@class='mgbutton moove-gdpr-infobar-allow-all gdpr-fbo-0']"));
   /* public static final Target CLICK_CREATE_REGISTER  = Target.the("Clic en el boton crear hoja de vida").
            located(By.xpath("//a[@class='cta invoker-signup']"));*/
   public static final Target CLICK_CREATE_REGISTER  = Target.the("Clic en el boton crear hoja de vida").
           located(By.xpath("(//button[@class='mg_main_button_MainButtonComponent_17rwc undefined'])[3]"));
    public static final Target CLICK_CREATE_ALTERNATIVO = Target.the("Crear cuenta alternativo ").
            located(By.xpath("//button[@class='floatLog_floatLog_button-btnRegister__uiPz9']"));
    public static final Target INPUT_EMAIL_REGISTER  = Target.the("Campo donde va el correo de registro").
            located(By.id("email-info_email"));
    public static final Target INPUT_CONFIRMATION_EMAIL_REGISTER  = Target.the("Campo donde va el correo de Confirmacon").
            located(By.id("email-info_emailConfirmation"));
    public static final Target CHECK_DATA_PROCESSING  = Target.the("Chequeo tratamiento de datos").
            located(By.id("email-info_auxTerms"));
    public static final Target FINAL_CHECK_CONDITIONS  = Target.the("Chequeo termino de condiciones").
            located(By.id("email-info_acceptTerms"));
 public static final Target BUTTON_CREATE_ACCOUNT  = Target.the("Boton crear cuenta").
         located(By.xpath("(//button[@class='ant-btn ant-btn-lg widget-signup__action--next'])"));
    public static final Target BUTTON_NEXT  = Target.the("Boton siguiente").
            located(By.xpath("//button[@class='ant-btn widget-signup__action--next']"));
    public static final Target INPUT_NAME_REGISTER  = Target.the("Campo donde va el Nombre para el registro").
            located(By.id("personal-info_firstName"));
    public static final Target INPUT_LAST_REGISTER  = Target.the("Campo donde va el apellido para el registro").
            located(By.id("personal-info_lastName"));
    public static final Target CHECK_PRIVACY_POLICIES  = Target.the("Check politicas ").
            located(By.xpath("//input[@class='ant-checkbox-input']"));
    public static final Target INPUT_PASSWORD_REGISTER  = Target.the("Campo donde va la contraseña").
            located(By.id("password-section_password"));
    public static final Target INPUT_PASSWORD_CONFIRMATION_REGISTER  = Target.the("Campo donde confirma contraseña").
            located(By.id("password-section_passwordConfirmation"));
    public static final Target GO_TO_PROFILE  = Target.the("Boton mas tarde para ir al perfil").
            located(By.xpath("//a[@class='widget-signup__finish-step--no-continue-action']"));
    public static final Target BUTTON_CONTINUE_REGISTER_SILVER  = Target.the("Boton para continuar con el registro").
            located(By.id("account-created_continue"));
    public static final Target INPUT_CATEGORIES  = Target.the("Campo donde se ingresan las categorias laborales ").
            located(By.xpath("//button[@class='mg_drop_down_button_magneto-ui-drop-down-button_1yeqt']"));
    public static final Target SELECT_CATEGORIES_ONE  = Target.the("Seleccionar una categorias laboral").
            located(By.xpath("/html/body/div[5]/div[3]/button[1]"));
    public static final Target SELECT_CATEGORIES_TWO  = Target.the("Seleccionar una categorias laboral").
            located(By.xpath("(//button[@class='mg_select_item_magneto-ui-select-item_r3q4f '])[2]"));
    public static final Target SELECT_CATEGORIES_THREE  = Target.the("Seleccionar una categorias laboral").
            located(By.xpath("(//button[@class='mg_select_item_magneto-ui-select-item_r3q4f '])[3]"));
    public static final Target INPUT_PROFESSION  = Target.the("Campo donde va la profession").
            located(By.id("select-job-sectors_titleOrProfession"));
    public static final Target INPUT_FREQUENCY  = Target.the("Campo donde va la frecuencia de salario").
            located(By.name("salaryFrequencyId"));
    public static final Target CLICK_FREQUENCY  = Target.the("Clic en frecuencia mensual").
            located(By.xpath("(//div[@class='ant-select-item ant-select-item-option ant-select-item-option-active ant-select-item-option-selected'])"));
    public static final Target INPUT_SALARY  = Target.the("Campo donde va salario").
            located(By.id("select-job-sectors_salary"));
    public static final Target INPUT_CITY_JOD  = Target.the("Campo donde va la ciudad donde quiere trabajar ").
            located(By.id("select-job-sectors_workCityId"));
    public static final Target CLICK_CITY_ONE  = Target.the("Click en el la ciudad elegida ").
            located(By.xpath("(//div[@class='ant-select-item-option-content'])[14]"));
    public static final Target CLICK_CITY  = Target.the("Click en el la ciudad elegida ").
            located(By.xpath("(//div[@class='ant-select-item-option-content'])[1]"));
    public static final Target WORK_MODE_CHECK  = Target.the("Check de en trabajo remoto ").
            located(By.id("select-job-sectors_availableToRemoteWork"));
    public static final Target BUTTON_AVAILABILITY  = Target.the("Boton de disponibilidad").
            located(By.xpath("(//label[@class='ant-checkbox-wrapper'])[1]"));
    public static final Target VERY  = Target.the("Texto de verificación").
            located(By.xpath("//div[@class='fill-profile__progress-info__subtitle']"));
   public static final Target BUTTON_CREATE_HV  = Target.the("Boton para continuar con el registro gold").
           located(By.xpath("//button[@class='ant-btn ant-btn-lg widget-signup__finish-step--continue-action']"));
    public static final Target BUTTON_CONTINUE_REGISTER_GOLD  = Target.the("Boton para continuar con el registro gold").
            located(By.xpath("//button[@class='ant-btn ant-btn-lg widget-signup__action--next']"));

    public static final Target BUTTON_ADD_EXPERIENCE  = Target.the("Boton para agregar una experiencia").
            located(By.xpath("//button[@class='ant-btn ant-btn-primary select-add__add-skip-button']"));
    public static final Target INPUT_NAME_POST  = Target.the("Espacio donde va el nombre del cargo").
                located(By.id("add-experiences_position"));
    public static final Target INPUT_EQUIVALENT_CHARGE  = Target.the("Espacio donde va el nombre del cargo Equivalente").
            located(By.xpath("(//button[@class='mg_drop_down_button_magneto-ui-drop-down-button_1yeqt'])"));
    public static final Target CLICK_EQUIVALENT_CHARGE  = Target.the("Click en el cargo").
            located(By.xpath("//button[@class='mg_select_item_magneto-ui-select-item_o5mff  ']"));
    public static final Target INPUT_LEVEL_CHARGE  = Target.the("Espacio donde va el nivel del cargo ").
            located(By.xpath("(//button[@class='mg_drop_down_button_magneto-ui-drop-down-button_1yeqt'])[2]"));
    public static final Target CLICK_LEVEL_CHARGE  = Target.the("Click en el nivel del cargo").
            located(By.xpath("(//button[@class='mg_select_item_magneto-ui-select-item_o5mff  '])"));
    public static final Target INPUT_COMPANY  = Target.the("Espacio donde va La empresa ").
            located(By.id("add-experiences_company"));
    public static final Target INPUT_CITY_WHERE_WORK = Target.the("Espacio donde va La ciudad donde trabajo ").
            located(By.id("add-experiences_cityId"));
    public static final Target CLICK_CITY_WORK = Target.the("Click en el nivel del cargo").
            located(By.xpath("//div[@class='ant-select-item-option-content']"));
    public static final Target INPUT_WORK_DESCRIPTION = Target.the("Espacio donde va La Descripción de trabajo ").
            located(By.id("add-experiences_description"));
    public static final Target INPUT_CURRENT_WORK_CHECK = Target.the("Espacio donde va el check de trabajo actual ").
            located(By.id("add-experiences_atPresent"));
    public static final Target INPUT_START_DATE_EXPERIENCES = Target.the("Espacio donde va Fecha de inicio").
            located(By.id("add-experiences_startDate"));
    public static final Target BUTTON_SAVE_EXPERIENCES = Target.the("Boton guardar experiencia").
            located(By.xpath("//button[@class='ant-btn ant-btn-lg widget-signup__step-experiences--save-button']"));
    public static final Target BUTTON_ADD_STUDIES  = Target.the("Boton para agregar una experiencia").
            located(By.xpath("//button[@class='ant-btn ant-btn-primary select-add__add-skip-button']"));// El mismo de agregar experiencia
    public static final Target INPUT_ADD_TITLE_STUDIES = Target.the("Espacio donde va el nombre de lo que estudio").
            located(By.id("add-studies_title"));
    public static final Target INPUT_ADD_INSTITUTION = Target.the("Espacio donde va el nombre de la institucion donde estudia").
            located(By.id("add-studies_institute"));
    public static final Target INPUT_ADD_PROFESSION = Target.the("Espacio donde va el nombre de la profesion").
            located(By.id("add-studies_profession"));
    public static final Target INPUT_COUNTRY_STUDY = Target.the("Espacio donde va el Pais de estudio").
            located(By.id("add-studies_countryId"));
    public static final Target INPUT_TYPE_STUDY = Target.the("Espacio donde va el tipo de estudio").
            located(By.xpath("//button[@class='mg_drop_down_button_magneto-ui-drop-down-button_1yeqt']"));
    public static final Target CLICK_TYPE_STUDY = Target.the("Click para seleccionar el estudio").
            located(By.xpath("(//button[@class='mg_select_item_magneto-ui-select-item_o5mff  '])[5]"));
    public static final Target INPUT_CURRENT_STUDY_CHECK = Target.the("Espacio donde va el check de estudio actual ").
            located(By.id("add-studies_inProgress"));
    public static final Target INPUT_START_DATE_STUDY = Target.the("Espacio donde va Fecha de inicio").
            located(By.id("add-studies_startDate"));
    public static final Target BUTTON_SAVE_STUDY = Target.the("Boton guardar Estudio ").
            located(By.xpath("//button[@class='ant-btn ant-btn-lg widget-signup__candidateAddStudies-save']"));
    public static final Target INPUT_BIRTH_DATE = Target.the("Espacio donde va Fecha de NACIMIENTO").
            located(By.id("birth-info_birthdate"));
    public static final Target CLICK_BIRTHDATE = Target.the("Click en la fecha de nacimiento primer campo").
            located(By.xpath("//td[@class='ant-picker-cell ant-picker-cell-start ant-picker-cell-in-view']"));
    public static final Target INPUT_CITY_BIRTH = Target.the("Espacio donde va la ciudad de nacimiento").
            located(By.id("birth-info_cityBirthId"));
    public static final Target INPUT_NUMBER_PHONE = Target.the("Espacio donde va el numero celular").
            located(By.id("phone-location-info_phone"));
    public static final Target INPUT_CITY_LOCATION = Target.the("Espacio donde va la ciudad de ubicacion").
            located(By.id("phone-location-info_cityId"));
    public static final Target INPUT_DRESS = Target.the("Espacio donde va la direccion").
            located(By.id("phone-location-info_address"));
    public static final Target BUTTON_NEXT_LOCATION  = Target.the("Boton siguiente en la cart de locacion").
            located(By.xpath("//button[@class='ant-btn ant-btn-lg widget-signup__action--next']"));
    public static final Target BUTTON_SEX_MAN  = Target.the("Boton sexo hombre  ").
            located(By.xpath("(//label[@class='ant-radio-wrapper'])[1]"));
    public static final Target BUTTON_GENDER_MALE  = Target.the("Boton genero Mmasculino  ").
            located(By.xpath("(//label[@class='ant-radio-wrapper'])[3]"));
    public static final Target BUTTON_CONTINUE_REGISTER_FINAL  = Target.the("Boton para continuar con el registro FINAL").
            located(By.id("you-can-apply-vacancies_continue"));
    public static final Target INPUT_SKILL = Target.the("Espacio donde va las habilidades").
            located(By.id("select-skills_skills"));
    public static final Target LEVEL_SKILL = Target.the("Click en el nivel de habilidades").
            located(By.xpath("(//span[@class='square'])[4]"));
    public static final Target BUTTON_LOAD_VIDEO = Target.the("Boton para subir el video").
            located(By.xpath("(//button[@class='ant-btn widget-signup__video-presentation--video-record-buttons'])[2]"));
    public static final Target BUTTON_SELECT_LOAD = Target.the("Boton para seleccionar el video").
            located(By.xpath("//input[@type='file']"));
    public static final Target BUTTON_SAVE_LOAD = Target.the("Boton para guardar el video").
            located(By.xpath("//button[@class='ant-btn ant-btn-text save-btn']"));
    public static final Target FIELD_TEXT_DESCRIPTION  = Target.the("Campo donde va la descripcion del candidato").
            located(By.id("description-info_profileDescription"));
    public static final Target BUTTON_SAVE_PHOTO = Target.the("Boton para guardar la foto").
            located(By.xpath("//button[@class='image-action-btn save-image-btn']"));
    public static final Target CIVIL_STATUS = Target.the("estado civil").
            located(By.xpath("(//label[@class='ant-radio-wrapper'])[1]"));
    public static final Target INPUT_IDENTIFICATION  = Target.the("Input type de identificacion").
            located(By.xpath("(//button[@class='mg_drop_down_button_magneto-ui-drop-down-button_1yeqt'])"));
    public static final Target IDENTIFICATION_DOCUMENT = Target.the("Documento de identidad cedula").
            located(By.xpath("(//button[@class='mg_select_item_magneto-ui-select-item_o5mff  '])"));
    public static final Target NUMBER_IDENTIFICATION  = Target.the("Input numero de identificacion").
            located(By.id("civilStatus-numberIdentification-type_identificationNumber"));
    public static final Target ADD_CERTIFICATION = Target.the("Agregar Certificado").
            located(By.xpath("//button[@class='ant-btn ant-btn-primary select-add__add-skip-button']"));
    public static final Target INPUT_NAME_CERTIFICATION = Target.the("Input nombre certificacion").
            located(By.id("add-certifications_name"));
    public static final Target INPUT_INSTITUTION_CERTIFICATION  = Target.the("Input nombre entidad certificacion").
            located(By.id("add-certifications_institution"));
    public static final Target INPUT_CERTIFICATION_EXPIRE  = Target.the("Input check certificado no expira").
            located(By.id("add-certifications_doesNotExpire"));
    public static final Target INPUT_DATE_CERTIFICATION  = Target.the("Input Fecha de inicio ").
            located(By.xpath("//div[@class='ant-picker ant-picker-large widget-signup__candidate-add-certifications-expedition-date']"));
    public static final Target INPUT_SELECT_DATE  = Target.the("Seleccionar fecha").
            located(By.xpath("(//div[@class='ant-picker-cell-inner'])[1]"));
    public static final Target INPUT_CREDENTIAL  = Target.the("Input Credenciales ").
            located(By.id("add-certifications_credential"));
    public static final Target INPUT_URL_CERTIFICATION  = Target.the("Input url certificados ").
            located(By.id("add-certifications_credentialUrl"));
    public static final Target BUTTON_SAVE_CERTIFICATION = Target.the("Boton guardar certificado").
            located(By.id("add-certifications_saveCertifications"));
    public static final Target ADD_ACKNOWLEDGMENTS = Target.the("Agregar Reconocicmientos").
            located(By.xpath("//button[@class='ant-btn ant-btn-primary select-add__add-skip-button']"));
    public static final Target INPUT_NAME_ACKNOWLEDGMENTS = Target.the("Input nombre Reconocimiento").
            located(By.id("add-acknowledgments_name"));
    public static final Target INPUT_INSTITUTION_ACKNOWLEDGMENTS  = Target.the("Input nombre entidad Reconocimiento").
            located(By.id("add-acknowledgments_entity"));
    public static final Target INPUT_DATE_ACKNOWLEDGMENTS  = Target.the("Input Fecha de inicio reconocimiento ").
            located(By.xpath("//div[@class='ant-picker ant-picker-large widget-signup__candidateAddAcknowledgments-deliveryDate']"));
    public static final Target INPUT_URL_ACKNOWLEDGMENTS  = Target.the("Input url Reconocimiento ").
            located(By.id("add-acknowledgments_certificateUrl"));
    public static final Target BUTTON_SAVE_ACKNOWLEDGMENTS = Target.the("Boton guardar Reconocimiento").
            located(By.id("add-acknowledgments_saveAcknowledgment"));
    public static final Target CONFIRM_LOAD_CV = Target.the("Mensaje confirmacion hoja de vida").
            located(By.xpath("//div[@class='ant-message-custom-content ant-message-success']"));
    public static final Target INPUT_URL_WEBSITE  = Target.the("Input url Sitio web ").
            located(By.xpath("(//input[@class='ant-input value-item__input'])[1]"));
    public static final Target INPUT_URL_TWITTER  = Target.the("Input url Twitter ").
            located(By.xpath("(//input[@class='ant-input value-item__input'])[2]"));
    public static final Target INPUT_URL_LINKEDIN  = Target.the("Input url linkedin ").
            located(By.xpath("(//input[@class='ant-input value-item__input'])[3]"));
    public static final Target INPUT_URL_FACEBOOK  = Target.the("Input url facebook ").
            located(By.xpath("(//input[@class='ant-input value-item__input'])[4]"));
    public static final Target INPUT_HOBBIES  = Target.the("Input Hobbies ").
            located(By.xpath("//input[@class='ant-input']"));
    public static final Target NEXT_LANGUAGE  = Target.the("Siguente en lenguaje ").
            located(By.xpath("//span[contains(text(),'Siguiente')]"));
    public static final Target CLICK_LANGUAGE= Target.the("Click idioma").
            located(By.xpath("//span[@class='ant-select-arrow']"));
    public static final Target INPUT_LANGUAGE= Target.the("input idioma").
            located(By.id("languages_languages"));
    public static final Target SELECT_LANGUAGE= Target.the("Seleccionar idioma").
            located(By.xpath("//div[@class='ant-select-item-option-content']"));

    //Eliminar candidato
    public static final Target SELECT_AVATAR= Target.the("Seleccionar avatar").
            located(By.xpath("//div[@class='mg_avatar_avatarComponent_1upgt']"));
    public static final Target SELECT_AVATAR_DIAMOND = Target.the("Seleccionar avatar Diamante").
            located(By.xpath("//div[@class='mg_avatar_avatarComponent_f4h7b']"));
    public static final Target BUTTON_SETTING = Target.the("Boton de configuracion ").
            located(By.xpath("(//button[@class='mg_menu_icon_magneto-ui-menu-icon_on3ri '])[1]"));
    public static final Target BUTTON_DELETE = Target.the("Boton Eliminar la cuenta ").
            located(By.xpath("//button[@class='ant-btn ant-btn-text delete-account__action']"));
    public static final Target CONFIRM_DELETION = Target.the("Confirmación de  Eliminar la cuenta ").
            located(By.xpath("//button[@class='ant-btn ant-btn-primary delete-action']"));
    public static final Target CURRICULUM_VITAE = Target.the("Confirmación de  Eliminar la cuenta ").
            located(By.xpath("(//a[@class='mg_header_tab_headerTabComponent_1a6hv'])[6]"));
    public static final Target COUNTRY_YOU = Target.the("En que pais estas  ").
            located(By.xpath("//span[contains( text(), ' Colombia')]"));
}
