package Util;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Pere Prior
 */

public class Utilities {

    /**
     * autor: Pere Prior
     * Request a number on the screen and save it in a variable
     * @param message in screen
     * @return number have read
     */
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

    /**
     * Generates the lines that make up the menu
     * @param character what forms the line
     * @return the line
     */
    public static String generateLines(String character) {
        String line = "";
        for (int i = 0; i < 166; i++) {
            line = line.concat(character);
        }
        return line;
    }

    /**
     * autor: Pere Prior
     * Request a text on the screen and save it in a variable
     * @param message in screen
     * @return text have read
     */
    public static String readLine(String message) throws InputMismatchException {
        inputValue = new Scanner(System.in);
        System.out.println(message);
        return inputValue.nextLine();
    }

    /**
     * autor: Pere Prior
     * remove the old code from the terminal
     */
    public static void cleanScreen() {
        for (int x = 0; x < 50; x++) {
            System.out.println(" ");
        }
    }

    /**
     * autor: Pere Prior
     * It serves as a transition, so that the user continues with the program when he presses enter
     */
    public static void waitEnter() {
        readLine("\nPress ENTER to continue...");
    }


    /**
     * author: Óscar Fernández.
     * A function to convert a String array to an ArrayList of Strings.
     * @param array An string array
     * @return finalArrayList
     */
    public static ArrayList<String> arrayToArrayList(String[] array){
        ArrayList<String> finalArrayList = new ArrayList<>();
        for (String field : array ) {
            finalArrayList.add(field);
        }

        return finalArrayList;
    }

    /**
     * author: Óscar Fernández.
     */
    public static int getIndexInArray(String[] array, String value){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)){
                return i;
            }
        }
        return -1;
    }

    /**
     * author: Óscar Fernández.
     */
	public static String arrayListToString(ArrayList<String> line, String separator) {
        String str = "";
        for (String field : line) {
            str = str.concat(field + separator);
        }
        str = str.substring(0, str.length() - 1);
        return str;
	}

    public static Scanner inputValue;
}
