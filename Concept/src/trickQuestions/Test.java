package trickQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

/*
* find out all the numbers starting with 1 using Stream functions?
//List<Integer> myList = Arrays.asList(10,15,8,49,25,98,22);
*
* How to find duplicate elements in a given integers list in java using Stream functions?
List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15);
*
* */

    public static void main(String[] args) {
        Test t=new Test();
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,22);
        List<Integer> myListTwo = Arrays.asList(10,15,8,49,25,98,98,32,15);
        myList.stream().filter(e->e/10==1).forEach(System.out::println);



    }
}
