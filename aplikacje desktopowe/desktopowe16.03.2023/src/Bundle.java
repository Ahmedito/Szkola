import java.util.ListResourceBundle;

public class Bundle extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return new Object[][]{
                {"appName", "Prototype IDE"},
                {"menuFile", "File"},
                {"menuEdit", "Edit"},
                {"menuView", "View"},
                {"menuHelp", "Help"}
        };
    }
}
