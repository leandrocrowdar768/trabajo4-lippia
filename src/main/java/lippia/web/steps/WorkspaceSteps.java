package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.*;

public class WorkspaceSteps extends PageSteps {
    @Given("El cliente selecciona administrar workspace")
    public void elClienteSeleecionaAdiministrarWorkspace() throws InterruptedException {
        WorkspaceService.AdministrarWorkspace();
    }

    @When("El cliente selecciona la opcion Create New Workspace")
    public void elClienteSeleccionaLaOpcionCreateNewWorkspace() throws InterruptedException {
        WorkspaceService.createNewWorkspace();
    }


    @When("El cliente ingresa nombre del nuevo workspace")
    public void elClienteIngresaNombreDelNuevoWorkspace() {
        WorkspaceService.elClienteIngresaNombreDelNuevoWorkspace();

    }

    @When("Selecciono la opcion Settings")
    public void seleccionoLaOpcionSettings() {
        WorkspaceService.seleccionoLaOpcionSettings ();
    }

    @And("Ingreso un nuevo nombre de workspace en el campo Workspace name")
    public void ingresoUnNuevoNombreDeWorkspaceEnElCampoWorkspaceName() {
        WorkspaceService.ingresoUnNuevoNombreDeWorkspaceEnElCampoWorkspaceName();
    }

    @Then("se muestra mensaje emergente Workspace settings have been updated")
    public void seMuestraMensajeEmergenteWorkspaceSettingsHaveBeenUpdated() {
        WorkspaceService.seMuestraMensajeEmergenteWorkspaceSettingsHaveBeenUpdated();
    }
}
