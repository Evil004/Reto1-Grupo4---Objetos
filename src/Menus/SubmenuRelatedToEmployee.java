package Menus;
import Data.Departments.DepartmentQuery;
import Data.Employees.Employee;
import Data.Employees.EmployeeQuery;
import Data.Employees.EmployeesData;
import Util.Utilities;

import java.util.ArrayList;

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
                    //EmployeeQuery.employeeByDNI(String dni);
                    Utilities.waitEnter();

                    break;
                case 3:
                    //EmployeeQuery.employeesByDepartment(int idDep);
                    Utilities.waitEnter();

                    break;
                case 4:
                    DepartmentQuery.NumberOfEmployeesByDepartment();
                    Utilities.waitEnter();
                    break;
                case 5:
                    //EmployeeQuery.employeeByCategory(String Category);
                    Utilities.waitEnter();
                    break;
                case 6:
                    //EmployeeQuery.employeeByID(int ID);
                    Utilities.waitEnter();
                    break;
                case 7:
                    MenuConsult.Consult();
                    return;

                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion Invalida");
            }
            Utilities.cleanScreen();

        } while (election != 0);
    }
}
