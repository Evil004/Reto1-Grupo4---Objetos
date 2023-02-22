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
        int idDepartamento = Utilities.readNumber("Introduce el ID del departamento");

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
                System.out.println("El departamento " + department.name + " tiene un coste salarial de: " + costeDepartamento + "€");

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
                System.out.println("Hay " + countEmployeeOnDep(department.getId()) + " empleados en el departamento " + department.name);
            }

        } else {
            System.out.println("No se han encontrado departamentos");
        }
    }

    /**
     * autor/es: Jonathan Taban
     * Incorporates Departments
     */

    public static void incorporateDepartment() {
        boolean save = true;

        int id = DepartmentsData.getDepartments().get(DepartmentsData.getDepartments().size() - 1).getId() + 1;
        String name = Utilities.readLine("Introduce el nombre del departamento ");


        Department department = new Department(id, name);
        DepartmentsData.getDepartments().add(department);
        System.out.println("Se ha creado un nuevo departamento");
        save = false;
    }

    /**
     * autor/es: Jonathan Taban
     * Delete the Departments Data
     */

    public static void deleteDepartmentData() {
        ArrayList<Department> departments = DepartmentsData.getDepartments();

        int id = Utilities.readNumber("Introduce el ID del Departamento a eliminar: ");

        Department department = null;

        for (int i = 0; i < departments.size(); i++) {
            department = departments.get(i);
            if (department.getId() == id) {
                break;
            }
        }
        if (department == null) {
            System.out.println("No se ha encontrado el departamento con el id " + id);
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
        Department department = null;
        boolean save = true;

        int numberOfEmployees = countEmployeeOnDep(id);

        while (true) {
            String decision = Utilities.readLine("Se va a eleminar el departamento " + department.name + ", estas seguro? (si, no)");
            switch (decision) {
                case "si":
                    if (numberOfEmployees <= 0) {
                        departments.remove(department);
                        save = false;

                        return;
                    }

                    System.out.println("Vas a eliminar el departamento " + department.name + " que tiene " + numberOfEmployees + " empleados");

                    while (true) {
                        decision = Utilities.readLine("Quieres continuar? (si/no) Si continuas se eliminaran todos los empleados en cascada");

                        switch (decision) {
                            case "si":

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


