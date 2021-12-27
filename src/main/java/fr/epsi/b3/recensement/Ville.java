package fr.epsi.b3.recensement;

import java.util.*;

public class Ville {

    private String codeRegion;
    private String nomRegion;
    private String codeDepartement;
    private String codeCommune;
    private String nomCommune;
    private int populationTotal;

    public Ville(String codeRegion, String nomRegion, String codeDepartement, String codeCommune, String nomCommune, int populationTotal) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
        this.codeDepartement = codeDepartement;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.populationTotal = populationTotal;
    }

    public Ville() {

    }

    public Ville(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        this.codeRegion = codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        this.codeDepartement = codeDepartement;
    }

    public String getCodeCommune() {
        return codeCommune;
    }

    public void setCodeCommune(String codeCommune) {
        this.codeCommune = codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        this.nomCommune = nomCommune;
    }

    public int getPopulationTotal() {
        return populationTotal;
    }

    public void setPopulationTotal(int populationTotal) {
        this.populationTotal = populationTotal;
    }

    @Override
    public String toString() {
        return "fr.epsi.b3.recensement.Ville{" +
                "codeRegion=" + codeRegion +
                ", nomRegion='" + nomRegion + '\'' +
                ", codeDepartement=" + codeDepartement +
                ", codeCommune=" + codeCommune +
                ", nomCommune='" + nomCommune + '\'' +
                ", populationTotal=" + populationTotal +
                '}';
    }
    public static Comparator<Ville> villeComparator = Comparator.comparingInt(Ville::getPopulationTotal);
}
