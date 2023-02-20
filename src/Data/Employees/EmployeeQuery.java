package Data.Employees;
import java.util.ArrayList;
import Util.Utilities;


public class EmployeeQuery {
    public static void imprimirDatosEmpleado(Employee employee) {

        System.out.println("\n");
        System.out.println("Id: " + employee.id);
        System.out.println("DNI: " + employee.dni);
        System.out.println("Nombre: " + employee.nombre);
        System.out.println("Apellidos: " + employee.apellido1 + " " + employee.apellido2);
        System.out.println("Cuenta: " + employee.cuenta);
        System.out.println("Antiguedad: " + employee.antiguedad);
        System.out.println("Categoria Grupo Profesional: " + employee.catGrupProfesional);
        System.out.println("Grupo cotizacion: " + employee.grupCotizacion);
/*
        for (Departamento departamento: departamentos) {

            if (departamento.id == employee.departamento) {

                System.out.println("Departamento: " + departamento.nombre);

            }
        }*/
        System.out.println("Email: " + employee.email);

    }
    public void employeeByCategory(String Category){
        ArrayList<Employee> employees = EmployeesData.getEmployees();
        System.out.println("A1 - A2 - A3 - B1 - B2 -B3");
        String categoria = Util.Utilities.readLine("Introduce la categoria de la que obtener los employees: ");
        for (Employee employee: employees) {
            if (employee.catGrupProfesional.equals(categoria)) {
                imprimirDatosEmpleado(employee);
            }
        }
    }
    public static void employeeByDNI(String dni) {
        ArrayList<Employee> employees = EmployeesData.getEmployees();

        while (true) {
            for (Employee employee: employees) {
                if (employee.dni.equals(dni)) {
                    imprimirDatosEmpleado(employee);
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
                if (employee.id == ID) {
                    imprimirDatosEmpleado(employee);
                    return;
                }
            }
            System.out.println("No se ha encontrado un empleado con ese ID.");
        }

    }

}
