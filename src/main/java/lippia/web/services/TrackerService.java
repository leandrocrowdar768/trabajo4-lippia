package lippia.web.services;

import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java8.Tr;
import lippia.web.constants.TrackerConstants;

public class TrackerService {


    public static void ValidarIconos() {
        WebActionManager.isPresent(TrackerConstants.TIME_TRACKER);
        WebActionManager.isPresent(TrackerConstants.CALENDAR);
        WebActionManager.isPresent(TrackerConstants.DASHBOARD);
        WebActionManager.isPresent(TrackerConstants.REPORTS);
        WebActionManager.isPresent(TrackerConstants.PROJECTS);
        WebActionManager.isPresent(TrackerConstants.TEAM);
        WebActionManager.isPresent(TrackerConstants.CLIENTS);
        WebActionManager.isPresent(TrackerConstants.TAGS);
        WebActionManager.isPresent(TrackerConstants.SETTINGS);
    }
}
