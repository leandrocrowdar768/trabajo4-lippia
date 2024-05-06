package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomeService;
import lippia.web.services.LoginServices;

public class LoginSteps extends PageSteps {

    @Given("El cliente esta en la pagina principal")
    public void elClienteEstaEnLaPaginaPrincipal() {
        HomeService.navegarWeb();
    }

    @When("El cliente hace click en Inicia la sesion")
    public void elClienteHaceClickEnIniciaLaSesion() {
        HomeService.clickIniciaSesion();
    }

    @When("El cliente hace click en la opcion login manual")
    public void elClienteHaceClickEnLaOpcionLoginManual() {
        LoginServices.clickLoginManual();
    }

    @When("El cliente ingresa correo electronico {string}")
    public void elClienteIngresaCorreoElectronico(String email) {
        LoginServices.ingresarEmail(email);
    }

    @When("El cliente ingresa contrasena {string}")
    public void elClienteIngresaContrasena(String password) {
        LoginServices.ingresarContrasena (password);
    }

    @When("El cliente hace click en el boton Log In")
    public void elClienteHaceClickEnElBotonLogIn() {
        LoginServices.clickLogin();
    }


    @When ("El cliente hace click el boton Continue with email")
    public void elClienteHaceClickElBotonContinueWithEmail() {
        LoginServices.clickContinueWihtEmail ();
    }

    @Then("se muestra mensaje Email format is not valid")
    public void seMuestraMensajeEmailFormat() {
        LoginServices.seMuestraMensajeEmailFormat();
    }

    @And("ingreso codigo de confirmacion incorrecto")
    public void ingresoCodigoDeConfirmacionIncorrecto() {
        LoginServices.ingresarConfirmacionIncorrecto ();
    }

    @Then("se muestra mensaje That code isnt valid Please try again")
    public void seMuestraMensajeThatCodeIsntValidPleaseTryAgain() {
        LoginServices.seMuestraMensajeCodeNotValid ();
    }

    @When("El cliente seleciona la opcion Forgot Password")
    public void elClienteSelecionaLaOpcionForgotPassword() {
        LoginServices.forgotPassword ();
    }

    @When("El cliente hace click en el boton Reset Password")
    public void elClienteHaceClickEnElBotonResetPassword() {
        LoginServices.resetPassword ();
    }

    @Then("se muestra mensaje emergente para resetear password")
    public void seMuestraMensajeEmergenteParaResetearPassword() {
        LoginServices.seMuestraMensajeParaResetPassword ();
    }
}
