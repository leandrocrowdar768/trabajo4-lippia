package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import lippia.web.constants.ProjectConstants;

public class ProjectServices {
    public static void elClienteSeleccionaProject() {
        WebActionManager.click(ProjectConstants.MAS_PROJECT_ICON);
    }

    public static void elClienteSeleccionaCreateNewProject() {
        WebActionManager.click(ProjectConstants.CREATE_NEW_PROJECT);
    }

    public static void elClienteIngresaDatosDelProyecto() {
        int longitud;
        longitud = 4;
        String gen_nombre_proyecto = "";
        for (int cont = 1; cont <= longitud; cont++) {
            int num = (int) ((Math.random() * (('z' - 'a') + 1)) + 'a');
            char letra = (char) num;
            gen_nombre_proyecto = gen_nombre_proyecto + letra;
        }
        WebActionManager.setInput(ProjectConstants.ENTER_PROJECT_NAME, gen_nombre_proyecto);
        }


        public static void elClienteHaceClickEnCreate () throws InterruptedException {
        WebActionManager.waitPresence(ProjectConstants.CREAR_PROJECT);
            WebActionManager.waitClickable(ProjectConstants.CREAR_PROJECT);
            WebActionManager.click(ProjectConstants.CREAR_PROJECT);
//            Thread.sleep(5000);
        }

    public static void seMuestraMensajeDeCreacionExitosa() {
        WebActionManager.isPresent(ProjectConstants.MSJ_CONFIRMACION);
    }

}
