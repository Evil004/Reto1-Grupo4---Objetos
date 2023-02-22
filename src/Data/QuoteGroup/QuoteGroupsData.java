package Data.QuoteGroup;

import Data.Employees.Employee;
import Data.Employees.EmployeesData;

import java.util.ArrayList;

/**
 * @author Jose Vicente Ebri
 * Contains data about QuoteGroups
 */
public class QuoteGroupsData {
    private static ArrayList<QuoteGroup> quoteGroups;
    private static String columns;

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

    /**
     * author: Óscar Fernández
     * adds a quoteGroup to the quoteGroups list
     * @param quoteGroup the quoteGroup to add
     */
	public void addQuoteGroup(QuoteGroup quoteGroup) {
        quoteGroups.add(quoteGroup);
	}

    public static String getColumns() {
    	return columns;
    }

    public static void setColumns(String columns) {
    	QuoteGroupsData.columns = columns;
    }

}