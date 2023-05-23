import java.util.HashMap;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.prefs.Preferences;

public class App {

        private static AppSettings conf;
        private static ResourceBundle res;
        private static Locale loc;
        private static HashMap<String, Locale> locale;
        private static String appLang;
        private static String winCenter;
        private static String winKeepPos;



    public static void saveSettings() {
        Preferences prefs = Preferences.userRoot().node(App.class.getName());
        prefs.put("winCenter", String.valueOf(winCenter));
        prefs.put("winKeepPos", String.valueOf(winKeepPos));
        prefs.put("appLang", appLang);
    }

    public static void loadSettings() {
        Preferences prefs = Preferences.userRoot().node(App.class.getName());
        winCenter = prefs.get("winCenter", "");
        winKeepPos = prefs.get("winKeepPos", "");
        appLang = prefs.get("appLang", Locale.getDefault().getLanguage());
    }

    public void get() {
        return;


    }
}
