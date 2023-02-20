package Data.Employees;

import java.util.ArrayList;

public class EmployeesData {
    private static ArrayList<Employee> employees;

    public EmployeesData(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public static ArrayList<Employee> getEmployees(){
        return employees;
    }
}
