package Data.Employees;
import Data.Departments.Department;
import Data.Departments.DepartmentsData;
import Util.Utilities;
import java.util.ArrayList;


public class EmployeeQuery {

    public static void employeeByCategory(String category){
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        System.out.println("A1 - A2 - A3 - B1 - B2 -B3");
        for (Employee employee: employees) {
            if (employee.getGroupProfCat().equals(category)) {
                System.out.println(employee);;
            }
        }
    }
    public static void employeeByDNI(String dni) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();


            for (Employee employee: employees) {
                if (employee.getDni().equals(dni)) {
                    System.out.println(employee);
                    return;
                }
            }
            System.out.println("No existe un empleado con ese DNI");

    }
    public static Employee employeeByID(int ID) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();

            for (Employee employee: employees) {
                if (employee.getId() == ID) {
                    System.out.println(employee);
                    return employee;
                }
            }
            System.out.println("No se ha encontrado un empleado con ese ID.");

        return null;
    }
   public static void employeesByDepartment(int idDep) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        ArrayList<Department> departments = DepartmentsData.getDepartments();

        while (true) {
            boolean flag = false;
            for (Employee employee: employees) {
                if (employee.getDepartment() == idDep) {
                    for (Department department: departments) {
                        if (department.getId() == idDep) {
                            flag = true;
                            System.out.printf("ID: %-12s Empleado: %-12s Departamento: %-12s \n", employee.getId(), employee.getName(), departments.get(departments.indexOf(department)).getName());
                        }
                    }

                }
            }
            if (flag) {
                return;
            }
            System.out.println("No se ha encontrado un departamento con ese id");
        }

    }
    public static void incorporeEmployee() {
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        Employee employee = createEmployee();
        EmployeesData.addEmployee(employee);
        System.out.println("Se ha creado un nuevo empleado");
    }
    private static Employee createEmployee() {
        ArrayList<Employee> employees = EmployeesData.getEmployees();

        int id = employees.get(employees.size() - 1).getId() + 1;
        String dni = Utilities.readLine("Introduce el DNI del empleado: ");
        String nombre = Utilities.readLine("Introduce el nombre del empleado: ");
        String apellido1 = Utilities.readLine("Introduce el primer apellido del empleado: ");
        String apellido2 = Utilities.readLine("Introduce el segundo apellido del empleado: ");
        String cuenta = Utilities.readLine("Introduce la cuenta del empleado: ");
        int nss = Utilities.readNumber("Introduce el numero de la seguridad social del empleado: ");
        String antiguedad = Utilities.readLine("Introduce la antiguedad del empleado: ");
        String catGrupProfesional = Utilities.readLine("Introduce la categoria del grupo profesional del empleado: ");
        int grupCotizacion = Utilities.readNumber("Introduce el grupo de cotizacion del empleado: ");
        int departamento = Utilities.readNumber("Introduce el departamento del empleado: ");
        String email = Utilities.readLine("Introduce el email del empleado: ");


        return new Employee(id, dni, nombre, apellido1, apellido2, cuenta, nss, antiguedad, catGrupProfesional, grupCotizacion, email, departamento);
    }

    public static void modifyPersonalData(int id) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();


            Employee employeeToModify = EmployeesData.getEmployeeByID(id);

            Employee auxEmployee = createEmployee();

            employeeToModify.setDni(auxEmployee.getDni());
            employeeToModify.setName(auxEmployee.getName());
            employeeToModify.setSurname1(auxEmployee.getSurname1());
            employeeToModify.setSurname2(auxEmployee.getSurname2());
            employeeToModify.setAccount(auxEmployee.getAccount());
            employeeToModify.setNss(auxEmployee.getNss());
            employeeToModify.setSeniority(auxEmployee.getSeniority());
            employeeToModify.setGroupProfCat(auxEmployee.getGroupProfCat());
            employeeToModify.setQuoteGroup(auxEmployee.getQuoteGroup());
            employeeToModify.setEmail(auxEmployee.getEmail());
            employeeToModify.setDepartment(auxEmployee.getDepartment());


    }
    public static void deleteEmployeeData(int id) {
        Employee employee = EmployeesData.getEmployeeByID(id);

        if (employee != null) {
            System.out.println("Va a eliminar el empleado " + employee.getName());
            String decision = Utilities.readLine("Quieres continuar? (si/no)");

            if (decision.equals("si")) {
                EmployeesData.removeEmployee(employee);
                System.out.println("Se ha eliminado el empleado");
            } else if (decision.equals("no")) {
                System.out.println("Eliminación cancelada");
            } else {
                System.out.println("Introduce una respuesta válida");
            }
        } else {
            System.out.println("No se ha encontrado ningún empleado con el id " + id);
        }
    }

    /**
     * autor/es: Jonathan Taban
     * Print all the Employees Data
     */
    public static void printEmployeesData(Employee employee) {
        ArrayList<Department> departments = DepartmentsData.getDepartments();

        System.out.println("\n");
        System.out.println("Id: " + employee.getId());
        System.out.println("DNI: " + employee.getDni());
        System.out.println("Name: " + employee.getName());
        System.out.println("Surnames: " + employee.getSurname1() + " " + employee.getSurname2());
        System.out.println("Account: " + employee.getAccount());
        System.out.println("Seniority: " + employee.getSeniority());
        System.out.println("Profesional Group Category: " + employee.getGroupProfCat());
        System.out.println("Quote Group: " + employee.getQuoteGroup());

        for (Department department: departments) {

            if (department.getId() == employee.getDepartment()) {

                System.out.println("Department: " + department.getName());

            }
        }
        System.out.println("Account: " + employee.getEmail());

    }
}
