import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;


    public class SideBar extends JPanel implements ListSelectionListener{
        DefaultListModel data;
        JList lst;
        SideBar(BorderLayout lay) {
            this.setLayout(lay);
            data = new DefaultListModel();
            data.addElement("pusty-plik.txt");
            data.addElement("plik1.txt");
            data.addElement("plik2.txt");
            data.addElement("dokument5.txt");
            data.addElement("lista.csv");
            lst = new JList<>(data);

            lst.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
            lst.setLayoutOrientation(JList.VERTICAL);
            lst.setSelectedIndex(2);
            lst.setSelectedIndex(4);
            lst.addListSelectionListener((ListSelectionListener) this);
            JScrollPane scrlst = new JScrollPane(lst);
            this.add(scrlst);
        }
public Container get(){
            return lst;
}

        @Override
        public void valueChanged(ListSelectionEvent e) {
            Object src = e.getSource();
            if(src==lst){
                if(e.getValueIsAdjusting() == false){
                    if(lst.getSelectedIndex() != -1){
                        String fileName = data.getElementAt(lst.getSelectedIndex()).toString();
                        System.out.println(fileName);
                    }
                }
            }
        }
    }

