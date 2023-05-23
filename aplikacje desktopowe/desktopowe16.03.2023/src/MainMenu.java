import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MainMenu extends JMenuBar implements ActionListener {

    JFrame box;
    JPanel pnl;
    JMenu menu, submenu;
    JMenuItem mi1,mi2,mi3,mi4,mi5,mi6;

    MainMenu(JFrame box,JPanel pnl){
        this.box = box;
        this.pnl = pnl;
        menu = new JMenu("Plik");
        menu.setMnemonic(KeyEvent.VK_P);
        submenu = new JMenu("TESTMenu1");
        mi1 = new JMenu("Nowy");
        mi2 = new JMenu("Otwórz");
        mi3 = new JMenu("Preferencje");
        mi4 = new JMenu("Opcja 4");
        mi5 = new JMenu("Opcja 5");
        mi6 = new JMenu("Wyjście");
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);
        mi5.addActionListener(this);
        mi6.addActionListener(this);
        menu.add(mi1);
        menu.add(mi2);
        menu.add(mi3);
        submenu.add(mi4);
        submenu.add(mi5);
        menu.add(submenu);
        menu.add(mi6);
        this.add(menu);
    }


    public void actionPerformed(ActionEvent e) {
        Object src = e.getSource();
        if (src == mi1)
            pnl.setBackground(Color.RED);
        if (src == mi2)
            pnl.setBackground(Color.DARK_GRAY);
        if (src == mi3) {
            pnl.setBackground(Color.BLACK);
         //   AppSettings as = new AppSettings();
        }
    }
    public void get() {
        return;


    }

}
