package com.java8.stream;

import com.java8.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamAPI
{
	public StreamAPI(){

	}
	static List<Employee> employeeList= new ArrayList<>();



	public static void main(String[] args) {

		Employee.initialize(employeeList);
		System.out.println("Start with---:"+employeeList.size());
		switch (5) {

			case 1: {
				printTotalEmployees();

				break;
			}

			case 2: {

				printAllDepartmentNames();
				break;
			}
			case 3: {
				printFemaleMaleEmployeesCount();

				break;
			}
			case 4: {

				printAverageAgeOfMaleFemaleEmployees();
				break;
			}

			case 5: {

			  printHighestPaidEmployeee();
				break;
			}
			case 6: {

				printEmployeeNameJoiningAfter2015();
				break;
			}
			case 7: {

				printEmployeeCountDepartmentWise();
				break;
			}
			case 8: {

				printAverageSalaryDepartmentWise();
				break;
			}
			case 9: {

				printYoungestEmployeeDetail();
				break;
			}
			case 10: {

				printYoungestEmployeeInProductDevelopmentDetail();
				break;
			}

			case 11: {

				printMostExperienceEmployeeDetail();
				break;
			}
			case 12: {
				printCommaSeparatedDepartmentNames();
				break;
			}
			case 13: {

				printMaleFemaleAverageSalary();
				break;
			}
			case 14: {
                //tricky
				printEmployeeNameDepartmentWise();
				break;
			}
			case 15: {
                //tricky
				printAvgAndTotalSalaryOfWholeOrganization();
				break;
			}
			case 16: {
				printMaleFemaleInSalesAndMarketing();
				break;
			}
			case 17: {
				printSortedEmployeesNameWise();

				break;
			}
			case 18: {
				printSortedEmployeesNameWiseDepartmentWise();
				break;
			}
			case 19: {
				printSecondHighestSalaryDepartmentWise();
				break;
			}

		}
	}

	private static void printSecondHighestSalaryDepartmentWise() {
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().forEach(e -> {
			System.out.println("----------------------");
			System.out.println(e.getKey());
			System.out.println("----------------------");
			e.getValue().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(2).skip(1)
					.map(map -> map.getSalary()).forEach(System.out::println);
		});

	}

	private static void printSortedEmployeesNameWiseDepartmentWise() {
		employeeList.stream().sorted(Comparator.comparing(Employee::getName))
				.collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().forEach(System.out::println);

	}

	private static void printSortedEmployeesNameWise() {
		employeeList.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

	}

	private static void printTotalEmployees() {
		System.out.println(employeeList.stream().count());

	}

	private static void printCommaSeparatedDepartmentNames() {
		System.out.println(
				employeeList.stream().map(e -> e.getDepartment()).distinct().collect(Collectors.joining(" , ")));

	}

	private static void printAvgAndTotalSalaryOfWholeOrganization() {
		DoubleSummaryStatistics employeeSalaryStatistics = employeeList.stream()
				.collect(Collectors.summarizingDouble(Employee::getSalary));
		System.out.println("Average Salary =" + employeeSalaryStatistics.getAverage());
		System.out.println("Total Salary = " + employeeSalaryStatistics.getSum());
	}

	private static void printEmployeeNameDepartmentWise() {
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment)).entrySet().forEach(e -> {
			System.out.println(e.getKey());
			System.out.println("------------");
			e.getValue().stream().map(s -> s.getName()).forEach(System.out::println);

		});

	}

	private static void printMaleFemaleAverageSalary() {
		employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)))
				.entrySet().forEach(System.out::println);

	}

	private static void printMaleFemaleInSalesAndMarketing() {
		employeeList.stream().filter(e -> "Sales And Marketing".equalsIgnoreCase(e.getDepartment()))
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet()
				.forEach(System.out::println);

	}

	private static void printMostExperienceEmployeeDetail() {
		System.out.println(employeeList.stream()
				.collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining))).get());

	}

	private static void printYoungestEmployeeInProductDevelopmentDetail() {
		System.out.println(employeeList.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Product Development"))
				.collect(Collectors.minBy(Comparator.comparing(Employee::getAge))).get());

	}

	private static void printYoungestEmployeeDetail() {
		System.out
				.println(employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getAge))).get());
	}

	private static void printAverageSalaryDepartmentWise() {
		employeeList.stream()
				.collect(
						Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)))
				.entrySet().forEach(System.out::println);

	}

	private static void printEmployeeCountDepartmentWise() {
		employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())).entrySet()
				.forEach(System.out::println);

	}

	private static void printEmployeeNameJoiningAfter2015() {
		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015).map(emp -> emp.getName())
				.forEach(System.out::println);

		employeeList.stream().filter(e -> e.getYearOfJoining() > 2015)
				.forEach(e->System.out.println(e.getName()));
		// not using map()

	}

	private static void printHighestPaidEmployeee() {
		Optional<Employee> collect = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(collect.get()!=null?collect.get():null);
		Employee employee = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();

		System.out.println(employee);

		Optional<Employee> max = employeeList.stream().max(Comparator.comparingDouble(e -> e.getSalary()));
		System.out.println(max.get()!=null?collect.get():null);

	}

	private static void printAverageAgeOfMaleFemaleEmployees() {
		employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)))
				.entrySet().forEach(System.out::println);
	}

	private static void printAllDepartmentNames() {
		employeeList.stream().map(e -> e.getDepartment()).distinct().forEach(System.out::println);

	}

	//we used entryset as groupingBy gives a map
	private static void printFemaleMaleEmployeesCount() {
		employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())).entrySet()
				.forEach(System.out::println);
}
}
