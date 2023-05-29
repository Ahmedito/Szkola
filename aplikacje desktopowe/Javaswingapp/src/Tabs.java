import javax.swing.*;
import java.awt.*;

public class Tabs extends JTabbedPane {
    Tabs(JTextArea textArea1, JTextArea textArea2){

        JPanel pnl1 = new JPanel() {
            public Dimension getPreferredSize() {
                Dimension size = super.getPreferredSize();
                size.width += 100;
                return size;
            }
        };
        JPanel pnl2 = new JPanel();

        JScrollPane scrollPanetextarea = new JScrollPane(textArea1, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanetextarea.setPreferredSize(new Dimension(450, 250));
        JScrollBar verticalScrollBartextarea = scrollPanetextarea.getVerticalScrollBar();
        verticalScrollBartextarea.setPreferredSize(new Dimension(20, 50));

        JScrollPane scrollPanetextarea2 = new JScrollPane(textArea2, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPanetextarea2.setPreferredSize(new Dimension(450, 250));
        JScrollBar verticalScrollBartextarea2 = scrollPanetextarea2.getVerticalScrollBar();
        verticalScrollBartextarea2.setPreferredSize(new Dimension(20, 50));


        pnl1.add(scrollPanetextarea);
        pnl2.add(scrollPanetextarea2);

        String Zakładka1 = Resourceclass.getKey("Zakładka1");
                String Zakładka2 = Resourceclass.getKey("Zakładka2");
        setPreferredSize(new Dimension(450,250));
        addTab(Zakładka1,pnl1);
        addTab(Zakładka2,pnl2);
    }
}
