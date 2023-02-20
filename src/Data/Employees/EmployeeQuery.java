package Data.Employees;
import java.util.ArrayList;


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
    public void employeeByCategory(int id,ArrayList<Employee> employees){
        System.out.println("A1 - A2 - A3 - B1 - B2 -B3");
        String categoria = Util.Utilities.leerCadena("Introduce la categoria de la que obtener los employees: ");
        for (Employee employee: employees) {
            if (employee.catGrupProfesional.equals(categoria)) {
                imprimirDatosEmpleado(employee);
            }
        }
    }

}
