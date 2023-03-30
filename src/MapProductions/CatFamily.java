package MapProductions;

import List.Cat;
import SetSerie.TvSerie;

import java.util.*;

public class CatFamily {
    private Map<Owner, Cat> family;

    public CatFamily(Map<Owner, Cat> family) {
        this.family = family;
    }

    public Map<Owner, Cat> getFamily() {
        return family;
    }


    public void add(Owner owner, Cat cat){
        family.put(owner, cat);
    }

    public void remove(Owner owner){
        family.remove(owner);
    }

    public void printAll(){
        for(Map.Entry<Owner, Cat> entry : family.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public  void sortedDict(){
        TreeMap<Owner, Cat> fam = new TreeMap<>(family);
        for(Map.Entry<Owner, Cat> entry : fam.entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    public void SortedComparator(){
        Set<Map.Entry<Owner, Cat>> fam = new TreeSet<Map.Entry<Owner, Cat>>(new ComparatorFamily());
        fam.addAll(family.entrySet());
        for(Map.Entry<Owner, Cat> catFam : fam){
            System.out.println(catFam.getKey() + " - " + catFam.getValue());
        }
    }
}
