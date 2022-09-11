import java2blog.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java2BlogTests {
    static private List<Employee> employers;
    static private Solution solution;

    @Before
    public void init() {
        solution = new Solution();
        employers = new ArrayList<>();

        Employee e1 = new Employee("Mohan", 24, Arrays.asList("Newyork", "Banglore"));
        Employee e2 = new Employee("John", 27, Arrays.asList("Paris", "London"));
        Employee e3 = new Employee("Vaibhav", 32, Arrays.asList("Pune", "Seattle"));
        Employee e4 = new Employee("Amit", 22, Arrays.asList("Chennai", "Hyderabad"));

        employers.add(e1);
        employers.add(e2);
        employers.add(e3);
        employers.add(e4);
    }

    @Test
    public void ex1Test() {
        List<String> expected = new ArrayList<>();
        expected.add("Vaibhav");
        List<String> actual = solution.excercise1(employers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ex2Test() {
        long expected = 2;
        long actual = solution.excercise2(employers);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ex3Test() {
        Employee expected = new Employee("John", 27, Arrays.asList("Paris", "London"));
        Employee actual = solution.excercise3(employers);

        Assert.assertTrue(
                expected.getName().equals(actual.getName()) &&
                        expected.getAge() == actual.getAge() &&
                        expected.getListOfCities().equals(actual.getListOfCities())
        );
    }

    @Test
    public void ex4Test() {
        int expected = 32;
        int actual = solution.excercise4(employers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ex5Test() {
        List<Employee> expected = new ArrayList<>();

        Employee e1 = new Employee("Mohan", 24, Arrays.asList("Newyork", "Banglore"));
        Employee e2 = new Employee("John", 27, Arrays.asList("Paris", "London"));
        Employee e3 = new Employee("Vaibhav", 32, Arrays.asList("Pune", "Seattle"));
        Employee e4 = new Employee("Amit", 22, Arrays.asList("Chennai", "Hyderabad"));

        expected.add(e4);
        expected.add(e2);
        expected.add(e1);
        expected.add(e3);

        List<Employee> actual = solution.excercise5(employers);
        for (int i = 0; i < expected.size(); i++) {
            Assert.assertTrue(
                    expected.get(i).getName().equals(actual.get(i).getName()) &&
                            expected.get(i).getAge() == actual.get(i).getAge() &&
                            expected.get(i).getListOfCities().equals(actual.get(i).getListOfCities())
            );
        }
    }

    @Test
    public void ex6Test() {
        String expected = "Mohan,John,Vaibhav,Amit";
        String actual = solution.excercise6(employers);

        Assert.assertEquals(expected, actual);
    }

}
