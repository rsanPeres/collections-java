package CollectionStream;

import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args){
        List<String> radomNumbers = Arrays.asList("1", "8", "2", "1", "7", "5", "0");
        radomNumbers.stream().forEach(System.out::println);
        radomNumbers.forEach(System.out::println);

        radomNumbers.stream().limit(5).collect(Collectors
                        .toSet())
                .forEach(System.out::println);

        radomNumbers.stream().map(Integer::parseInt).toList().forEach(System.out::println);

        List<Integer> pares = radomNumbers.stream().map(Integer::parseInt).filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if(integer %2 ==0 && integer > 2){
                    return true;
                }
                return false;
            }
        }).collect(Collectors.toList());

        //refatorando
        List<Integer> pares2 = radomNumbers.stream().map(Integer::parseInt)
                .filter(integer -> integer %2 ==0 && integer > 2).toList();

        //média
        radomNumbers.stream().mapToInt(new ToIntFunction<String>() {
            @Override
            public int applyAsInt(String value) {
                return Integer.parseInt(value);
            }
        });
        //refatorando
        radomNumbers.stream().mapToInt(Integer::parseInt)
                .average().ifPresent(new DoubleConsumer() {
                    @Override
                    public void accept(double value) {
                        System.out.println(value);
                    }
                });
        //mais uma vez refatorando
        radomNumbers.stream().mapToInt(Integer::parseInt)
                .average().ifPresent(System.out::println);

        List<Integer> integerList = radomNumbers.stream()
                .map(Integer::parseInt).toList();

        integerList.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer % 2 !=0){
                    return true;
                }
                return false;

            }
        });
        //refatorando
        integerList.removeIf(integer -> integer % 2 !=0);
    }
}
