import javax.swing.*;
import java.awt.*;

public class App extends JFrame {

    JPanel top = new JPanel();
    JPanel left = new JPanel();
    JPanel right = new JPanel();
    JTextArea textArea1 = new JTextArea();
    JTextArea textArea2 = new JTextArea();
    MenuBar menuBar = new MenuBar();

    LefSidebar jlist = new LefSidebar();
    Toolbar toolbar = new Toolbar(textArea1, textArea2, jlist);
    Tabs tabs = new Tabs(textArea1, textArea2);
    GridLayout layout = new GridLayout(2, 1);
    App(){

        top.setLayout(layout);
        top.add(menuBar);
        top.add(toolbar);
        left.add(jlist);
        right.add(tabs);

        JScrollPane scrollPane = new JScrollPane(jlist, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(169, 270));
        JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
        verticalScrollBar.setPreferredSize(new Dimension(20, 150));
        left.add(scrollPane);

        add(top);
        add(left);
        add(right);
        add(right);

        getContentPane().add(top, BorderLayout.BEFORE_FIRST_LINE);
        getContentPane().add(left, BorderLayout.WEST);
        getContentPane().add(right,BorderLayout.CENTER);


        setResizable(true);
        setPreferredSize(new java.awt.Dimension(650, 400));
        setMinimumSize(new java.awt.Dimension(650, 400));
        pack();
        setVisible(true);
    }
}