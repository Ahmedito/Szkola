import java.awt.*;
import javax.swing.*;

public class ContentBox extends JPanel {


  JTextArea txa1, txa2;
  JPanel pnl;
  JPanel pnl1 = new JPanel(new BorderLayout());
  JPanel pnl2 = new JPanel(new BorderLayout());

  JScrollPane scp1;
  JScrollPane scp2;





  ContentBox(){
      pnl = new JPanel(new BorderLayout()){
          public Dimension getPrefferedSize(){
              Dimension size = super.getPreferredSize();
              size.width +=300;
              return size;
          }
      };


      JTabbedPane tabs = new JTabbedPane();
      txa1 = new JTextArea(10,25);
      txa2 = new JTextArea();
      scp1 = new JScrollPane(
              txa1,
              JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
              JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS
      );
      scp1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
      scp2 = new JScrollPane(txa2);
      pnl1.add(scp1);
      pnl2.add(scp2);
      tabs.addTab("Z1",pnl1);
      tabs.addTab("Z2",pnl2);
      pnl.add(tabs);

  }

    public Container get() {
        return pnl;


    }
}

