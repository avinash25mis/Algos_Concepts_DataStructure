package java8.stream;

import java8.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DetailsOnOperations {

    private static List<Employee> employeeList= new ArrayList<>();

    public static void main(String[] args) {
        Employee.initialize(employeeList);
        printFemaleMaleEmployeesCount();
    }

    private static void printFemaleMaleEmployeesCount() {
     //simplest way
      long male = employeeList.stream().filter(e -> e.getGender().equals("Male")).count();
      long female = employeeList.stream().filter(e -> e.getGender().equals("Male")).count();


      System.out.println();
      Map<String, List<Employee>> genderWiseList = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender));
        //a bit advanced, note that it will alow us grouping by without even knowing the number of groups
        Map<String, Long> genderAndItsCount = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        //how to group by a simple array ?
      List<String> items = Arrays.asList("apple", "apple", "banana","apple", "orange", "banana", "papaya");

       Map<String, Long> occuranceOfFruits =items.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));


      //group by and sum of salary of each department
        Map<String, Double> deptAndTotalSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.summingDouble(Employee::getSalary)));
        Map<String, Double> deptAndItsAvgSalary = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println();



 }


    private static void printAllDepartmentNames() {

        employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).keySet().forEach(System.out::println);
        employeeList.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);

    }



}
