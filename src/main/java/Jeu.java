import java.util.*;

public class Jeu {

    private boolean enVie = true;

    public Jeu() {

    }

    public void setEnVie(boolean enVie) {
        this.enVie = enVie;
    }

    public boolean isEnVie() {
        return enVie;
    }

    public void menu() {
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
                    Entrer un chiffre entre 1 et 9.""");


            Scanner sc = new Scanner(System.in);
            int choix = sc.nextInt();
            switch (choix) {
                case 1 -> System.out.println("Bonjour");
                case 2 -> System.out.println("Hello");
                case 3 -> System.out.println("Buenos dias");
                case 4 -> System.out.println("");
                case 5 -> System.out.println("");
                case 6 -> System.out.println("");
                case 7 -> System.out.println("");
                case 8 -> System.out.println("");
                case 9 -> System.out.println("");
                default -> System.out.println("Choix incorrect");
            }
        }
    }
}
