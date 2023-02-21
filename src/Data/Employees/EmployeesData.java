package Data.Employees;

import java.util.ArrayList;

/**
 * @author Jose Vicente Ebri
 * Contains the data about employees
 */
public class EmployeesData {
    private static ArrayList<Employee> employees;

    public EmployeesData(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public static ArrayList<Employee> getEmployees(){

        return employees;
    }

    public EmployeesData() {
        this.employees = new ArrayList<>();
    }

    public static void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public static int getLastId(){
        if (employees.size() != 0) {
            return employees.get(employees.size()-1).getId();

        }
        return 0;
    }
}
