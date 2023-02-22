package Data.QuoteGroup;
import Data.Employees.Employee;
import Data.Employees.EmployeesData;
import Data.QuoteGroup.*;

import java.util.ArrayList;

public class QuoteGroupQuery {
    public static void SalaryCostQuoteGroup(int category) {
        ArrayList<QuoteGroup> quoteGroups = QuoteGroupsData.getQuoteGroups();
        ArrayList<Employee> employees = EmployeesData.getEmployees();

        for (QuoteGroup quoteGroup: quoteGroups) {
            int employeesByGroup = 0;
            for (Employee employee: employees) {
                if (employee.getQuoteGroup() == quoteGroup.getId()) {
                    employeesByGroup++;
                }
            }

            if (quoteGroup.getId() == category) {
                System.out.println("El grupo de cotizacion " + quoteGroup.getId() + " tiene un coste salarial de " + quoteGroup.getSalaryBase() * employeesByGroup + "€");

            }
        }
    }
}
