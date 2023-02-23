package Menus;

import Data.Departments.DepartmentQuery;
import Data.Employees.EmployeeQuery;
import Util.Utilities;

public class MenuModifie {
    public static int election;
    public static String lineInf = Utilities.generateLines("¯");
    public static String lineSup = Utilities.generateLines("_");
    public static void Modifie() {
        boolean flag = true;

        do {
            Utilities.cleanScreen();
            election = Utilities.readNumber(String.format(lineSup + "\n| %-30s | %-30s | %-30s | %-30s | %-30s |\n" + lineInf, "1.Modifie Employees Data", "2.Delete Departments Data", "3.Delete Employees Data", "4.Go back to Main Menu", "0.Exit"));

            switch (election) {
                case 1:
                    //EmployeeQuery.modifyPersonalData(int id);
                    Utilities.waitEnter();
                    break;
                case 2:
                    DepartmentQuery.deleteDepartmentData();
                    Utilities.waitEnter();
                    break;
                case 3:
                    //EmployeeQuery.deleteEmployeeData(int id);
                    Utilities.waitEnter();
                    break;
                case 4:
                    return;
                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion inválida");
                    Utilities.waitEnter();
                    continue;
            }
            Utilities.cleanScreen();

        } while (election != 0);

    }
}
