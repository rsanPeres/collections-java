import List.Cat;
import List.SortedList;
import MapProductions.Owner;
import MapProductions.CatFamily;
import SetSerie.SortedSetSerie;
import SetSerie.TvSerie;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Word!");

        //List Sorted cats
        SortedList sort = new SortedList(new ArrayList<Cat>());

        System.out.println("Digite a quantidade de gatos: ");
        int qtd = sc.nextInt();

        for (int i = 1; i <= qtd; i++){
            System.out.println("Digite o nome: \n");
            String name = sc.nextLine();
            System.out.println("Digite cor: \n");
            String color = sc.nextLine();
            System.out.println("Digite idade: \n");
            int age = sc.nextInt();

            sort.add(new Cat(name, age, color));
        }

        //random
        sort.random();

        //sort by name
        sort.sortByName();

        //sort by all parameters
        sort.sortComparator();

        //Set sorted series
        SortedSetSerie setSeries = new SortedSetSerie(new HashSet<TvSerie>());

        System.out.println("Digite a quantidade de series: ");
        int qtd2 = sc.nextInt();

        for (int i = 1; i <= qtd2; i++){
            System.out.println("Digite o nome: \n");
            String nameS = sc.nextLine();
            System.out.println("Digite genero: \n");
            String genre = sc.nextLine();
            System.out.println("Digite tempo: \n");
            int time = sc.nextInt();

            setSeries.add(new TvSerie(nameS, genre, time));
        }
        setSeries.printAll();
        setSeries.printByEpisodeTime();
        setSeries.printComparator();

        //Map sorted
        CatFamily family = new CatFamily(new HashMap<Owner, Cat>());

        for (int i = 1; i <= qtd2; i++){
            System.out.println("Digite o nome do dono do gato " + i + "\n");
            String nameD = sc.nextLine();

            family.add(new Owner(nameD), sort.getCat(i - 1));
        }

        family.printAll();
        family.sortedDict();
        family.SortedComparator();
    }
}