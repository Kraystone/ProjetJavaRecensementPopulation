package fr.epsi.b3.recensement;

import fr.epsi.b3.recensement.Ville;

import java.util.*;

public class Sortbyroll implements Comparator<Ville> {
    @Override
    public int compare(Ville o1, Ville o2) {
        return o1.getPopulationTotal() - o2.getPopulationTotal();
    }
}
