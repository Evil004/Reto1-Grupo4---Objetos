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

            if (employee.getDepartamento() == idDep) {
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
        int idDepartamento = Utilities.readNumber("Introduce el ID del departamento");

        for (Department department: DepartmentsData.getDepartments()) {
            int costeDepartamento = 0;
            if (department.getId() == idDepartamento) {

                for (Employee employee: EmployeesData.getEmployees()) {
                    if (employee.getDepartamento() == idDepartamento) {
                        for (QuoteGroup quoteGroup: QuoteGroupsData.getQuoteGroups()) {
                            if (employee.getGrupCotizacion() == quoteGroup.getId()) {
                                costeDepartamento += quoteGroup.getSalaryBase();
                            }
                        }
                    }
                }
                System.out.println("El departamento " + department.name + " tiene un coste salarial de: " + costeDepartamento + "€");

            }
        }
    }

    private static int getDepartmentCost(int idDepartamento, int costeDepartamento) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        ArrayList<QuoteGroup> quoteGroups = QuoteGroupsData.getQuoteGroups();

        for (Employee employee: employees) {
            if (employee.getDepartamento() == idDepartamento) {
                for (QuoteGroup quoteGroup: quoteGroups) {
                    if (employee.getGrupCotizacion() == quoteGroup.getId()) {
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
                System.out.println("Hay " + countEmployeeOnDep(department.getId()) + " empleados en el departamento " + department.name);
            }

        } else {
            System.out.println("No se han encontrado departamentos");
        }

    }
}


