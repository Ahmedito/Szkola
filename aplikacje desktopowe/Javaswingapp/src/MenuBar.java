import javax.swing.*;
import java.awt.*;

public class MenuBar extends JMenuBar {
    JMenu menu = new JMenu(Resourceclass.getKey("menu"));
    MenuBar(){
        JMenuItem Preferencje = new JMenuItem(Resourceclass.getKey("Preferencje"));

        Preferencje.addActionListener(e -> {
            AppSettings appSettings = new AppSettings();
        });

        menu.setSize(new Dimension(30,20));
        menu.add(Preferencje);
        add(menu);
    }
}
