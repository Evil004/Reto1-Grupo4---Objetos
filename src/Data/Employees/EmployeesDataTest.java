package Data.Employees;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeesDataTest {
    private static ArrayList<Employee> employees;

    @BeforeEach
    public void setUp() {
        employees = new ArrayList<>();

        employees.add(new Employee(1, "12345678A", "Juan", "Pérez", "García", "ES1234567890123456789012", 123456789, "10 años", "Grupo 1, Categoría A", 1, "juan.perez@example.com", 1));
        employees.add(new Employee(2, "23456789B", "María", "González", "López", "ES2345678901234567890123", 234567890, "5 años", "Grupo 2, Categoría B", 2, "maria.gonzalez@example.com", 1));
        employees.add(new Employee(3, "34567890C", "Pedro", "Sánchez", "Romero", "ES3456789012345678901234", 345678901, "2 años", "Grupo 3, Categoría C", 3, "pedro.sanchez@example.com", 2));
        EmployeesData.setEmployees(employees);
    }

    @Test
    void getEmployees() {
        assertEquals(3, EmployeesData.getEmployees().size());
    }

    @Test
    void addEmployee() {
        Employee newEmployee = new Employee(4, "45678901D", "Ana", "Martínez", "García", "ES4567890123456789012345", 456789012, "3 años", "Grupo 1, Categoría B", 1, "ana.martinez@example.com", 2);
        EmployeesData.addEmployee(newEmployee);
        assertTrue(EmployeesData.getEmployees().contains(newEmployee));
    }

    @Test
    void getEmployeeByID() {
        Employee employee = employees.get(0);
        assertEquals(employee, EmployeesData.getEmployeeByID(1));
    }

    @Test
    void getLastId() {
        int lastId = employees.get(employees.size() - 1).getId();
        assertEquals(lastId, EmployeesData.getLastId());
    }

    @Test
    void getEmployeeByDNI() {
        Employee employee = employees.get(2);
        assertEquals(employee, EmployeesData.getEmployeeByDNI("34567890C"));
    }


    @Test
    void setColumns() {
        String newColumns = "ID,DNI,Name,Surname1,Surname2,Account";
        EmployeesData.setColumns(newColumns);
        assertEquals(newColumns, EmployeesData.getColumns());
    }

    @Test
    void removeEmployee() {
        Employee employee = employees.get(0);
        EmployeesData.removeEmployee(employee);
        assertFalse(EmployeesData.getEmployees().contains(employee));
    }

}