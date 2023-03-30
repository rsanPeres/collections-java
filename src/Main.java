import List.Cat;
import List.SortedList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Word!");

        //Sort cats
        SortedList sort = new SortedList(new ArrayList<Cat>());

        System.out.println("Digite a quantidade de gatos: ");
        int qtd = sc.nextInt();

        for (int i = 1; i <= qtd; i++){
            System.out.println("Digite o nome: ");
            String name = sc.nextLine();
            System.out.println("Digite cor: ");
            String color = sc.nextLine();
            System.out.println("Digite idade: ");
            int age = sc.nextInt();

            sort.add(new Cat(name, age, color));
        }

        //random
        sort.random();

        //sort by name
        sort.sortByName();

        //sort by all parameters
        sort.sortComparator();


    }
}