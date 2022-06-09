package com.example.demo;

import com.example.demo.domain.Employee;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class EmployeeStub {

    private static final int YEAR_2022 = 2022;

    /**
     * Create a Mock List with 6 employees.<br>
     * The age starts with 30 and ends with 55, also with 5 space between ages.
     * <br>
     * Example: <br>
     * employee 1 | age 30 <br>
     * employee 2 | age 35 <br>
     * ...<br>
     * employee 6 | age 55 <br>
     *
     * @return
     */
    public static List<Employee> GetStub_with_6_employees()
    {
        return new ArrayList<>()
        {{
            add(GetStub(30, 1, "Employee 1", "01", 10));
            add(GetStub(35, 2, "Employee 2", "01", 10));
            add(GetStub(40, 3, "Employee 3", "01", 10));
            add(GetStub(45, 4, "Employee 4", "01", 10));
            add(GetStub(50, 5, "Employee 5", "01", 10));
            add(GetStub(55, 6, "Employee 6", "01", 10));
         }};
    }

    public static Employee GetStub(int age, int id, String name, String mm, int dd)
    {
        int yyyy = YEAR_2022 - age;
        String birthday = yyyy + "-" + mm + "-" + dd;   // yyyy-mm-dd
        return new Employee(id, name, LocalDateTime.parse(birthday + "T00:00:00"));
    }
}
