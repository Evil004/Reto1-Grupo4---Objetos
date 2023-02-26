package Data.Departments;
import Data.QuoteGroup.QuoteGroup;
import Data.QuoteGroup.QuoteGroupsData;
import Util.Utilities;
import Data.Employees.Employee;
import Data.Employees.EmployeesData;

import java.util.ArrayList;

/**
 * autor/es: Jonathan Taban
 * Count the Employees on Department
 */
public class DepartmentQuery {
    private static int countEmployeeOnDep(int idDep) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();

        int numEmpleados = 0;
        for (Employee employee: employees) {

            if (employee.getDepartment() == idDep) {
                numEmpleados++;
            }
        }
        return numEmpleados;
    }

    /**
     * autor/es: Jonathan Taban
     * Consult the salary cost from department
     */
public static void consultSalaryCostFromDepartment() {
        int idDepartamento = Utilities.readNumber("Enter the department ID");

        for (Department department: DepartmentsData.getDepartments()) {
            int costeDepartamento = 0;
            if (department.getId() == idDepartamento) {

                for (Employee employee: EmployeesData.getEmployees()) {
                    if (employee.getDepartment() == idDepartamento) {
                        for (QuoteGroup quoteGroup: QuoteGroupsData.getQuoteGroups()) {
                            if (employee.getQuoteGroup() == quoteGroup.getId()) {
                                costeDepartamento += quoteGroup.getSalaryBase();
                            }
                        }
                    }
                }
                System.out.println("The department " + department.name + " have a salary cost of: " + costeDepartamento + "€");

            }
        }
    }

    private static int getDepartmentCost(int idDepartamento, int costeDepartamento) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        ArrayList<QuoteGroup> quoteGroups = QuoteGroupsData.getQuoteGroups();

        for (Employee employee: employees) {
            if (employee.getDepartment() == idDepartamento) {
                for (QuoteGroup quoteGroup: quoteGroups) {
                    if (employee.getQuoteGroup() == quoteGroup.getId()) {
                        costeDepartamento += quoteGroup.getSalaryBase();
                    }
                }
            }
        }
        return costeDepartamento;
    }

    /**
     * autor/es: Jonathan Taban
     * Number of employees by department
     */
    public static void NumberOfEmployeesByDepartment() {

        if (DepartmentsData.getDepartments().size() > 0) {
            for (Department department: DepartmentsData.getDepartments()) {
                System.out.println("There are " + countEmployeeOnDep(department.getId()) + " employees in department " + department.name);
            }

        } else {
            System.out.println("This department doesn't exists");
        }
    }

    /**
     * autor/es: Jonathan Taban
     * Incorporates Departments
     */

    public static void incorporateDepartment() {
        ArrayList<Department> departments = DepartmentsData.getDepartments();
        boolean save = true;

        int id = departments.get(departments.size() - 1).getId() + 1;
        String name = Utilities.readLine("Enter the department name ");


        Department department = new Department(id, name);
        departments.add(department);
        System.out.println("The department has create correctly");
        save = false;
    }

    /**
     * autor/es: Jonathan Taban
     * Delete the Departments Data
     */

    public static void deleteDepartmentData() {
        ArrayList<Department> departments = DepartmentsData.getDepartments();

        int id = Utilities.readNumber("Enter the department ID to delete: ");

        Department department = null;

        for (int i = 0; i < departments.size(); i++) {
            department = departments.get(i);
            if (department.getId() == id) {
                break;
            }
        }
        if (department == null) {
            System.out.println("It doesn't exists a department with ID " + id);
            return;
        }

        Decision(id);

    }

    /**
     * autor/es: Jonathan Taban
     * ASks the user if he wants to delete a department
     */

    public static void Decision(int id){
        ArrayList<Department> departments = DepartmentsData.getDepartments();
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        Department department = DepartmentsData.getByID(id);
        boolean save = true;

        int numberOfEmployees = countEmployeeOnDep(id);

        while (true) {
            String decision = Utilities.readLine("The department " + department.name + " is going to delete, are you sure? (yes, no)");
            switch (decision) {
                case "yes":
                    if (numberOfEmployees <= 0) {
                        departments.remove(department);
                        save = false;

                        return;
                    }

                    System.out.println("Are going to delete the department " + department.name + " with " + numberOfEmployees + " employees");

                    while (true) {
                        decision = Utilities.readLine("Do you want to continue? (yes/no)");

                        switch (decision) {
                            case "yes":

                                while (countEmployeeOnDep(id) > 0) {
                                    for (int j = 0; j < employees.size(); j++) {
                                        Employee employee = employees.get(j);

                                        if (employee.getDepartment() == id) {
                                            employees.remove(employees.indexOf(employee));
                                        }

                                    }
                                }

                                departments.remove(department);
                                save = false;
                                return;
                            case "no":
                                System.out.println("Eliminacion cancelada");
                                return;
                            default:
                                System.out.println("Introduce una respuesta valida");
                        }

                    }

                case "no":
                    System.out.println("Eliminacion cancelada");
                    return;
                default:
                    System.out.println("Opcion no valida, introduzca una opcion valida.");
                    Utilities.waitEnter();
                    Utilities.cleanScreen();
            }
        }
    }

}


