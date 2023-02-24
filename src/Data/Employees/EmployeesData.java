package Data.Employees;

import java.util.ArrayList;
import java.util.Objects;

/**
 * @author Jose Vicente Ebri
 * Contains the data about employees
 */

public class EmployeesData {
    private static ArrayList<Employee> employees;
    private static String columns;

    public EmployeesData(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public static ArrayList<Employee> getEmployees() {

        return employees;
    }

    public EmployeesData() {
        this.employees = new ArrayList<>();
    }

    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public static Employee getEmployeeByID(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }

        }
        return null;
    }

    public static int getLastId() {
        if (employees.size() != 0) {
            return employees.get(employees.size() - 1).getId();

        }
        return 0;
    }

    public static Employee getEmployeeByDNI(String dni){
        for (Employee employee : employees) {
            if (Objects.equals(employee.getDni(), dni)) {
                return employee;
            }

        }
        return null;
    }

    public static String getColumns() {
        return columns;
    }

    public static void setColumns(String columns) {
        EmployeesData.columns = columns;
    }
    public static void removeEmployee(Employee employee) {
        employees.remove(employee);
    }
}