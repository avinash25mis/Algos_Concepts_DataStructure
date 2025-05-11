package java8.common;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class DataForStream {
   private int id;
    private String name;
    private int age;
    private String gender;
    private String department;
    private int yearOfJoining;
    private double salary;



    public DataForStream(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public static Stream<String> getStringStream(){
        return Stream.of("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten");
    }

    public static Stream<Integer> getNumberStream(){
        return Stream.iterate(0, n -> n + 1)
                .limit(10);
    }

    public static Stream<String> getNumberStreamAsString(){
        return Stream.iterate(0, n -> n + 1)
                .limit(10).map(String::valueOf);
    }



    public static Stream<DataForStream> getEmployeeStream() {
        return Stream.of(
                new DataForStream(2, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0),
                new DataForStream(1, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0),
                new DataForStream(101, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0),
                new DataForStream(4, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0),
                new DataForStream(3, "Nima Roy", 27, "Female", "HR", 2013, 22700.0),
                new DataForStream(201, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0),
                new DataForStream(8, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0)
        );
    }

    public static List<DataForStream> getEmployeeList() {
        List<DataForStream> dataForStreamList = new ArrayList<>();
        dataForStreamList.add(new DataForStream(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        dataForStreamList.add(new DataForStream(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        dataForStreamList.add(new DataForStream(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        dataForStreamList.add(new DataForStream(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        dataForStreamList.add(new DataForStream(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        dataForStreamList.add(new DataForStream(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        dataForStreamList.add(new DataForStream(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        return dataForStreamList;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



}
