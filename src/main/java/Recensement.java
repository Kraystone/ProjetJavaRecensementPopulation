import java.util.*;

public class Recensement {

    private List<Ville> villes = new ArrayList<>();
    private final List<String[]> data = new ArrayList<>();
    private final ReaderCsv reader = new ReaderCsv();


    public List<Ville> getVilles() { return villes; }
    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }

    public void populationRegion(String nomRegion) {

    }
}



