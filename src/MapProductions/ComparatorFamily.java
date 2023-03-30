package MapProductions;

import List.Cat;
import SetSerie.TvSerie;

import java.util.Comparator;
import java.util.Map;

public class ComparatorFamily implements Comparator<Map.Entry<Owner, Cat>> {


    @Override
    public int compare(Map.Entry<Owner, Cat> fam1, Map.Entry<Owner, Cat> fam2) {

        return fam1.getValue().getName().compareToIgnoreCase(fam2.getValue().getName());
    }
}
