package countriesexcercise;

import java.io.IOException;

public class GreetCountries {
    public static void main(String[] args) throws IOException {
        String outputFile = "src/countriesexcercise/data/output/";
        String inputFile = "src/countriesexcercise/data/input/countries.txt";

        Countries obj = new Countries(inputFile, outputFile);
        //obj.chooseFile();

        obj.greetCountries();
    }

}
