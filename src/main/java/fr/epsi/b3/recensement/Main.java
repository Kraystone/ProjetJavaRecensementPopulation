package fr.epsi.b3.recensement;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        ReaderCsv reader = new ReaderCsv();
        Jeu jeu = new Jeu();
        Recensement recensement = new Recensement();
        Scanner sc = new Scanner(System.in);

        while (jeu.isEnVie()) {
            jeu.menu();
        }
//        recensement.topPopVillesDepartement(sc.next());


    }
}