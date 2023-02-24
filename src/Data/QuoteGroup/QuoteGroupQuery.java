package Data.QuoteGroup;
import Data.Employees.Employee;
import Data.Employees.EmployeesData;
import Data.QuoteGroup.*;

import java.util.ArrayList;

public class QuoteGroupQuery {
    public static void SalaryCostQuoteGroup(int quoteGroup) {
        ArrayList<QuoteGroup> quoteGroups = QuoteGroupsData.getQuoteGroups();
        ArrayList<Employee> employees = EmployeesData.getEmployees();

        for (QuoteGroup i: quoteGroups) {
            int employeesByGroup = 0;
            for (Employee employee: employees) {
                if (employee.getQuoteGroup() == i.getId()) {
                    employeesByGroup++;
                }
            }

            if (i.getId() == quoteGroup) {
                System.out.println("El grupo de cotizacion " + i.getId() + " tiene un coste salarial de " + i.getSalaryBase() * employeesByGroup + "€");

            }
        }
    }
}
