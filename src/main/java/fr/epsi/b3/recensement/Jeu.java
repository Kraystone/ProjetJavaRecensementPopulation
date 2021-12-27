package fr.epsi.b3.recensement;

import java.io.*;
import java.util.*;

public class Jeu {

    Recensement recensement = new Recensement();

    private boolean enVie = true;

    public Jeu() {

    }

    public void setEnVie(boolean enVie) {
        this.enVie = enVie;
    }

    public boolean isEnVie() {
        return enVie;
    }

    public void menu() throws IOException, InterruptedException {
        while (this.enVie) {
            System.out.println("Bienvenue dans le jeu de recensement de ville que voulez vous faire ?");
            System.out.println("""
                    1- Voir la population d'une ville
                    2- Voir la population d'un département
                    3- Voir la population d'une region
                    4- Afficher les 10 region les plus peuplées
                    5- Afficher les 10 departement les plus peuplées
                    6- Afficher les 10 villes les plus peuplées d’un département
                    7- Afficher les 10 villes les plus peuplées d’une région
                    8- Afficher les 10 villes les plus peuplées de France
                    9- Se deconnecter
                    
                    ####################################################################################
                    
                    Entrer un chiffre entre 1 et 9.""");


            Scanner sc = new Scanner(System.in);
            int choix = sc.nextInt();
            switch (choix) {
                case 1 -> recensement.populationVille();
                case 2 -> recensement.populationDepartement();
                case 3 -> recensement.populationRegion();
                case 4 -> System.out.println("");
                case 5 -> System.out.println("");
                case 6 -> System.out.println("");
                case 7 -> System.out.println("");
                case 8 -> System.out.println("");
                case 9 -> setEnVie(false);
                default -> System.out.println("Choix incorrect");
            }
        }
    }
}
