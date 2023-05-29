import javax.swing.*;
import java.awt.*;

public class Toolbar extends JToolBar {
    JButton Otworz = new JButton(Resourceclass.getKey("Otworz"));
    JButton Zapisz = new JButton(Resourceclass.getKey("Zapisz"));
    JButton Kopiuj = new JButton(Resourceclass.getKey("Kopiuj"));
    JButton Wklej = new JButton(Resourceclass.getKey("Wklej"));
    JButton Zapiszjako = new JButton(Resourceclass.getKey("Zapiszjako"));
    JButton Archive = new JButton((Resourceclass.getKey("Archive")));
    JToolBar toolBar = new JToolBar();

    Filehandler filehandler = new Filehandler();
    Dimension menusize = new Dimension(10, 70);

    Toolbar(JTextArea textArea, JTextArea textArea2, LefSidebar lefSidebar){
        toolBar.setFloatable(false);
        toolBar.setMinimumSize(menusize);
        Archive.setFont(new Font("Times new Roman", Font.BOLD, 15));
        Otworz.setFont(new Font("Times new Roman", Font.BOLD, 15));
        Zapisz.setFont(new Font("Times new Roman", Font.BOLD, 15));
        Kopiuj.setFont(new Font("Times new Roman", Font.BOLD, 15));
        Wklej.setFont(new Font("Times new Roman", Font.BOLD, 15));
        Zapiszjako.setFont(new Font("Times new Roman", Font.BOLD, 15));

        filehandler.copy(Kopiuj, textArea);
        filehandler.paste(Wklej, textArea);
        filehandler.openDirectory(Otworz, lefSidebar);
        filehandler.saveas(textArea, textArea2, Zapiszjako);


        toolBar.addSeparator();
        toolBar.add(Otworz);
        toolBar.add(Zapiszjako);
        toolBar.addSeparator();
        toolBar.add(Kopiuj);
        toolBar.add(Wklej);
        toolBar.add(Zapisz);
        toolBar.add(Archive);
        toolBar.addSeparator();
        toolBar.setVisible(true);
        add(toolBar);
    }

}
