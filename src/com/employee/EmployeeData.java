package com.employee;

import java.util.Arrays;
import java.util.List;

public class EmployeeData {
    public static List<Employee> getEmployees() {
        return Arrays.asList(
            new Employee(1, "Amit", "Engineering", 75000),
            new Employee(2, "Akash", "Engineering", 80000),
            new Employee(3, "Ajay", "HR", 65000),
            new Employee(4, "Sumit", "Marketing", 70000),
            new Employee(5, "Risika", "Engineering", 95000),
            new Employee(6, "Abhay", "HR", 70000),
            new Employee(7, "Aditi", "Marketing", 60000)
        );
    }
}
