package java8.common;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Fruit {


    private String name;
    private int quantity;
    private BigDecimal price;


    public Fruit(){

    }

    public Fruit(String name, int quantity, BigDecimal price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public static void initialize(List<Fruit> items){
      List<Fruit> fruits = Arrays.asList(
                new Fruit("apple", 10, new BigDecimal("9.99")),
                new Fruit("apple", 20, new BigDecimal("9.99")),
                new Fruit("apple", 10, new BigDecimal("9.99")),
                new Fruit("banana", 20, new BigDecimal("19.99")),
                new Fruit("banana", 10, new BigDecimal("19.99")),
                new Fruit("orang", 10, new BigDecimal("29.99")),
                new Fruit("watermelon", 80, new BigDecimal("89.99")),
                new Fruit("papaya", 20, new BigDecimal("9.99"))



        );
        items.addAll(fruits);
    }

}
