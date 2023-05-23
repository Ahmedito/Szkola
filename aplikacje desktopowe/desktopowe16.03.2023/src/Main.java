import javax.swing.*;
import java.awt.*;

public class Main extends JFrame{
        static JFrame f;


    public static void main(String[] args) {
        new Main();






    }
    Main(){

        ContentBox contentbox = new ContentBox();
        contentbox.get();
        SideBar sidebar = new SideBar(new BorderLayout());
        sidebar.get();
        MainMenu mainmenu = new MainMenu(new JFrame(),new JPanel());
        Toolbar toolbar = new Toolbar();
        toolbar.get();
        AppSettings appsettings = new AppSettings();
        //appsettings.get();
        App app = new App();
        app.get();





        f = new JFrame("wszystko");
        f.setSize(500, 500);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(contentbox.get());
        f.add(sidebar,BorderLayout.WEST);
        f.add(mainmenu,BorderLayout.PAGE_START);
       // f.add(toolbar,BorderLayout.LINE_START);

      //  f.add(app);
        f.setVisible(true);
    }
}
