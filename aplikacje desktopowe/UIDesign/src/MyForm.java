import javax.swing.*;
import java.awt.*;

public class MyForm extends JFrame {
    private JPanel panel1;
    private JTabbedPane tabb;
    private JPanel pnlOut;
    private JPanel pnlTerm;
    private JPanel pnlDbg;
    private JTextArea txaOut;
    private JTextArea txaTerm;
    private JTextArea txaDbg;
    private JButton button1;


    MyForm() {
        this.setContentPane(this.panel1);
    }

   /* public static void main(String[] args) {
        MyForm win = new MyForm();
        display();
        //   win.setContentPane(win.panel1);
        win.setSize(500, 500);
        win.setVisible(true);
    }
*/
    private static void display() {
        System.out.println("COŚ");
    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        panel1 = new JPanel();
        panel1.setLayout(new BorderLayout(0, 0));
        tabb = new JTabbedPane();
        panel1.add(tabb, BorderLayout.CENTER);
        pnlOut = new JPanel();
        pnlOut.setLayout(new BorderLayout(0, 0));
        tabb.addTab("Output", pnlOut);
        txaOut = new JTextArea();
        pnlOut.add(txaOut, BorderLayout.CENTER);
        pnlTerm = new JPanel();
        pnlTerm.setLayout(new BorderLayout(0, 0));
        tabb.addTab("Terminal", pnlTerm);
        txaTerm = new JTextArea();
        pnlTerm.add(txaTerm, BorderLayout.CENTER);
        pnlDbg = new JPanel();
        pnlDbg.setLayout(new BorderLayout(0, 0));
        tabb.addTab("Debug Console", pnlDbg);
        txaDbg = new JTextArea();
        pnlDbg.add(txaDbg, BorderLayout.CENTER);
        button1 = new JButton();
        button1.setAlignmentX(1.0f);
        button1.setAlignmentY(1.0f);
        button1.setPreferredSize(new Dimension(12, 46));
        button1.setText("Button");
        panel1.add(button1, BorderLayout.NORTH);
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return panel1;
    }

}
