package Data.ExtraHours;

import static Util.Utilities.*;

import Data.Employees.Employee;
import Data.Employees.EmployeesData;

/**
 * @author Pere Prior
 */

public class ExtraHourQuery{

    //QUERY
    public static void ExtraHourNIFQuery(String dni) {
        while (true) {
            dni = readLine("Enter the NIF of the employee to search: ");
            for (ExtraHours hour: ExtraHoursData.getExtraHours()) {

                if (hour.nif.equals(dni)) {
                    for (Employee employee: EmployeesData.getEmployees()) {
                        if (employee.getDni().equals(nif)) {
                            int hours = (hour.getEndTime() - hour.getStartTime());
                            System.out.println(employee.getNombre() + " worked " + hours + " extra hours");
                            return;
                        }
                    }

                }
            }
            System.out.println("This employee doesn't have extra hours.");

        }

    }

    /*public static void consultarHorasExtraID() {
        String dniEmpleado = null;
        Empleado empleado = null;

        while (true) {
            int idEmpleado = leerEntero("Introduce el ID del empleado: ");

            for (Empleado empleadoTemp: empleados) {
                if (empleadoTemp.id == idEmpleado) {
                    empleado = empleadoTemp;
                    dniEmpleado = empleadoTemp.dni;
                }
            }
            if (dniEmpleado != null) {
                break;
            } else {
                System.out.println("No se ha encontrado un empleado con ese ID.");

            }
        }


        for (ExtraHoursData hora: e) {
            if (hora.nif.equals(dniEmpleado)) {
                int horas = (hora.hora_f - hora.hora_i);
                System.out.println(empleado.nombre + " ha realizado " + horas + " horas extra");
                return;
            }

        }
        System.out.println("Ese empleado no tiene horas extra.");
    }*/

}
