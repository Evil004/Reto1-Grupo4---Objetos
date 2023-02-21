package FileAccess.CSV.CSVWritters;

import Data.Employees.Employee;
import Data.Employees.EmployeeQuery;
import Data.Employees.EmployeesData;

import java.io.File;
import static Util.Utilities.*;

public class DepartmentWritter extends CSVWritter{

    public static void modificarDatosPersonales() {

        while (true) {

            int id = readNumber("Introduce el ID del empleado a modificar:");

            for (Employee employee: EmployeesData.getEmployees()) {
                if (id == employee.getId()) {

                    EmployeeQuery.imprimirDatosEmpleado(EmployeeQuery.employeeByID(id));
                    System.out.println("...................");

                    System.out.println("\nIntroduce los datos modificados: \n");
                    Employee empleadoAModificar = crearEmpleado();

                    empleadoAModificar.id = id;
                    empleados.set(empleados.indexOf(buscarEmpleadoID(id)), empleadoAModificar);

                    imprimirDatosEmpleado(empleado);
                    guardado = false;

                    return;

                } else {

                    System.out.println("Opcion no valida.");

                }
            }
        }


    }

    public DepartmentWritter(File file) {
        super(file);
    }

    public DepartmentWritter(String path){
        super(path);
    }

    @Override
    public Object writeData() {
        return null;
    }
}
