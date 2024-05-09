package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.LoginServices;
import lippia.web.services.TrackerService;
import lippia.web.services.WorkspaceService;

public class WorkspaceSteps extends PageSteps {
    @Given("El cliente selecciona administrar workspace")
    public void elClienteSeleecionaAdiministrarWorkspace() throws InterruptedException {
        WorkspaceService.AdministrarWorkspace();
    }

    @When("El cliente selecciona la opcion Create New Workspace")
    public void elClienteSeleccionaLaOpcionCreateNewWorkspace() throws InterruptedException {
        WorkspaceService.createNewWorkspace();
    }

    @When("ingreso nombre del nuevo workspace {string}")
    public void ingresoNombreDelNuevoWorkspace(String cadenaAleatoria) {
        WorkspaceService.generarNombreWorkspace(cadenaAleatoria);
    }

}
