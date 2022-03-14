package microsoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @Author czgggggggg
 * @Date 2022/3/14
 * @Description
 */
public class Employee {
    public String name;
    public HashSet<Employee> employees;

    public Employee() {
    }

    public Employee(String name, HashSet<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

}
