
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Toolbar extends JFrame {

    static JToolBar tb;
    static JButton b1, b2;
    static JComboBox x;

    Toolbar()
    {




        tb = new JToolBar();


        JPanel p = new JPanel();


        x = new JComboBox(new String[] { "item 1", "item 2", "item 3" });


        b1 = new JButton("button 1");
        b2 = new JButton("button 2");


        p.add(b1);
        p.add(b2);


        p.add(x);

        tb.add(p);




    }


    public void get(){
        return;
    }
}
