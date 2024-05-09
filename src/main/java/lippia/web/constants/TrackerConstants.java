package lippia.web.constants;

public class TrackerConstants {

    public static final String TIME_TRACKER = "xpath://span[text()='TIME TRACKER']";
    public static final String CALENDAR = "xpath://span[text()='Calendar']";
    public static final String DASHBOARD = "xpath://span[text()='Dashboard']";
    public static final String REPORTS = "xpath://span[text()='Reports']";
    public static final String PROJECTS = "xpath://span[contains(.,'Projects')]";
    public static final String TEAM = "xpath://span[contains(.,'Team')]";
    public static final String CLIENTS = "xpath://span[contains(.,'Clients')]";
    public static final String TAGS = "xpath://span[contains(.,'Tags')]";
    public static final String SETTINGS = "xpath://span[contains(.,'Settings')]";

    public static final String USER = "xpath://*[@id=\"topbar-menu\"]/div/div[2]/div/app-user-settings/div/div/a/avatar/div";
    public static final String LOGOUT = "xpath://A[@data-cy='logout']";

}
