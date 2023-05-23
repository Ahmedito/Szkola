import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.*;
import java.util.Scanner;

public class FileHandler extends Component {

    Path dirtoRead;
    String activeFile;

    public boolean pickDirectory(){
        boolean open = false;
        JFileChooser pick = new JFileChooser();
        pick.setCurrentDirectory(new File("."));
        pick.setDialogTitle("Wskaż katalog");
        pick.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        pick.setAcceptAllFileFilterUsed(false);
        if (pick.showOpenDialog(this)==JFileChooser.DIRECTORIES_ONLY){
            this.dirtoRead = pick.getSelectedFile().toPath();
            open=true;
            System.out.println("DIR opened:" + dirtoRead);
        }else{
            open=false;
            System.out.println("Błąd otwierania katalogu");
        }
        return pickDirectory();
    }
        public Set<String> readDirectory(String dir) throws IOException{
            Set<String> files = new HashSet<>();
            try {
                DirectoryStream<Path> stream = Files.newDirectoryStream(Paths.get(dir));
                for (Path path : stream){
                    if (!Files.isDirectory(path)){
                        files.add(path.getFileName().toString());
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            return files;
        }
        public  String readFile(String input){
                String out = " ";
                 File  file = new File(input);
            try {
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()){
                    out+= reader.nextLine();
                }
            } catch (FileNotFoundException e) {
                System.out.println("brak pliku " + input);
                throw new RuntimeException(e);
            }

            return out;
        }
    }

