package com.java8.majorOperations;

import com.java8.Fruit;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ReduceAndCollect {

    public static void main(String[] args) {
        ReduceAndCollect rc= new ReduceAndCollect();
        rc.reduceOperations();
        compareToPOC();
    }

    private void reduceOperations() {
        List<Fruit> list= new ArrayList<>();
        Fruit.initialize(list);

        //total price of fruits
        //since we need just one field price  then let use map() to get it down to only one filed
        BigDecimal reduce1 = list.stream().map(e -> e.getPrice()).reduce(new BigDecimal(0), (a, b) -> a.add(b));

        //total quantity of fruits
        Integer reduce2 = list.stream().map(Fruit::getQuantity).reduce(0, (a, b) -> a + b);

        Optional<Integer> max = list.stream().map(Fruit::getQuantity).reduce( Math::max );

        System.out.println();

        //Fruit details having max price

        Optional<Fruit> reduce3 = list.stream().reduce((a, b) -> a.getPrice().compareTo(b.getPrice()) > 0 ? a : b);
        Optional<Fruit> reduce4=list.stream().reduce((Fruit a, Fruit b)->a.getQuantity() > b.getQuantity()?a:b);


        System.out.println();
    }


    public  static void compareToPOC(){

        BigDecimal one= new BigDecimal("10.00");
        BigDecimal two= new BigDecimal("20.00");

        BigDecimal three= new BigDecimal("10.00");

        System.out.println(one.compareTo(two)); //-1
        System.out.println(two.compareTo(one)); //1
        System.out.println(one.compareTo(three)); //0

    }

}
