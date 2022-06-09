package com.example.demo.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesFilters {

    public static List<Employee> byAgeGreaterThanEqual(List<Employee> employees, int age)
    {
        LocalDateTime now = LocalDateTime.now();

        return employees.stream()
                .filter(emp -> emp.getAge(now) >= age)
                .collect(Collectors.toList());

    }

    public static List<Employee> byAgeEqual(List<Employee> employees, int age)
    {
        LocalDateTime now = LocalDateTime.now();

        return employees.stream()
                .filter(emp -> emp.getAge(now) == age)
                .collect(Collectors.toList());

    }

    public static List<Employee> byAgeLessThanEqual(List<Employee> employees, int age)
    {
        LocalDateTime now = LocalDateTime.now();

        return employees.stream()
                .filter(emp -> emp.getAge(now) <= age)
                .collect(Collectors.toList());

    }
}
