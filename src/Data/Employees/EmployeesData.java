package Data.Employees;

import java.util.ArrayList;

public class EmployeesData {
    ArrayList<Employee> employees;

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
