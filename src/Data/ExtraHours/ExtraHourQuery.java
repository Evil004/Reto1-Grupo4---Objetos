package Data.ExtraHours;

import static Util.Utilities.*;

import Data.Employees.Employee;
import Data.Employees.EmployeesData;

/**
 * @author Pere Prior
 */

public class ExtraHourQuery{

    //QUERY
    public static void extraHourNIFQuery(String nif) {
        while (true) {
            nif = readLine("Enter the NIF of the employee to search: ");
            for (ExtraHours hour: ExtraHoursData.getExtraHours()) {

                if (hour.nif.equals(nif)) {
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

    public static void extraHourIDQuery() {
        String employeeNIF = null;
        Employee employee = null;

        do {
            int idEmpleado = readNumber("Enter de ID of the employee to search: ");

            for (Employee employeeTemp : EmployeesData.getEmployees()) {
                if (employeeTemp.getId() == idEmpleado) {
                    employee = employeeTemp;
                    employeeNIF = employeeTemp.getDni();
                }
            }
            System.out.println("This employee doesn't exits.");
        } while (employeeNIF == null);


        for (ExtraHours hour: ExtraHoursData.getExtraHours()) {
            if (hour.getNif().equals(employeeNIF)) {
                int horas = (hour.getEndTime() - hour.getStartTime());
                System.out.println(employee.getNombre() + " worked " + horas + " extra hours");
                return;
            }

        }
        System.out.println("This employee doesn't have extra hours.");
    }

}
