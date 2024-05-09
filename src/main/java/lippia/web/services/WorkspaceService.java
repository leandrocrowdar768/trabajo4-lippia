package lippia.web.services;
import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.WorkspaceConstants;
import java.util.concurrent.ThreadLocalRandom;

public class WorkspaceService {


    public static void AdministrarWorkspace() throws InterruptedException {
        WebActionManager.click(WorkspaceConstants.DESPLEGAR_WORKSPACE);
        WebActionManager.click(WorkspaceConstants.MANAGE_WORKSPACE);
        Thread.sleep(5000);
    }

    public static void createNewWorkspace() throws InterruptedException {
        WebActionManager.waitPresence(WorkspaceConstants.CREATE_NEW_WORKSPACE_BUTTON);
        WebActionManager.waitClickable(WorkspaceConstants.CREATE_NEW_WORKSPACE_BUTTON);
        Thread.sleep(5000);
        WebActionManager.click(WorkspaceConstants.CREATE_NEW_WORKSPACE_BUTTON);
        Thread.sleep(5000);
    }

    public static void generarNombreWorkspace(String cadenaAleatoria) {
        WebActionManager.setInput(WorkspaceConstants.WORKSPACE_NAME, cadenaAleatoria);

    }


}