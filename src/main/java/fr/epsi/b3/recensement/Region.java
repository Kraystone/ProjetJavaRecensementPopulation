package fr.epsi.b3.recensement;

public class Region extends Ville{

    private static int codeRegion;
    private static String nomRegion;

    public Region() {
    }

    public int getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(int codeRegion) {
        Region.codeRegion = codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        Region.nomRegion = nomRegion;
    }
}
