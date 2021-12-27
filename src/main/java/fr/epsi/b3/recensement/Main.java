package fr.epsi.b3.recensement;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        ReaderCsv reader = new ReaderCsv();
       //reader.readData();
        System.out.println(reader.createListVille());

        Jeu jeu = new Jeu();
        while (true) {
            //jeu.menu();
//            reader.createListVille();

        }


    }
}