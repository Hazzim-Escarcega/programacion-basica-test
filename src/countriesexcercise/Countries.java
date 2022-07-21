package countriesexcercise;

import java.awt.*;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.APPEND;

public class Countries extends Component {
    private String inputFile = "src/countriesexcercise/data/input/countries.txt";
    private String outputFile = "src/countriesexcercise/data/output/";
    private List<String> countries = new ArrayList<String>();
    private Path fileLocation;

    public Countries(String inputFile, String outputFile) {
        this.inputFile = inputFile;
        this.outputFile = outputFile;
    }

    public void readFile() throws IOException {
        try (Stream<String> inputStream = Files.lines(Paths.get(inputFile))) {
            inputStream.forEach(country -> {
                String greeting = "Saludos hasta "+ country+"!!!";
                countries.add(greeting);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void createFile() throws IOException {
        Date date = Calendar.getInstance().getTime();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd");
        String fileName = "Countries "+dateFormat.format(date);
        String extension = ".txt";
        this.fileLocation = Paths.get(outputFile + fileName+ extension);
        try {
            Files.createFile(fileLocation);
        }catch (FileAlreadyExistsException e) {
            System.out.println("El archivo ya existe\n" + e);
        }
    }
   public void writeFile(){
       countries.forEach(greeting -> {
           try {
               Files.writeString(fileLocation, greeting+"\n",APPEND);
           } catch (IOException e) {
               throw new RuntimeException(e);
           }
       });
   }
   public void greetCountries() throws IOException {
        createFile();
        readFile();
        writeFile();
   }
   /*public void chooseFile() throws IOException {
       JFileChooser fileChooser = new JFileChooser();
       fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
       int result = fileChooser.showOpenDialog(this);
       if (result == JFileChooser.APPROVE_OPTION) {
           File selectedFile = fileChooser.getSelectedFile();
           System.out.println("Selected file: " + selectedFile.getAbsolutePath());

           this.inputFile = selectedFile.getAbsolutePath();
       }
   }*/
}
