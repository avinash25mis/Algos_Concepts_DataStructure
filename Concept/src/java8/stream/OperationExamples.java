package java8.stream;

import java8.common.DataForStream;

import java.util.*;
import java.util.stream.Collectors;

public class OperationExamples
{
	public OperationExamples(){

	}
	static List<DataForStream> dataForStreamList = new ArrayList<>();



	public static void main(String[] args) {

		dataForStreamList = DataForStream.getEmployeeList();
		System.out.println("Start with---:"+ dataForStreamList.size());
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
		dataForStreamList.stream().collect(Collectors.groupingBy(DataForStream::getDepartment)).entrySet().forEach(e -> {
			System.out.println("----------------------");
			System.out.println(e.getKey());
			System.out.println("----------------------");
			e.getValue().stream().sorted(Comparator.comparingDouble(DataForStream::getSalary).reversed()).limit(2).skip(1)
					.map(map -> map.getSalary()).forEach(System.out::println);
		});

	}

	private static void printSortedEmployeesNameWiseDepartmentWise() {
		dataForStreamList.stream().sorted(Comparator.comparing(DataForStream::getName))
				.collect(Collectors.groupingBy(DataForStream::getDepartment)).entrySet().forEach(System.out::println);

	}

	private static void printSortedEmployeesNameWise() {
		dataForStreamList.stream().sorted(Comparator.comparing(DataForStream::getName)).forEach(System.out::println);

	}

	private static void printTotalEmployees() {
		System.out.println(dataForStreamList.stream().count());

	}

	private static void printCommaSeparatedDepartmentNames() {
		System.out.println(
				dataForStreamList.stream().map(e -> e.getDepartment()).distinct().collect(Collectors.joining(" , ")));

	}

	private static void printAvgAndTotalSalaryOfWholeOrganization() {
		DoubleSummaryStatistics employeeSalaryStatistics = dataForStreamList.stream()
				.collect(Collectors.summarizingDouble(DataForStream::getSalary));
		System.out.println("Average Salary =" + employeeSalaryStatistics.getAverage());
		System.out.println("Total Salary = " + employeeSalaryStatistics.getSum());
	}

	private static void printEmployeeNameDepartmentWise() {
		dataForStreamList.stream().collect(Collectors.groupingBy(DataForStream::getDepartment)).entrySet().forEach(e -> {
			System.out.println(e.getKey());
			System.out.println("------------");
			e.getValue().stream().map(s -> s.getName()).forEach(System.out::println);

		});

	}

	private static void printMaleFemaleAverageSalary() {
		dataForStreamList.stream()
				.collect(Collectors.groupingBy(DataForStream::getGender, Collectors.averagingDouble(DataForStream::getSalary)))
				.entrySet().forEach(System.out::println);

	}

	private static void printMaleFemaleInSalesAndMarketing() {
		dataForStreamList.stream().filter(e -> "Sales And Marketing".equalsIgnoreCase(e.getDepartment()))
				.collect(Collectors.groupingBy(DataForStream::getGender, Collectors.counting())).entrySet()
				.forEach(System.out::println);

	}

	private static void printMostExperienceEmployeeDetail() {
		System.out.println(dataForStreamList.stream()
				.collect(Collectors.minBy(Comparator.comparing(DataForStream::getYearOfJoining))).get());

	}

	private static void printYoungestEmployeeInProductDevelopmentDetail() {
		System.out.println(dataForStreamList.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Product Development"))
				.collect(Collectors.minBy(Comparator.comparing(DataForStream::getAge))).get());

	}

	private static void printYoungestEmployeeDetail() {
		System.out
				.println(dataForStreamList.stream().collect(Collectors.minBy(Comparator.comparing(DataForStream::getAge))).get());
	}

	private static void printAverageSalaryDepartmentWise() {
		dataForStreamList.stream()
				.collect(
						Collectors.groupingBy(DataForStream::getDepartment, Collectors.averagingDouble(DataForStream::getSalary)))
				.entrySet().forEach(System.out::println);

	}

	private static void printEmployeeCountDepartmentWise() {
		dataForStreamList.stream().collect(Collectors.groupingBy(DataForStream::getDepartment, Collectors.counting())).entrySet()
				.forEach(System.out::println);

	}

	private static void printEmployeeNameJoiningAfter2015() {
		dataForStreamList.stream().filter(e -> e.getYearOfJoining() > 2015).map(emp -> emp.getName())
				.forEach(System.out::println);

		dataForStreamList.stream().filter(e -> e.getYearOfJoining() > 2015)
				.forEach(e->System.out.println(e.getName()));
		// not using map()

	}

	private static void printHighestPaidEmployeee() {
		Optional<DataForStream> collect = dataForStreamList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(DataForStream::getSalary)));
		System.out.println(collect.get()!=null?collect.get():null);
		DataForStream dataForStream = dataForStreamList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(DataForStream::getSalary))).get();

		System.out.println(dataForStream);

		Optional<DataForStream> max  = dataForStreamList.stream().max(Comparator.comparingDouble(e -> e.getSalary()));
		Optional<DataForStream> max2 = dataForStreamList.stream().max(Comparator.comparingDouble(DataForStream::getSalary));
		System.out.println(max.get()!=null?collect.get():null);

	}

	private static void printAverageAgeOfMaleFemaleEmployees() {
		dataForStreamList.stream()
				.collect(Collectors.groupingBy(DataForStream::getGender, Collectors.averagingInt(DataForStream::getAge)))
				.entrySet().forEach(System.out::println);
	}

	private static void printAllDepartmentNames() {
		dataForStreamList.stream().map(e -> e.getDepartment()).distinct().forEach(System.out::println);

	}

	//we used entryset as groupingBy gives a map
	private static void printFemaleMaleEmployeesCount() {
		dataForStreamList.stream().collect(Collectors.groupingBy(DataForStream::getGender, Collectors.counting())).entrySet()
				.forEach(System.out::println);
}
}
