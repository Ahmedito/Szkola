import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.server.RMIServerSocketFactory;
import java.util.HashMap;
import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

public class AppSettings extends JDialog{
    String PREFERENCESFILE = "appIDE.conf.xml";
    String NODE = "appIDE";
    Preferences prefs;
    Preferences prfLd;
    HashMap<String, JComponent> pf = new HashMap<>();
    JCheckBox cb0;

    JDialog window = new JDialog();
    JLabel dostępneUstawienia;
    JButton buttonodrzuć = new JButton(Resourceclass.getKey("buttonodrzuć"));
    JButton buttonzachowaj = new JButton(Resourceclass.getKey("buttonzachowaj"));

    JCheckBox uruchomWysrodkowane = new JCheckBox(Resourceclass.getKey("uruchomWysrodkowane"));
    JCheckBox uruchomZmaksymalizowane = new JCheckBox(Resourceclass.getKey("uruchomZmaksymalizowane"));
    JCheckBox zapamietajPozycje = new JCheckBox(Resourceclass.getKey("zapamietajPozycje"));
    JCheckBox zapamietajRozmiar = new JCheckBox(Resourceclass.getKey("zapamietajRozmiar"));

    JLabel jezykInterfejsu = new JLabel(Resourceclass.getKey("jezykInterfejsu"));
    String Polski = Resourceclass.getKey("Polski");
    String Angielski = Resourceclass.getKey("Angielski");
    String s1[] = {Polski, Angielski};
    JComboBox comboBox = new JComboBox();

    JCheckBox zapamietajkatalogprzegladania = new JCheckBox(Resourceclass.getKey("zapamietajkatalogprzegladania"));
    JCheckBox zapametajotwartepliki = new JCheckBox(Resourceclass.getKey("zapametajotwartepliki"));

    JCheckBox ukryjmenuglowne = new JCheckBox(Resourceclass.getKey("ukryjmenuglowne"));
    JCheckBox odpietypaseknarzedziowy = new JCheckBox(Resourceclass.getKey("odpietypaseknarzedziowy"));
    JCheckBox zablokujpaseknarzedziowy = new JCheckBox(Resourceclass.getKey("zablokujpaseknarzedziowy"));
    JCheckBox trybciemny = new JCheckBox(Resourceclass.getKey("trybciemny"));

    JPanel top = new JPanel();
    JPanel top2 = new JPanel();
    JPanel bot1 = new JPanel();
    JPanel bot2 = new JPanel();

    AppSettings() {
        GridLayout layout = new GridLayout(4, 1);
        window.getContentPane().setLayout(layout);

            buttonzachowaj.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    storePrefs();
                }
            });


        dostępneUstawienia = new JLabel(Resourceclass.getKey("dostępneUstawienia"));
        top.add(dostępneUstawienia);
        top.add(buttonodrzuć);
        top.add(buttonzachowaj);

        top2.add(uruchomWysrodkowane);
        top2.add(uruchomZmaksymalizowane);
        top2.add(zapamietajPozycje);
        top2.add(zapamietajRozmiar);

        bot1.add(jezykInterfejsu);
        comboBox = new JComboBox(s1);
        bot1.add(comboBox);
        bot1.add(zapamietajkatalogprzegladania);
        bot1.add(zapametajotwartepliki);

        bot2.add(ukryjmenuglowne);
        bot2.add(odpietypaseknarzedziowy);
        bot2.add(zablokujpaseknarzedziowy);
        bot2.add(trybciemny);

        Border okno = BorderFactory.createTitledBorder(Resourceclass.getKey("okno"));
        top2.setLayout(new BoxLayout(top2, BoxLayout.Y_AXIS));
        top2.setBorder(okno);

        Border IDE = BorderFactory.createTitledBorder(Resourceclass.getKey("IDE"));
        bot1.setLayout(new BoxLayout(bot1, BoxLayout.Y_AXIS));
        bot1.setBorder(IDE);

        Border GUI = BorderFactory.createTitledBorder(Resourceclass.getKey("GUI"));
        bot2.setLayout(new BoxLayout(bot2, BoxLayout.Y_AXIS));
        bot2.setBorder(GUI);


        window.getContentPane().add(top);
        window.getContentPane().add(top2);
        window.getContentPane().add(bot1);
        window.getContentPane().add(bot2);

        window.setResizable(false);
        window.setPreferredSize(new java.awt.Dimension(400, 600));
        window.pack();
        window.setVisible(true);
    }

    public void createAndShowGUI() {

    }

    public void closeWindow() {

    }

    public void closeWindow(boolean store) {

    }

    public void storePrefs(){
        prefs = Preferences.userRoot().node(NODE);

        prefs.putBoolean("uruchomWysrodkowane", uruchomWysrodkowane.isSelected());
        prefs.putBoolean("uruchomZmaksymalizowane", uruchomZmaksymalizowane.isSelected());
        prefs.putBoolean("zapamietajPozycje", zapamietajPozycje.isSelected());
        prefs.putBoolean("zapamietajRozmiar", zapamietajRozmiar.isSelected());
        prefs.put("jezykInterfejsu", (String) comboBox.getSelectedItem());
        prefs.putBoolean("zapamietajkatalogprzegladania", zapamietajkatalogprzegladania.isSelected());
        prefs.putBoolean("zapametajotwartepliki", zapametajotwartepliki.isSelected());
        prefs.putBoolean("ukryjmenuglowne", ukryjmenuglowne.isSelected());
        prefs.putBoolean("odpietypaseknarzedziowy", odpietypaseknarzedziowy.isSelected());
        prefs.putBoolean("zablokujpaseknarzedziowy", zablokujpaseknarzedziowy.isSelected());
        prefs.putBoolean("trybciemny", trybciemny.isSelected());
        prefs.put("jezykInterfejsu", (String) comboBox.getSelectedItem());


        try {
            prefs.exportSubtree(new FileOutputStream(PREFERENCESFILE));
        } catch (IOException | BackingStoreException e) {
            e.printStackTrace();
        }
    }

    public void readPrefs(){

    }

    public void readPrefs(boolean file){

    }

}
