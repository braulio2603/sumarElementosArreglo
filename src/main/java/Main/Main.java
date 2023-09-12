package Main;

import Operaciones.operacionSuma;
import arrayBasico.Array;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("SUMAR VALORES ENTEROS");
        System.out.println("Ingresa el tamaño del arreglo: ");
        Array array = new Array(scanner.nextInt());
        capturarTamañoArregloInt(new Scanner(System.in), array);
        operacionSuma sumaInt = new operacionSuma();
        sumaInt.sumaArrayInt();

        System.out.println("SUMAR VALORES DOUBLE");
        System.out.println("Ingresa el tamaño del arreglo: ");
        Array array2 = new Array(scanner.nextInt());
        capturarTamañoArregloDouble(new Scanner(System.in), array2);
        operacionSuma sumaDouble = new operacionSuma();
        sumaDouble.sumaArrayDouble();

        System.out.println("SUMAR CARACTERES");
        System.out.println("Ingresa el tamaño del arreglo: ");
        Array array3 = new Array(scanner.nextInt());
        capturarTamañoArregloChar(new Scanner(System.in), array3);
        operacionSuma sumaChar = new operacionSuma();
        sumaChar.sumaArrayChar();

    }
        public static void capturarTamañoArregloInt (Scanner scanner, Array array) {
        try {
        int contador = 0;
        while (contador < array.getTamañoArregloInt().length) {
            System.out.println("REGISTRA UN NUMERO ENTERO");
            array.setTamañoArregloInt(scanner.nextInt());
            contador++;
        }
    }catch(Exception e){
 System.out.println("Error en la captura");

    }
    }
    public static void capturarTamañoArregloDouble (Scanner scanner, Array array2) {

                int contador = 0;
        try {
                while (contador < array2.getTamañoArregloDouble().length) {
                    System.out.println("REGISTRA UN NUMERO DOUBLE");
                    array2.setTamañoArregloDouble(scanner.nextDouble());
                    contador++;
                }
            }catch(Exception e){
            System.out.println("Error en la captura");
        }
    }

    public static void capturarTamañoArregloChar (Scanner scanner, Array array3) {

        int contador = 0;
        try {
            while (contador < array3.getTamañoArregloChar().length) {
                System.out.println("REGISTRA UN VALOR DE TIPO CARACTER");
                array3.setTamañoArregloChar(scanner.next().charAt(0));
                contador++;
            }
        }catch(Exception e){
            System.out.println("Error en la captura");
        }
    }
    }









