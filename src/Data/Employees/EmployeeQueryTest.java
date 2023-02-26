package Data.Employees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class EmployeeQueryTest {

    private static ArrayList<Employee> employees;
    @BeforeEach
    public void setUp() {

        employees = new ArrayList<>();

        employees.add(new Employee(1, "12345678A", "Juan", "Pérez", "García", "ES1234567890123456789012", 123456789, "10 años", "A1", 1, "juan.perez@example.com", 1));
        employees.add(new Employee(2, "23456789B", "María", "González", "López", "ES2345678901234567890123", 234567890, "5 años", "B2", 2, "maria.gonzalez@example.com", 1));
        employees.add(new Employee(3, "34567890C", "Pedro", "Sánchez", "Romero", "ES3456789012345678901234", 345678901, "2 años", "C3", 3, "pedro.sanchez@example.com", 2));
        EmployeesData.setEmployees(employees);
    }


    @Test
    void employeeByID() {
        assertEquals("Juan", EmployeeQuery.employeeByID(1).getName());
        assertEquals("María", EmployeeQuery.employeeByID(2).getName());
        assertNull(EmployeeQuery.employeeByID(4)); // ID no existente
    }

}