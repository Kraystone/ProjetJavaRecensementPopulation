package fr.epsi.b3.recensement;

import com.opencsv.CSVParser;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.*;
import java.util.*;
import java.util.logging.*;

public class ReaderCsv {

    //public static final String FILE = "C:\\Users\\leo_catifait\\IdeaProjects\\ProjetJavaRecensementPopulation\\src\\main\\resources\\recensement_2016.csv";
    public static final String FILE = "C:\\Users\\leote\\IdeaProjects\\ProjetJavaRecensementPopulation\\src\\main\\resources\\\\recensement_2016.csv";
    private static final Logger LOGGER = Logger.getLogger("fr.epsi.b3.recensement.ReaderCsv");

    public void readData() {
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
                    System.out.print(cell + "\t|");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //return allData;
    }

    public List<Ville> createListVille() throws IOException {
        List<Ville> listvilles = new ArrayList<>();
        String str=null;

        LineNumberReader bufferedReader = new LineNumberReader(new FileReader(FILE));
        bufferedReader.getLineNumber();
        while ((str = bufferedReader.readLine()) != null) {

            String[] data = str.split(";");
            String codeRegionData = data[0];
            String nomRegionData = data[1];
            String codeDepartementData = data[2];
            String codeCommuneData = data[5];
            String nomCommuneData = data[6];
            String populationData = data[7];
            listvilles.add(new Ville(Integer.parseInt(codeRegionData), nomRegionData, Integer.parseInt(codeDepartementData), Integer.parseInt(codeCommuneData), nomCommuneData, Integer.parseInt(populationData)));
        }
        return listvilles;
    }
}
