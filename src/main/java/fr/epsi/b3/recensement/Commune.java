package fr.epsi.b3.recensement;

public class Commune extends Ville{

    private static String codeCommune;
    private static String nomCommune;


    public Commune() {
    }

    public String getCodeCommune() {
        return codeCommune;
    }

    public void setCodeCommune(String codeCommune) {
        Commune.codeCommune = codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        Commune.nomCommune = nomCommune;
    }
}
