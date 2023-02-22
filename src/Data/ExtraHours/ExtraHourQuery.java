package Data.ExtraHours;

import static Util.Utilities.*;

import Data.Employees.Employee;
import Data.Employees.EmployeesData;

/**
 * @author Pere Prior
 */

public class ExtraHourQuery{

    //QUERY
    public static void extraHourNIFQuery(String dni) {
        while (true) {
            dni = readLine("Enter the NIF employee to search: ");
            for (ExtraHours hour: ExtraHoursData.getExtraHours()) {

                if (hour.getNif().equals(dni)) {
                    for (Employee employee: EmployeesData.getEmployees()) {
                        if (employee.getDni().equals(dni)) {
                            int hours = (hour.getEndTime() - hour.getStartTime());
                            System.out.println(employee.getName() + " worked " + hours + " extra hours");
                            return;
                        }
                    }

                }
            }
            System.out.println("This employee doesn't have extra hours.");

        }

    }

    public static void extraHourIDQuery() {
        String EmployeeNIF = null;
        Employee employee = null;

        while (true) {
            int idEmpleado = readNumber("Enter the employee ID to search: ");

            for (Employee employeeTemp: EmployeesData.getEmployees()) {
                if (employeeTemp.getId() == idEmpleado) {
                    employee = employeeTemp;
                    EmployeeNIF = employeeTemp.getDni();
                }
            }
            if (EmployeeNIF != null) {
                break;
            } else {
                System.out.println("Doesn't exists a employee with this ID.");

            }
        }


        for (ExtraHours hora: ExtraHoursData.getExtraHours()) {
            if (hora.nif.equals(EmployeeNIF)) {
                int horas = (hora.getEndTime() - hora.getStartTime());
                System.out.println(employee.getName() + " worked " + horas + " extra hours");
                return;
            }

        }
        System.out.println("This employee doesn't have extra hours.");
    }

}
