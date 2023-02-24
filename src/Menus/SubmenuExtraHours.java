package Menus;
import Data.ExtraHours.ExtraHourQuery;
import Data.ExtraHours.ExtraHours;
import Util.Utilities;


public class SubmenuExtraHours {
    public static int election;
    public static String lineInf = Utilities.generateLines("¯");
    public static String lineSup = Utilities.generateLines("_");
    public static void extrahours() {
        boolean flag = true;

        do {
            Utilities.cleanScreen();

            election = Utilities.readNumber(String.format(lineSup + "\n| %-30s | %-30s | %-30s | %-30s | %-30s |\n" + lineInf, "1.Extra hours by ID", "2.Extra hours by DNI", "3.Go to last menu", "0.Exit",""));

            switch (election) {
                case 1:
                    ExtraHourQuery.extraHourIDQuery();
                    Utilities.waitEnter();
                    break;
                case 2:
                    String dni = Utilities.readLine("Introduce the employees DNI: ");
                    ExtraHourQuery.extraHourNIFQuery(dni);
                    Utilities.waitEnter();
                    break;
                case 3:
                    MenuConsult.Consult();
                    return;

                case 0:
                    flag = false;
                    break;
                default:
                    System.out.println("Opcion invalida");
                    Utilities.waitEnter();
            }
            Utilities.cleanScreen();

        } while (election != 0);
    }

}
