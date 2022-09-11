package java2blog;

import java.util.List;


public class Employee implements Comparable<Employee> {
    private String name;
    private int age;
    private List<String> listOfCities;

    public Employee(String name, int age, List<String> listOfCities) {
        super();

        this.name = name;
        this.age = age;
        this.listOfCities = listOfCities;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public List<String> getListOfCities() {
        return listOfCities;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Employee o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Employee)) {
            return false;
        }

        Employee emp = (Employee) o;
        return this.getName().equals(emp.getName()) &&
                this.getAge() == emp.getAge() &&
                this.getListOfCities().equals(emp.getListOfCities());
    }
}