package MapProductions;

import List.Cat;
import SetSerie.TvSerie;

import java.util.*;
import java.util.function.Function;

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

    public  int comparatorPhone(){
        Set<Map.Entry<Owner, Cat>> set = new TreeSet<>(new Comparator<Map.Entry<Owner, Cat>>() {
            @Override
            public int compare(Map.Entry<Owner, Cat> family1, Map.Entry<Owner, Cat> family2) {
                return Integer.compare(family1.getKey().getPhone(), (family2.getKey().getPhone()));
            }
        });
        return -2;
    }

    public int ComparatorPhone2(){
        Set<Map.Entry<Owner, Cat>> set = new TreeSet<>(Comparator.comparing(new Function<Map.Entry<Owner, Cat>, Integer>() {
            @Override
            public Integer apply(Map.Entry<Owner, Cat> phone){
                return  phone.getKey().getPhone();
            }
        }));
        return -2;
    }

    public void ComparatorPhone3(){
        Set<Map.Entry<Owner, Cat>> set = new TreeSet<>(Comparator.comparing(
                phone -> phone.getKey().getPhone()));
    }
}
