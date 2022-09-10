package java2blog;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    private void excercise1Print(List<Employee> employers) {
        employers.stream()
                .filter(x -> x.getAge() > 30)
                .map(Employee::getName)
                .forEach(System.out::println);

    }

    public List<String> excercise1(List<Employee> employers) {
        List<String> result = employers.stream()
                .filter(x -> x.getAge() > 30)
                .map(Employee::getName)
                .collect(Collectors.toList());

        return result;
    }

    public long excercise2(List<Employee> employers) {
        return employers.stream()
                .filter(x -> x.getAge() > 25)
                .count();
    }

    public  Optional<Employee> excercise3(List<Employee> employers) {
        Optional<Employee> johns = employers.stream()
                .filter(employee -> employee.getName().equalsIgnoreCase("John"))
                .findAny();
        return johns;
    }

    public static void excercise4(List<Employee> employers) {
        OptionalInt highestAge = employers.stream()
                .mapToInt(Employee::getAge)
                .max();
        System.out.println(highestAge.getAsInt());
    }

    public static void excercise5(List<Employee> employers) {
        List<Employee> sortedEmployers = employers.stream()
                .sorted().collect(Collectors.toList());
        sortedEmployers.forEach(System.out::println);
    }

    public static void excercise6(List<Employee> employers) {
        List<String> listOfNames = employers.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        String result = String.join(",", listOfNames);
        System.out.println(result);
    }


}

