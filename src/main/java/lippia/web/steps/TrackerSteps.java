package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.Then;
import lippia.web.constants.TrackerConstants;
import lippia.web.services.TrackerService;

public class TrackerSteps extends PageSteps  {

    @Then("El cliente verifica que esta en la pagina inicial de cliente logueado")
    public void elClienteVerificaQueEstaEnLaPaginaInicialDeClienteLogueado() {
        TrackerService.ValidarIconos();
    }

    @Then("cierra sesion")
    public void cierraSesion() {
        WebActionManager.click(TrackerConstants.USER);
        WebActionManager.click(TrackerConstants.LOGOUT);
    }
}
