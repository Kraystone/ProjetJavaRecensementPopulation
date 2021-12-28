package fr.epsi.b3.recensement;

import java.io.*;
import java.util.*;

public class ReaderCsv {

    public static final String FILE = "src/main/resources/recensement_2016.csv";


    public List<Ville> createListVille() throws IOException {
        List<Ville> listvilles = new ArrayList<>();
        String str;

        BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE));
        bufferedReader.readLine(); // passe la première ligne
        while ((str = bufferedReader.readLine()) != null) {
            String[] data = str.split(";");
            String codeRegionData = data[0];
            String nomRegionData = data[1];
            String codeDepartementData = data[2];
            String codeCommuneData = data[5];
            String nomCommuneData = data[6];
            String populationData = data[7].trim().replace(" ","");
            listvilles.add(new Ville(codeRegionData, nomRegionData, codeDepartementData, codeCommuneData, nomCommuneData, Integer.parseInt(populationData)));
        }
        return listvilles;
    }
}
