package Util;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Pere Prior
 */

public class Utilities {

    public static boolean checkConsole() {
        while (true) {
            System.out.println("Para que este programa se vea correctamente, necesitas una consola con 166 columnas o mas.\n"
                    + "Si ves la linea de abajo con cortes o saltos de linea, es que tu consola no tiene 166 columnas o mas. Por favor redimensiona la consola.\n"
                    + supLine);
            String eleccion = readLine("Ves bien la linea de arriba? (si/no)");
            switch (eleccion) {
                case "si":
                    return true;
                case "no":
                    System.out.println("Por favor redimensiona la consola.");
                    return false;
                default:
                    System.out.println("Por favor, introduce una opcion valida.");
            }
        }
    }

    public static int readNumber(String message) throws InputMismatchException {
        int number;
        while (true) {
            try {
                inputValue = new Scanner(System.in);
                System.out.println(message);
                number = inputValue.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Is not a valid number");
            }

        }
        return number;

    }

    public static String generateLines(String character) {
        String line = "";
        for (int i = 0; i < 166; i++) {
            line = line.concat(character);
        }
        return line;
    }

    public static String readLine(String message) throws InputMismatchException {
        inputValue = new Scanner(System.in);
        System.out.println(message);
        return inputValue.nextLine();
    }

    public static void cleanScreen() {
        for (int x = 0; x < 50; x++) {
            System.out.println(" ");
        }
    }

    public static int getIndex(ArrayList<ArrayList<String>> dataCSV, String column) {
        return dataCSV.get(0).indexOf(column);
    }

    public static void waitEnter() {
        readLine("\nPress ENTER to continue...");
    }

    public static Scanner inputValue;
    public static int choice;
    public static String lowLine = generateLines("¯");
    public static String supLine = generateLines("_");


    /**
     * author: Óscar Fernández.
     * A function to convert a String array to an ArrayList of Strings.
     * @param array An string array
     * @return
     */
    public static ArrayList<String> arrayToArrayList(String[] array){
        ArrayList<String> finalArrayList = new ArrayList<>();
        for (String field : array ) {
            finalArrayList.add(field);
        }

        return finalArrayList;
    }

    public static int getIndexInArray(String[] array, String value){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

}
