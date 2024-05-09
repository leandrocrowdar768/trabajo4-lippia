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

    public static void elClienteIngresaNombreDelNuevoWorkspace() {
        int longitud;
        longitud = 8;
        String gen_nombre_workspace = "";
        for (int cont = 1; cont <= longitud; cont++) {
            int num = (int) ((Math.random() * (('z' - 'a') + 1)) + 'a');
            char letra = (char) num;
            gen_nombre_workspace = gen_nombre_workspace + letra;
        }
        WebActionManager.setInput(WorkspaceConstants.WORKSPACE_NAME, gen_nombre_workspace);
    }


    public static void seleccionoLaOpcionSettings() {
        WebActionManager.click(WorkspaceConstants.SETTINGS);
    }

    public static void ingresoUnNuevoNombreDeWorkspaceEnElCampoWorkspaceName() {
        int longitud;
        longitud = 8;
        String gen_nombre_workspace = "";
        for (int cont = 1; cont <= longitud; cont++) {
            int num = (int) ((Math.random() * (('z' - 'a') + 1)) + 'a');
            char letra = (char) num;
            gen_nombre_workspace = gen_nombre_workspace + letra;
        }
        WebActionManager.setInput(WorkspaceConstants.WORKSPACE_NAME_SETTINGS, gen_nombre_workspace);
        WebActionManager.click(WorkspaceConstants.DESPLEGAR_WORKSPACE);
    }

    public static void seMuestraMensajeEmergenteWorkspaceSettingsHaveBeenUpdated() {
        WebActionManager.isPresent(WorkspaceConstants.MSJ_CONFIRMACION);
    }
}