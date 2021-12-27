package fr.epsi.b3.recensement;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        ReaderCsv reader = new ReaderCsv();
        Jeu jeu = new Jeu();
        Recensement recensement = new Recensement();

//        while (jeu.isEnVie()) {
//            jeu.menu();
//            reader.createListVille();
//        }
        recensement.topRegionPop();


    }
}