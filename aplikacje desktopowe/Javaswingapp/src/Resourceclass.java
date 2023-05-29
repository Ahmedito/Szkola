import java.util.ResourceBundle;

public class Resourceclass {
    private static ResourceBundle bundle;

    public static String getKey(String key){
        if(!bundle.containsKey(key))
            return key;
        return bundle.getString(key);
    }
    public static void initalize(String lang) {
        if(lang == null){
            lang = "En";
        }
        try{
            bundle = ResourceBundle.getBundle("language_"+lang);
        } catch (Exception e){
            bundle = ResourceBundle.getBundle("language_En");
        }
    }
}
