public class Departement extends Ville{


    private static int codeDepartement;
    private static String nomDepartement;


    public Departement() {
        super();
    }

    public int getCodeDepartement() {
        return codeDepartement;
    }

    public void setCodeDepartement(int codeDepartement) {
        Departement.codeDepartement = codeDepartement;
    }

    public String getNomDepartement() {
        return nomDepartement;
    }

    public void setNomDepartement(String nomDepartement) {
        Departement.nomDepartement = nomDepartement;
    }

}
