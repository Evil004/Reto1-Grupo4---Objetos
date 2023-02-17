import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @author Pere Prior
 */

public class Utilidades {

    public static boolean comprobarConsola() {
        while (true) {
            System.out.println("Para que este programa se vea correctamente, necesitas una consola con 166 columnas o mas.\n"
                    + "Si ves la linea de abajo con cortes o saltos de linea, es que tu consola no tiene 166 columnas o mas. Por favor redimensiona la consola.\n"
                    + lineaSup);
            String eleccion = leerCadena("Ves bien la linea de arriba? (si/no)");
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

    private static boolean deberiaCerrarse() {
        boolean cerrar = true;
        if (!guardado) {
            cerrar = isCerrar();
        }
        return cerrar;
    }

    private static boolean isCerrar() {
        //boolean flag = true;
        while (true) {
            String eleccion = leerCadena("Vas a cerrar el programa, pero tienes datos sin guardar, estas seguro? (si/no)");
            if("si".equals(eleccion)){
                return true;
            }else if("no".equals(eleccion)){
                return false;
            }else{
                System.out.println("No has introducido una opcion valida.");
            }
        }
    }

    public static int leerEntero(String mensaje) throws InputMismatchException {
        int numero;
        while (true) {
            try {
                inputValue = new Scanner(System.in);
                System.out.println(mensaje);
                numero = inputValue.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("No es un numero valido");
            }

        }
        return numero;

    }

    public static String generateLines(String caracter) {
        String linea = "";
        for (int i = 0; i < 166; i++) {
            linea = linea.concat(caracter);
        }
        return linea;
    }

    public static String leerCadena(String mensaje) throws InputMismatchException {
        inputValue = new Scanner(System.in);
        System.out.println(mensaje);
        return inputValue.nextLine();
    }

    public static void limpiarPantalla() {
        for (int x = 0; x < 50; x++) {
            System.out.println(" ");
        }
    }

    public static void esperarEnter() {
        leerCadena("\nApreta Entrer para continuar...");
    }

    public static Scanner inputValue;

}
