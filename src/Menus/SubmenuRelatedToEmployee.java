package Menus;
import Data.Departments.DepartmentQuery;
import Data.Employees.Employee;
import Data.Employees.EmployeeQuery;
import Data.Employees.EmployeesData;
import Util.Utilities;
import java.util.ArrayList;

/**
 * autor/es: Jonathan Taban
 * SUBMENU RELATED TO EMPLOYEE
 */
public class SubmenuRelatedToEmployee {
    public static int election;
    public static String lineInf = Utilities.generateLines("¯");
    public static String lineSup = Utilities.generateLines("_");

    public static void RelatedToEmployee() {
        boolean flag = true;
        ArrayList<Employee> employees = EmployeesData.getEmployees();

        do {
            Utilities.cleanScreen();

            election = Utilities.readNumber(String.format(lineSup + "\n| %-30s | %-30s | %-30s | %-30s | %-30s |\n| %-30s | %-30s | %-30s | %-30s | %-30s |\n" + lineInf, "1.All the Employees", "2.Employee by DNI", "3.Employee on a department", "4.Number of employees by Dep.", "5.Employees by category", "6.Employee by ID", "7.Go to last menu", "0.Exit", "", "", ""));

            switch (election) {
                case 1:
                    for (Employee employee: employees) {
                       EmployeeQuery.printEmployeesData(employee);
                    }
                    Utilities.waitEnter();
                    break;
                case 2:
                    String dni = Utilities.readLine("Enter de DNI: ");
                    EmployeeQuery.employeeByDNI(dni);
                    Utilities.waitEnter();

                    break;
                case 3:
                    int idDep = Utilities.readNumber("Enter the ID from the Department: ");
                    EmployeeQuery.employeesByDepartment(idDep);
                    Utilities.waitEnter();

                    break;
                case 4:
                    DepartmentQuery.NumberOfEmployeesByDepartment();
                    Utilities.waitEnter();
                    break;
                case 5:
                    String Category = Utilities.readLine("Enter de Category: ");
                    EmployeeQuery.employeeByCategory(Category);
                    Utilities.waitEnter();
                    break;
                case 6:
                    int ID = Utilities.readNumber("Enter the employees ID: ");
                    EmployeeQuery.employeeByID(ID);
                    Utilities.waitEnter();
                    break;
                case 7:
                    MenuConsult.Consult();
                    return;

                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Option");
            }
            Utilities.cleanScreen();

        } while (election != 0);
    }
}
