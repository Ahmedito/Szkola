import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.*;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Filehandler {
    public File directory;
    LefSidebar lefSidebar;
    String[] files;
    public void copy(JButton copy, JTextArea textAreaRead){
        copy.addActionListener(e ->{
            StringSelection stringSelection = new StringSelection(textAreaRead.getText());
            Clipboard kopiowane = Toolkit.getDefaultToolkit().getSystemClipboard();
            kopiowane.setContents(stringSelection, null);
        });
    }

    public void openDirectory(JButton open, LefSidebar lefSidebar){
        JFrame frame = new JFrame("Directory Open");
        open.addActionListener(e->{
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int option = fileChooser.showOpenDialog(frame);
            if (option == JFileChooser.APPROVE_OPTION) {
                File directory = fileChooser.getSelectedFile();
                files = directory.list();
                lefSidebar.setListData(files);
        }});
    }

//    public void archiveDir(JButton archive){
//        archive.addActionListener(e->{
//          w
//        });
//    }


    public void paste(JButton paste, JTextArea textAreaRead){
            paste.addActionListener(e -> {
                Clipboard kopiowane = Toolkit.getDefaultToolkit().getSystemClipboard();
                try {
                    String kopiowanyTekst = (String) kopiowane.getData(DataFlavor.stringFlavor);
                    kopiowanyTekst = " " + kopiowanyTekst;
                    textAreaRead.append(kopiowanyTekst);
                } catch (UnsupportedFlavorException | IOException ex) {
                    ex.printStackTrace();
                }
            });
        }

        public void saveas(JTextArea textAreaRead, JTextArea textAreaRead2, JButton saveas){
            saveas.addActionListener(e ->{
                JFileChooser fileChooser = new JFileChooser();
                int result = fileChooser.showSaveDialog(null);
                if (result == JFileChooser.APPROVE_OPTION) {
                    File file = fileChooser.getSelectedFile();
                    try {
                        FileWriter fileWriter = new FileWriter(file);
                        fileWriter.write(textAreaRead.getText());
                        fileWriter.write(textAreaRead2.getText());
                        fileWriter.close();
                        JOptionPane.showMessageDialog(null, "File saved successfully.");
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }
                }
            });
    };


    public void openSelectedFile(LefSidebar lefSidebar, JTextArea textArea) {
        lefSidebar.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    String selectedFile = (String) lefSidebar.getSelectedValue();
                    if (selectedFile != null) {
                        File file = new File(directory, selectedFile);
                        if (file.exists()) {
                            try {
                                BufferedReader reader = new BufferedReader(new FileReader(file));
                                StringBuilder content = new StringBuilder();
                                String line;
                                while ((line = reader.readLine()) != null) {
                                    content.append(line).append("\n");
                                }
                                reader.close();
                                textArea.setText(content.toString());
                            } catch (IOException ex) {
                                ex.printStackTrace();
                            }
                        }
                    }
                }
            }
        });
    }

}
