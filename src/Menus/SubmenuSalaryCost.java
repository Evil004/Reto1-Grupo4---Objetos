package Menus;

import Data.Departments.DepartmentQuery;
import Data.QuoteGroup.QuoteGroupQuery;
import Util.Utilities;

public class SubmenuSalaryCost {
    public static int election;
    public static String lineInf = Utilities.generateLines("¯");
    public static String lineSup = Utilities.generateLines("_");
    public static void SalaryCost() {
        boolean flag = true;

        do {
            Utilities.cleanScreen();
            election = Utilities.readNumber(String.format(lineSup + "\n| %-30s | %-30s | %-30s | %-30s | %-30s | %-30s |\n" + lineInf, "1.Cost by Quote Grup", "2.Salary cost from department", "3.Go to last menu", "0.Exit","",""));

            switch (election) {
                case 1:
                    int category = Utilities.readNumber("Enter de number of the Quote Group: ");
                    QuoteGroupQuery.SalaryCostQuoteGroup(category);
                    Utilities.waitEnter();
                    break;
                case 2:
                    DepartmentQuery.consultSalaryCostFromDepartment();
                    Utilities.waitEnter();
                    break;
                case 3:
                    MenuConsult.Consult();
                    return;

                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Invalid Option");
                    Utilities.waitEnter();
            }
            Utilities.cleanScreen();

        } while (election != 0);
    }
}
