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

    @When("El cliente ingresa contraseña {string}")
    public void elClienteIngresaContraseña(String password) {
        LoginServices.ingresarContraseña (password);
    }

    @When("El cliente hace click en el boton Log In")
    public void elClienteHaceClickEnElBotonLogIn() {
        LoginServices.clickLogin()

    }


}
