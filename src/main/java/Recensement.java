import java.io.*;
import java.util.*;

public class Recensement {

    public String nom_fichier = "C:\\Users\\leo_catifait\\IdeaProjects\\ProjetJavaRecensementPopulation\\src\\main\\resources\\recensement_2016.csv";

    private List<Ville> villes = new ArrayList<>();
    public List<Ville> getVilles() { return villes; }
    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }

    public void getAllFile() {
        try (Scanner scanner = new Scanner(new File(nom_fichier))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int populationRegion(String nomRegion) {
        try (Scanner scanner = new Scanner(new File(nom_fichier))) {

            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                //Object actualVille = scanner.equals();
                if(scanner.equals(nomRegion)) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0;
    }
}



