import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.prefs.Preferences;
import javax.swing.*;

public class AppSettings {
    private static final String PREFS_FILE = "appIDE.conf.xml";
    private static final String PREFS_NODE = "appIDE";




    private Properties prfLd;
    private Preferences prefs;
    private HashMap<String, JComponent> pf;
    private JCheckBox cb01;

    public AppSettings() {



    }

    public AppSettings(boolean showGui) {
        prefs = Preferences.userRoot().node(PREFS_NODE);
        prfLd = new Properties();
        pf = new HashMap<>();
        cb01 = new JCheckBox("Opcja1");

        if (showGui){
            createAndShowGui();
        }
    }

    private void createAndShowGui() {
        JDialog dialog = new JDialog((JFrame) null,"Preferences",true);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        dialog.addWindowFocusListener(new WindowAdapter() {
            @Override
            public void windowClosed(WindowEvent e){
                closeWindow(true);
            }
            @Override
            public void windowOpened(WindowEvent e){
                readPrefs();
            }
        });
        //ZAWARTOSC
        JPanel contentPanel = new JPanel(new BorderLayout());
        contentPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        //ETYKIETA
        JLabel label = new JLabel("Settings");
        contentPanel.add(label,BorderLayout.NORTH);
        //KONTROLKI
        JPanel controlPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        //PRZYCISK
        JButton bttn = new JButton("Zapisz");
        bttn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                closeWindow(true);
            }
        });
        controlPanel.add(bttn);

        //POLE ZAZNACZENIA
        controlPanel.add(cb01);

        //POLE WYBORU
        JComboBox<String> comboBox = new JComboBox<>(new String[]{"Opcja1", "Opcja2","Opcja3"});
        controlPanel.add(comboBox);

        contentPanel.add(controlPanel,BorderLayout.CENTER);

        dialog.setContentPane(contentPanel);
        dialog.pack();
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);


    }
    private void CloseWindow(){
        System.exit(0);
    }


    private void closeWindow(boolean store) {
       if (store){
           storePrefs();
       }
       System.exit(0);
    }

    public String get(String key) {
        return prefs.get(key,"");


    }

    public String get(String key, String def) {
        return prefs.get(key,def);

    }

    public void put(String key, int value) {
       prefs.putInt(key,value);
    }

    private void storePrefs() {
        try{
            FileOutputStream fos;
            fos = new FileOutputStream(PREFS_FILE);
            prfLd.storeToXML(fos,null);
            fos.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }

    private void readPrefs() {

    }

    private void readPrefs(boolean file) {

    }
   public void get(){
        return;
   }


}
