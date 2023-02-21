package Data.QuoteGroup;

import Data.Employees.Employee;
import Data.Employees.EmployeesData;

import java.util.ArrayList;

/**
 * @author Jose Vicente Ebri
 * Contains data about QuoteGroups
 */
public class QuoteGroupsData {
    static ArrayList<QuoteGroup> quoteGroups;

    public QuoteGroupsData(ArrayList<QuoteGroup> quoteGroups) {
        QuoteGroupsData.quoteGroups = quoteGroups;
    }

    public static ArrayList<QuoteGroup> getQuoteGroups() {

        return quoteGroups;
    }

    public QuoteGroupsData() {
        quoteGroups = new ArrayList<>();
    }

    public void addEmployee(QuoteGroup quoteGroup) {
        quoteGroups.add(quoteGroup);
    }
}