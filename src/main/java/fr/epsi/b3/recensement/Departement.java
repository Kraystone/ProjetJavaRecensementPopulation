package fr.epsi.b3.recensement;

public class Departement extends Ville{


    private static String codeDepartement;
    private static String nomDepartement;


    public Departement() {
        super();
    }

    public String getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(String codeDepartement) {
        Departement.codeDepartement = codeDepartement;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        Departement.nomDepartement = nomDepartement;
    }

}
