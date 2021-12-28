package fr.epsi.b3.recensement;

import java.io.*;
import java.util.*;

public class Recensement {

    private List<Ville> villes = new ArrayList<>();
    private List<Ville> data = new ArrayList<>();
    private final ReaderCsv reader = new ReaderCsv();

    public List<Ville> getVilles() {
        return villes;
    }

    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }


    public void populationVille(String nomVille_user) throws IOException {
        data = reader.  createListVille();

        for (Ville datum : data) {
            if (Objects.equals(datum.getNomCommune(), nomVille_user)) {
                System.out.println("La ville " + datum.getNomCommune() + " a " + datum.getPopulationTotal() + " habitants.\n");
            }
        }
    }


    public void populationDepartement(String codeDepartement_user) throws IOException {
        data = reader.createListVille();
        int nbPop = 0;

        for (Ville datum : data) {
            if (Objects.equals(datum.getCodeDepartement(), codeDepartement_user)) {
                nbPop += datum.getPopulationTotal();
            }
        }
        System.out.println("Le departement avec le code " + codeDepartement_user + " a " + nbPop + " habitants.\n");
    }


    public void populationRegion(String nomRegion_user) throws IOException {
        data = reader.createListVille();
        int nbPop = 0;

        for (Ville datum : data) {
            if (Objects.equals(datum.getNomRegion(), nomRegion_user)) {
                nbPop += datum.getPopulationTotal();
            }
        }
        System.out.println("La region " + nomRegion_user + " a " + nbPop + " habitants.\n");
    }

    public void topRegionPop() throws IOException {
        data = reader.createListVille();
        List<String> villeRegionTop = new ArrayList<>();

        data.sort(Ville.villeComparator);
        Collections.reverse(data);

        for (Ville datum : data) {
            if ((!villeRegionTop.contains(datum.getNomRegion()))) {
                villeRegionTop.add(datum.getNomRegion());
            }
        }
        System.out.println("Les 10 regions les plus peuplées sont : " + villeRegionTop.subList(0, 10)+ "\n");
    }


    public void topDepartementPop() throws IOException {
        data = reader.createListVille();
        List<String> villeDepartementTop = new ArrayList<>();

        data.sort(Ville.villeComparator);
        Collections.reverse(data);

        for (Ville datum : data) {
            if ((!villeDepartementTop.contains(datum.getNomRegion()))) {
                villeDepartementTop.add(datum.getCodeDepartement());
            }
        }
        System.out.println("Les 10 departements les plus peuplés sont : " + villeDepartementTop.subList(0, 10)+ "\n");
    }


    public void topPopVillesDepartement(String codeDepartement_user) throws IOException {
        data = reader.createListVille();
        List<String> topPopVillesDepartement = new ArrayList<>();

        data.sort(Ville.villeComparator);
        Collections.reverse(data);

        for (Ville datum : data) {
            if (Objects.equals(datum.getCodeDepartement(), codeDepartement_user)) {
                topPopVillesDepartement.add(datum.getNomCommune());
            }
        }
        System.out.println("Les 10 villes les plus peuplés sont : " + topPopVillesDepartement.subList(0, 10) + " du departement " + codeDepartement_user + "\n");
    }


    public void topPopVillesRegion(String nomRegion_user) throws IOException {
        data = reader.createListVille();
        List<String> topPopVillesRegion = new ArrayList<>();

        data.sort(Ville.villeComparator);
        Collections.reverse(data);

        for (Ville datum : data) {
            if (Objects.equals(datum.getNomRegion(), nomRegion_user)) {
                topPopVillesRegion.add(datum.getNomCommune());
            }
        }
        System.out.println("Les 10 villes les plus peuplés sont : " + topPopVillesRegion.subList(0, 10) + " du departement " + nomRegion_user + "\n");
    }

    public void topPopFrance() throws IOException {
        data = reader.createListVille();
        List<String> topPopFrance = new ArrayList<>();

        data.sort(Ville.villeComparator);
        Collections.reverse(data);

        for (Ville datum : data) {
            if ((!topPopFrance.contains(datum.getNomRegion()))) {
                topPopFrance.add(datum.getNomCommune());
            }
        }
        System.out.println("Les 10 villes les plus peuplées de France sont : " + topPopFrance.subList(0, 10) + "\n");
    }
}