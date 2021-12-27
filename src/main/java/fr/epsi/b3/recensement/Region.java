package fr.epsi.b3.recensement;

import java.util.*;

public class Region extends Ville{

    private static String codeRegion;
    private static String nomRegion;

    public Region() {
    }

    public String getCodeRegion() {
        return codeRegion;
    }

    public void setCodeRegion(String codeRegion) {
        Region.codeRegion = codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public void setNomRegion(String nomRegion) {
        Region.nomRegion = nomRegion;
    }
}
