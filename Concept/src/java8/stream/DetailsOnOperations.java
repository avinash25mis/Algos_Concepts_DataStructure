package java8.stream;

import java8.common.DataForStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DetailsOnOperations {

    private static List<DataForStream> dataForStreamList = new ArrayList<>();


    public static void main(String[] args) {
        dataForStreamList = DataForStream.getEmployeeList();
        printFemaleMaleEmployeesCount();
    }

    private static void printFemaleMaleEmployeesCount() {
     //simplest way
      long male = dataForStreamList.stream().filter(e -> e.getGender().equals("Male")).count();
      //only grouping by gives the map
      Map<String, List<DataForStream>> genderWiseList = dataForStreamList.stream().collect(Collectors.groupingBy(DataForStream::getGender));
      //grouping by with followed by Collector.counting() gives count
      Map<String, Long>        genderAndItsCount = dataForStreamList.stream().collect(Collectors.groupingBy(DataForStream::getGender, Collectors.counting()));

     // similarly grouping by and followed by sum/average of salary of each department
      Map<String, Double> deptAndTotalSalary = dataForStreamList.stream().collect(Collectors.groupingBy(DataForStream::getDepartment, Collectors.summingDouble(DataForStream::getSalary)));
      Map<String, Double> deptAndItsAvgSalary = dataForStreamList.stream().collect(Collectors.groupingBy(DataForStream::getDepartment, Collectors.averagingDouble(DataForStream::getSalary)));
      System.out.println();

      //how to group by a simple array then ?
      List<String> items = Arrays.asList("apple", "apple", "banana","apple", "orange", "banana", "papaya");
      // this gives the count of each fruit
      Map<String, Long> occuranceOfFruits =  items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
      Map<String, Long> occuranceOfFruits2 = items.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));






 }


    private static void printAllDepartmentNames() {

        dataForStreamList.stream().collect(Collectors.groupingBy(DataForStream::getDepartment)).keySet().forEach(System.out::println);
        dataForStreamList.stream().map(DataForStream::getDepartment).distinct().forEach(System.out::println);

    }



}
