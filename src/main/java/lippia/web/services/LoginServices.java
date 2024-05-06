package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.LoginConstants;

public class LoginServices {
    public static void clickLoginManual(){
        WebActionManager.click(LoginConstants.LOGIN_MANUALLY);
    };

    public static void ingresarEmail(String email) {
        WebActionManager.setInput(LoginConstants.EMAIL_IMPUT, email);
    }

    public static void ingresarContrasena(String password) {
        WebActionManager.setInput(LoginConstants.PASSWORD_IMPUT,password);
    }

    public static void clickLogin() {
        WebActionManager.click(LoginConstants.LOGIN_BUTTON);
    }

    public static void clickContinueWihtEmail() {
        WebActionManager.click(LoginConstants.CONTINUE_WHITH_EMAIL);
    }

    public static void seMuestraMensajeEmailFormat(){
        WebActionManager.isVisible(LoginConstants.EMAIL_NOT_VALID);
    }

    public static void ingresarConfirmacionIncorrecto() {
        WebActionManager.setInput(LoginConstants.VERIFICATION_CODE_1, "1");
        WebActionManager.setInput(LoginConstants.VERIFICATION_CODE_2, "1");
        WebActionManager.setInput(LoginConstants.VERIFICATION_CODE_3, "1");
        WebActionManager.setInput(LoginConstants.VERIFICATION_CODE_4, "1");
        WebActionManager.setInput(LoginConstants.VERIFICATION_CODE_5, "1");
        WebActionManager.setInput(LoginConstants.VERIFICATION_CODE_6, "1");
    }

    public static void seMuestraMensajeCodeNotValid() {
        WebActionManager.isPresent(LoginConstants.CODE_NOT_VALID);
    }

    public static void forgotPassword() {
        WebActionManager.click(LoginConstants.FORGOT_PASSWORD);
    }

    public static void resetPassword() {
        WebActionManager.click(LoginConstants.RESET_PASSWORD_BUTTON);
    }

    public static void seMuestraMensajeParaResetPassword() {
        WebActionManager.isPresent(LoginConstants.MENSAJE_RESET_PASSWORD);

    }
}
