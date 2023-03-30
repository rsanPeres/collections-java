package List;

import List.CatsComparator.AgeColorNameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedList {
    List<Cat> cats;

    public SortedList(List<Cat> cats) {
        this.cats = cats;
    }

    public Cat getCat(int index) {
        return cats.get(index);
    }

    public List<Cat> getAll(){
        return cats;
    }

    public void add(Cat cat){
        cats.add(cat);
    }

    public void remove(Cat cat){
        cats.remove(cat);
    }

    public void random(){
        Collections.shuffle(cats);
        System.out.println(cats);
    }

    public void sortByName(){
        Collections.sort(cats);
        System.out.println(cats);
    }

    public void sortComparator(){
        cats.sort(new AgeColorNameComparator());
        System.out.println(cats);
    }
}
