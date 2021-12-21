import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.*;
import java.util.*;
import java.util.logging.*;

public class ReaderCsv {

    public static final String FILE = "C:\\Users\\leo_catifait\\IdeaProjects\\ProjetJavaRecensementPopulation\\src\\main\\resources\\recensement_2016.csv";
    private static final Logger LOGGER = Logger.getLogger("ReaderCsv");

    public List<String[]> readData() {
        List<String[]> allData = null;
        try {
            FileReader filereader = new FileReader(FILE);

            // create csvParser object with
            // custom separator semi-colon
            CSVParser parser = new CSVParserBuilder().withSeparator(';').build();

            // create csvReader object with parameter
            // filereader and parser
            CSVReader csvReader = new CSVReaderBuilder(filereader)
                    .withCSVParser(parser)
                    .build();

            // Read all data at once
            allData = csvReader.readAll();

            // Print Data.
            for (String[] row : allData) {
                for (String cell : row) {
                    System.out.print(cell + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return allData;
    }

    public List<Ville> createListVille() throws IOException {
        List<Ville> listvilles = new ArrayList<>();
        String line = null;

        FileReader fileReader = new FileReader(FILE);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((line = bufferedReader.readLine()) != null) {
            String[] data = line.split(";");
            int codeRegionData = Integer.parseInt(data[0]);
            String nomRegionData = data[1];
            int codeDepartementData = Integer.parseInt(data[2]);
            int codeCommuneData = Integer.parseInt(data[5]);
            String nomCommuneData = data[6];
            int populationData = Integer.parseInt(data[7]);
            listvilles.add(new Ville(codeRegionData, nomRegionData, codeDepartementData, codeCommuneData, nomCommuneData, populationData));
        }
        return listvilles;
    }
}
