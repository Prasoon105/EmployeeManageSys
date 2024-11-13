package com.employee;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeManagement {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeData.getEmployees();

        // Filter employees with salary greater than 70,000
        List<Employee> highSalaryEmployees = employees.stream()
                .filter(emp -> emp.getSalary() > 70000)
                .collect(Collectors.toList());
        System.out.println("Employees with high salary (>70,000): " + highSalaryEmployees);

        // Sort employees by salary in descending order
        List<Employee> sortedBySalary = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
        System.out.println("Employees sorted by salary (desc): " + sortedBySalary);

        // Group employees by department
        Map<String, List<Employee>> employeesByDepartment = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("Employees grouped by department: " + employeesByDepartment);

        // Calculate average salary in the Engineering department
        double avgSalaryEngineering = employees.stream()
                .filter(emp -> "Engineering".equals(emp.getDepartment()))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0.0);
        System.out.println("Average salary in Engineering: " + avgSalaryEngineering);

        // Find the employee with the highest salary
        Optional<Employee> maxSalaryEmployee = employees.stream()
                .max(Comparator.comparing(Employee::getSalary));
        maxSalaryEmployee.ifPresent(emp -> System.out.println("Employee with highest salary: " + emp));

    }
}
