package Menus;
import Util.Utilities;

public class MenuConsult {
    public static int election;
    public static String lineInf = Utilities.generateLines("¯");
    public static String lineSup = Utilities.generateLines("_");
    public static void Consult() {
        boolean flag = true;

        do {
            Utilities.cleanScreen();

            election = Utilities.readNumber(String.format(lineSup + "\n| %-30s | %-30s | %-30s | %-30s | %-30s |\n" + lineInf, "1.Employees and Departments", "2.Extra Hours", "3.Salary Cost", "4.Go back to Main Menu", "0.Exit"));

            switch (election) {
                case 1:
                    SubmenuRelatedToEmployee.RelatedToEmployee();
                    break;
                case 2:
                    SubmenuExtraHours.extrahours();
                    break;
                case 3:
                    SubmenuSalaryCost.SalaryCost();
                    break;
                case 4:
                    MainMenu.menu();
                    return;

                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion invalida");

            }
            Utilities.cleanScreen();

        } while (election != 0);
    }
}
