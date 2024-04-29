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
}
