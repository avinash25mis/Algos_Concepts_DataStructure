package com.java8.stream;

import com.java8.Employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PracticeStreamAPI {

    static List<Employee> employeeList = new ArrayList<>();


    public static void main(String[] args) {
        Employee.initialize(employeeList);
        System.out.println("practice size :"+ employeeList.size());

  //employeeList.stream().max(e->e.getSalary())

    }
}
