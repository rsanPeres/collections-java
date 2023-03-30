package List.CatsComparator;

import List.Cat;

import java.util.Comparator;

public class AgeColorNameComparator implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        int name = cat1.getName().compareToIgnoreCase(cat2.getName());
        if(name != 0){
            return name;
        }
        int color = cat1.getColor().compareToIgnoreCase(cat2.getColor());
        if(color != 0){
            return color;
        }
        return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}
