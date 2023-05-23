import javax.swing.*;

public class UIDesign extends JFrame{
    private JPanel panel1;
    private JButton button1;
    private JButton archiwizujButton;
    private JButton zapiszButton;
    private JButton walidacjaButton;
    private JList list1;
    private JTabbedPane tabbedPane1;
    private JTextArea textArea1;
    private JTextArea textArea2;

    UIDesign() {
        this.setContentPane(this.panel1);
    }

    public static void main(String[] args) {
        UIDesign win = new UIDesign();
        //   win.setContentPane(win.panel1);
        win.setSize(500, 500);
        win.setVisible(true);
    }
}
