package java8.stream;

import java8.Employee;

import java.util.ArrayList;
import java.util.List;

public class PracticeStreamAPI {

    static List<Employee> employeeList = new ArrayList<>();


    public static void main(String[] args) {
        Employee.initialize(employeeList);
        System.out.println("practice size :"+ employeeList.size());

  //employeeList.stream().max(e->e.getSalary())

    }
}
