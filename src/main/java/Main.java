import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.awt.*;
import java.io.*;
import java.nio.file.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ReaderCsv reader = new ReaderCsv();
       // reader.readData();

        Jeu jeu = new Jeu();
        while (true) {
            //jeu.menu();
            System.out.println(reader.createListVille().get(1));
        }


    }
}