public class Commune extends Ville{

    private static int codeCommune;
    private static String nomCommune;


    public Commune() {
    }

    public int getCodeCommune() {
        return codeCommune;
    }

    public void setCodeCommune(int codeCommune) {
        Commune.codeCommune = codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public void setNomCommune(String nomCommune) {
        Commune.nomCommune = nomCommune;
    }
}
