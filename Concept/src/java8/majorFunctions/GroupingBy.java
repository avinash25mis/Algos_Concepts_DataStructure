package java8.majorFunctions;

import java8.common.Fruit;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingBy {

    public static void main(String[] args) {
        GroupingBy qs= new GroupingBy();
        qs.quesAndAns(3);
    }

    private void quesAndAns(int option) {
        switch (option) {
            case 1:
                countListElements();
                break;
            case 2:
                countObjectContent();
                break;
           case 3:
                averageAndOperations();
                 break;


        }

    }




    /*
    * we see two ways of counting
    * Function.Identy is same as e->e
    *
    * */
    private void countListElements() {
        List<String> items = Arrays.asList("apple", "apple", "banana","apple", "orange", "banana", "papaya");
        //total count if element
        Long collect = items.stream().collect(Collectors.counting());
        long count = items.stream().count();

        //count bu fruits
        Map<String, Long> result1 = items.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> result2 = items.stream().collect(Collectors.groupingBy(e->e, Collectors.counting()));

        System.out.println(collect);

    }


    private void countObjectContent() {
        List<Fruit> items= new ArrayList<>();
        Fruit.initialize(items);

        Map<String, Long> collect1 = items.stream().collect(Collectors.groupingBy(Fruit::getName, Collectors.counting()));
        Map<String, Long> collect2 = items.stream().collect(Collectors.groupingBy(e->e.getName(), Collectors.counting()));
        Map<String, List<Fruit>> collect3 = items.stream().collect(Collectors.groupingBy(e -> e.getName()));
        Map<String, List<Fruit>> collect4 = items.stream().collect(Collectors.groupingBy(Fruit::getName));

        //to get a set instead, we will use an overloaded version of groupBy
        Map<String, Set<Fruit>> collect5 = items.stream().collect(Collectors.groupingBy(Fruit::getName,Collectors.toSet()));

        System.out.println();

        //infact we can get a map of map

        Map<String, Map<Integer, List<Fruit>>> collect6 = items.stream().collect(Collectors.groupingBy(Fruit::getName, Collectors.groupingBy(Fruit::getQuantity)));

        System.out.println();
    }


    private void averageAndOperations() {
        List<Fruit> items= new ArrayList<>();
        Fruit.initialize(items);

        Map<String, Double> collect = items.stream().collect(Collectors.groupingBy(Fruit::getName, Collectors.averagingDouble(Fruit::getQuantity)));
        Map<String, Integer> collect2 = items.stream().collect(Collectors.groupingBy(Fruit::getName, Collectors.summingInt(Fruit::getQuantity)));

        System.out.println();
    }



}
