package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.demo.domain.Employee;
import com.example.demo.domain.EmployeesFilters;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import java.util.List;

@ContextConfiguration(classes = {EmployeeFilterValidationTest.class})
@SpringBootTest
class EmployeeFilterValidationTest {

    @Test
    void should_filter_list_with_6_employees_and_return_employees_byAgeGreaterThanEqual()
    {
        // arrange
        List<Employee> employees = EmployeeStub.GetStub_with_6_employees();
        int AGE_TO_FILTER_GREATER_THAN_EQUAL = 51;
        int EMPLOYEES_SIZE_FILTERED_EXPECTED = 1;

        // act
        List<Employee> employeesFiltered = EmployeesFilters.byAgeGreaterThanEqual(employees, AGE_TO_FILTER_GREATER_THAN_EQUAL);

        // assert
        assertEquals(EMPLOYEES_SIZE_FILTERED_EXPECTED, employeesFiltered.size());

    }


    @Test
    void should_filter_list_with_6_employees_and_return_employees_byAgeEqual()
    {
        // arrange
        List<Employee> employees = EmployeeStub.GetStub_with_6_employees();
        int AGE_TO_FILTER_EQUAL = 55;
        int EMPLOYEES_SIZE_FILTERED_EXPECTED = 1;

        // act
        List<Employee> employeesFiltered = EmployeesFilters.byAgeEqual(employees, AGE_TO_FILTER_EQUAL);

        // assert
        assertEquals(EMPLOYEES_SIZE_FILTERED_EXPECTED, employeesFiltered.size());

    }

    @Test
    void should_filter_list_with_6_employees_and_return_employees_byAgeLessThanEqual()
    {
        // arrange
        List<Employee> employees = EmployeeStub.GetStub_with_6_employees();
        int AGE_TO_FILTER_EQUAL = 40;
        int EMPLOYEES_SIZE_FILTERED_EXPECTED = 3;

        // act
        List<Employee> employeesFiltered = EmployeesFilters.byAgeLessThanEqual(employees, AGE_TO_FILTER_EQUAL);

        // assert
        assertEquals(EMPLOYEES_SIZE_FILTERED_EXPECTED, employeesFiltered.size());

    }

}

