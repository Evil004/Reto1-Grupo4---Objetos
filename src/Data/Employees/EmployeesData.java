package Data.Employees;

import java.util.ArrayList;

/**
 * @author Jose Vicente Ebri
 * Contains the data about employees
 */
public class EmployeesData {
    static ArrayList<Employee> employees;

    public EmployeesData(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public static ArrayList<Employee> getEmployees(){

        return employees;
    }

    public EmployeesData() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
