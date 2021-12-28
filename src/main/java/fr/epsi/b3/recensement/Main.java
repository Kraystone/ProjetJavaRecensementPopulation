package fr.epsi.b3.recensement;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Jeu jeu = new Jeu();

        while (jeu.isEnVie()) {
            jeu.menu();
        }
    }
}