import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LefSidebar extends JList {
    LefSidebar(){
//        this.addListSelectionListener(new ListSelectionListener() {
//            @Override
//            public void valueChanged(ListSelectionEvent e) {
//                if (!e.getValueIsAdjusting()) {
//                    String selectedFile = (String) this.getSelectedValue();
//                    if (selectedFile != null) {
//                        File file = new File(directory, selectedFile);
//                        if (file.exists()) {
//                            try {
//                                BufferedReader reader = new BufferedReader(new FileReader(file));
//                                StringBuilder content = new StringBuilder();
//                                String line;
//                                while ((line = reader.readLine()) != null) {
//                                    content.append(line).append("\n");
//                                }
//                                reader.close();
//                                textArea.setText(content.toString());
//                            } catch (IOException ex) {
//                                ex.printStackTrace();
//                            }
//                        }
//                    }
//                }
//            }
    }
}