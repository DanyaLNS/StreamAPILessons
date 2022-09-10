import java2blog.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
    public void ex1Test(){
        List<String> expected = new ArrayList<>();
        expected.add("Vaibhav");
        List<String> actual = solution.excercise1(employers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ex2Test(){
        long expected = 2;
        long actual = solution.excercise2(employers);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ex3Test(){
    //    Optional<Employee> expected = new Employee("John", 27, Arrays.asList("Paris", "London"));
    }

}
