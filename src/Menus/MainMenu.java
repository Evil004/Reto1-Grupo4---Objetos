package Menus;
import FileAccess.CSV.CSVWritters.DepartmentWritter;
import FileAccess.CSV.CSVWritters.EmployeeWritter;
import FileAccess.CSV.CSVWritters.ExtraHoursWritter;
import FileAccess.CSV.CSVWritters.QuoteGroupWritter;
import Settings.Settings;
import Util.Utilities;

import java.io.File;

public class MainMenu {
    public static int election;
    public static String lineInf = Utilities.generateLines("¯");
    public static String lineSup = Utilities.generateLines("_");

    public static void menu() {
        boolean flag = true;

        do {
            Utilities.cleanScreen();

            System.out.println();
            election = Utilities.readNumber(String.format(lineSup + "\n| %-30s | %-30s | %-30s | %-30s | %-30s |\n" + lineInf, "1.Consultar ", "2.Incorporar", "3.Modificar/Eliminar", "4. Exportar a CSV", "0.Salir"));

            switch (election) {
                case 1:
                    //MenuConsult;
                    break;
                case 2:
                    //MenuAdd;

                    break;
                case 3:
                    //MenuModifie;

                    break;
                case 4:
                    writeToCSV();
                    Utilities.waitEnter();
                    break;
                case 0:
                    flag = false;
                    break;

                default:
                    System.out.println("Opcion inválida");
                    continue;
            }
            Utilities.cleanScreen();

        } while (flag);
        System.out.println("Cerrando el programa...");
    }

    private static void writeToCSV(){
        File csvFolder = new File(Settings.csvFolder);
        for (File file: csvFolder.listFiles()) {
            if (file.getName().equals(Settings.csvEmployees)) {
                EmployeeWritter employeeWritter = new EmployeeWritter(file);
                employeeWritter.writeData();
            }
            if (file.getName().equals(Settings.csvDepartments)) {
                DepartmentWritter departmentWritter = new DepartmentWritter(file);
                departmentWritter.writeData();

            }
            if(file.getName().equals(Settings.csvExtraHours)){
                ExtraHoursWritter extraHoursWritter = new ExtraHoursWritter(file);
                extraHoursWritter.writeData();
            }
            if (file.getName().equals(Settings.csvQuoteGroups)) {
                QuoteGroupWritter quoteGroupWritter = new QuoteGroupWritter(file);
                quoteGroupWritter.writeData();
            }

        }
    }
}
