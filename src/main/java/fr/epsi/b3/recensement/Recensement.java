package fr.epsi.b3.recensement;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class Recensement {

    private List<Ville> villes = new ArrayList<>();
    private List<Ville> data = new ArrayList<>();
    private final ReaderCsv reader = new ReaderCsv();

    public List<Ville> getVilles() { return villes; }
    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }



    public void populationVille() throws IOException, InterruptedException {
        data = reader.createListVille();
        Scanner sc = new Scanner(System.in);
        System.out.println("Donnez un nom de ville.");
        String nomVille_user = sc.next();
        for (Ville datum : data) {
            if (Objects.equals(datum.getNomCommune(), nomVille_user)) {
                System.out.println("La ville " + datum.getNomCommune() + " a " + datum.getPopulationTotal() + " habitants.\n");
                TimeUnit.SECONDS.sleep(10);
            }
        }
    }


    public void populationDepartement() throws IOException, InterruptedException {
        data = reader.createListVille();
        Scanner sc = new Scanner(System.in);
        int nbPop = 0;

        System.out.println("Donnez un code de departement.");
        String codeDepartement_user = sc.next();

        for (Ville datum : data) {
            if (Objects.equals(datum.getCodeDepartement(), codeDepartement_user)) {
                nbPop += datum.getPopulationTotal();
            }
        }
        System.out.println("Le departement avec le code " + codeDepartement_user + " a " + nbPop + " habitants.\n");
        TimeUnit.SECONDS.sleep(10);
    }


    public void populationRegion() throws IOException, InterruptedException {
        data = reader.createListVille();
        Scanner sc = new Scanner(System.in);
        int nbPop = 0;

        System.out.println("Donnez un nom de region.");
        String nomRegion_user = sc.next();

        for (Ville datum : data) {
            if (Objects.equals(datum.getNomRegion(), nomRegion_user)) {
                nbPop += datum.getPopulationTotal();
            }
        }
        System.out.println("La region " + nomRegion_user + " a " + nbPop + " habitants.\n");
        TimeUnit.SECONDS.sleep(10);
    }


}



