package Data.ExtraHours;

import static Util.Utilities.*;

import Data.Employees.Employee;
import Data.Employees.EmployeesData;

import java.util.Objects;

/**
 * @author Pere Prior
 */

public class ExtraHourQuery{

    //QUERY
    public static void extraHourNIFQuery(String dni) {

        for (ExtraHours hour : ExtraHoursData.getExtraHours()) {
            if (!Objects.equals(hour.getNif(), dni)){
                continue;
            }

            Employee employee = EmployeesData.getEmployeeByDNI(dni);

            if (employee == null){
                System.out.println("Employee with that DNI not found");
                return;
            }


            int hours = hour.getEndTime() - hour.getStartTime();
            System.out.println(employee.getName() + " worked " + hours + " extra hours");
            return;


        }
        System.out.println("Employee with that DNI not found");
    }

    public static void extraHourIDQuery() {
        String EmployeeNIF = null;
        Employee employee = null;

        do {
            int idEmpleado = readNumber("Enter the employee ID to search: ");

            for (Employee employeeTemp : EmployeesData.getEmployees()) {
                if (employeeTemp.getId() == idEmpleado) {
                    employee = employeeTemp;
                    EmployeeNIF = employeeTemp.getDni();
                }
            }
            System.out.println("Doesn't exists a employee with this ID.");
        } while (EmployeeNIF == null);


        for (ExtraHours hora: ExtraHoursData.getExtraHours()) {
            if (hora.getNif().equals(EmployeeNIF)) {
                int horas = (hora.getEndTime() - hora.getStartTime());
                System.out.println(employee.getName() + " worked " + horas + " extra hours");
                return;
            }

        }
        System.out.println("This employee doesn't have extra hours.");
    }

}
