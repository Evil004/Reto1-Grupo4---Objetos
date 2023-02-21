package Data.Departments;
import Data.QuoteGroup.QuoteGroup;
import Data.QuoteGroup.QuoteGroupsData;
import Util.Utilities;
import Data.Employees.Employee;
import Data.Employees.EmployeesData;

import java.util.ArrayList;

import static Data.Employees.EmployeesData.employees;

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

    public static void consultarCosteSalarialDepartamento() {
        int idDepartamento = leerEntero("Introduce el ID del departamento");

        for (Departamento departamento: departamentos) {
            int costeDepartamento = 0;
            if (departamento.id == idDepartamento) {

                for (Empleado empleado: empleados) {
                    if (empleado.departamento == idDepartamento) {
                        for (GrupoCotizacion grupoCotizacion: gruposCotizacion) {
                            if (empleado.grupCotizacion == grupoCotizacion.id) {
                                costeDepartamento += grupoCotizacion.sueldoBase;
                            }
                        }
                    }
                }
                System.out.println("El departamento " + departamento.nombre + " tiene un coste salarial de: " + costeDepartamento + "€");

            }
        }
    }

    private static int getDepartmentCost(int idDepartamento, int costeDepartamento) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        ArrayList<QuoteGroup> quoteGroups = QuoteGroupsData.getQuotegroup();

        for (Employee employee: employees) {
            if (employee.getDepartamento() == idDepartamento) {
                for (QuoteGroup quoteGroup: ) {
                    if (empleado.grupCotizacion == grupoCotizacion.id) {
                        costeDepartamento += grupoCotizacion.sueldoBase;
                    }
                }
            }
        }
        return costeDepartamento;
    }
}


