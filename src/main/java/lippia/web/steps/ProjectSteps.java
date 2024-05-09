package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lippia.web.services.HomeService;
import lippia.web.services.ProjectServices;

public class ProjectSteps extends PageSteps {

    @When("El cliente selecciona Project")
    public void elClienteSeleccionaProject() {
        ProjectServices.elClienteSeleccionaProject();
    }

    @When("El cliente selecciona Create new Project")
    public void elClienteSeleccionaCreateNewProject() {
        ProjectServices.elClienteSeleccionaCreateNewProject();
    }

    @When("El cliente ingresa datos del proyecto")
    public void elClienteIngresaDatosDelProyecto() {
        ProjectServices.elClienteIngresaDatosDelProyecto();
    }

    @When("El cliente hace click en Create")
    public void elClienteHaceClickEnCreate() throws InterruptedException {
        ProjectServices.elClienteHaceClickEnCreate();
    }

    @Then("se muestra mensaje de creacion exitosa")
    public void seMuestraMensajeDeCreacionExitosa() {
        ProjectServices.seMuestraMensajeDeCreacionExitosa();
    }
}
