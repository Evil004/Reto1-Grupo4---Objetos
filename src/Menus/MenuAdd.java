package Menus;

import Data.Departments.DepartmentQuery;
import Data.Employees.EmployeeQuery;
import Util.Utilities;

public class MenuAdd {
    public static int election;
    public static String lineInf = Utilities.generateLines("¯");
    public static String lineSup = Utilities.generateLines("_");

    public static void Add() {
        boolean flag = true;

        do {
            Utilities.cleanScreen();
            election = Utilities.readNumber(String.format(lineSup + "\n| %-30s | %-30s | %-30s | %-30s | %-30s |\n" + lineInf, "1.New Employee", "2.New Department", "3.Go back to Main Menu", "0.Exit"));

            switch (election) {
                case 1:
                    EmployeeQuery.incorporeEmployee();
                    Utilities.waitEnter();
                    break;
                case 2:
                    DepartmentQuery.incorporateDepartment();
                    Utilities.waitEnter();
                    break;
                case 3:
                    MainMenu.menu();
                    return;
                case 0:
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid Option");
                    Utilities.waitEnter();
                    continue;
            }
            Utilities.cleanScreen();

        } while (election != 0);

    }
}
