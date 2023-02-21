package Data.Employees;
import Data.Departments.Department;
import Data.Departments.DepartmentsData;
import Util.Utilities;
import java.util.ArrayList;


public class EmployeeQuery {
    public static void printEmployeeData(Employee employee) {

        System.out.println("\n");
        System.out.println("Id: " + employee.getId());
        System.out.println("DNI: " + employee.getDni());
        System.out.println("Nombre: " + employee.getName());
        System.out.println("Apellidos: " + employee.getSurname1() + " " + employee.getSurname2());
        System.out.println("Cuenta: " + employee.getAccount());
        System.out.println("Antiguedad: " + employee.getSeniority());
        System.out.println("Categoria Grupo Profesional: " + employee.getGroupProfCat());
        System.out.println("Grupo cotizacion: " + employee.getQuoteGroup());
/*
        for (Departamento departamento: departamentos) {

            if (departamento.id == employee.departamento) {

                System.out.println("Departamento: " + departamento.nombre);

            }
        }*/
        System.out.println("Email: " + employee.getEmail());

    }
    public void employeeByCategory(String Category){
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        System.out.println("A1 - A2 - A3 - B1 - B2 -B3");
        String categoria = Util.Utilities.readLine("Introduce la categoria de la que obtener los employees: ");
        for (Employee employee: employees) {
            if (employee.getGroupProfCat().equals(categoria)) {
                printEmployeeData(employee);
            }
        }
    }
    public static void employeeByDNI(String dni) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();

        while (true) {
            for (Employee employee: employees) {
                if (employee.getDni().equals(dni)) {
                    printEmployeeData(employee);
                    return;
                }
            }
            System.out.println("No existe un empleado con ese DNI");
        }
    }
    public static void employeeByID(int ID) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        while (true) {
            for (Employee employee: employees) {
                if (employee.getId() == ID) {
                    printEmployeeData(employee);
                    return;
                }
            }
            System.out.println("No se ha encontrado un empleado con ese ID.");
        }

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

    /*public static void modifyPersonalData(int id) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        while (true) {

            for (Employee employee: employees) {
                if (id == employee.getId()) {

                    printEmployeeData(employeeByID(id));
                    System.out.println("...................");

                    System.out.println("\nIntroduce los datos modificados: \n");
                    Employee employeeToModify = createEmployee();

                    employeeToModify.getId() = id;
                    empleados.set(empleados.indexOf(buscarEmpleadoID(id)), empleadoAModificar);

                    imprimirDatosEmpleado(empleado);
                    guardado = false;

                    return;

                } else {

                    System.out.println("Opcion no valida.");

                }
            }
        }*/



}
