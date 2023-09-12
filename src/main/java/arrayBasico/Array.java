package arrayBasico;

import java.util.Arrays;

public class Array {
    public static int [] tamañoArregloInt;
    public static double [] tamañoArregloDouble;
    public static char [] tamañoArregloChar;
    private int contador;
    public Array(int sizeArray) {
        this.contador = 0;
        this.tamañoArregloInt = new int[sizeArray];
        this.tamañoArregloDouble = new double[sizeArray];
        this.tamañoArregloChar = new char[sizeArray];
    }
    public void setTamañoArregloInt(int tamaño) {
        if (contador < tamañoArregloInt.length) {
            tamañoArregloInt[contador] = tamaño;
            contador++;
        }
    }
    public int[] getTamañoArregloInt() {
        return tamañoArregloInt;
    }

    public void setTamañoArregloDouble(double tamaño) {
        if (contador < tamañoArregloDouble.length) {
            tamañoArregloDouble[contador] = tamaño;
            contador++;
        }
    }
    public double[] getTamañoArregloDouble() {
        return tamañoArregloDouble;
    }

    public void setTamañoArregloChar(char tamaño) {
        if (contador < tamañoArregloChar.length) {
            tamañoArregloChar[contador] = tamaño;
            contador++;
        }
    }
    public char[] getTamañoArregloChar() {
        return tamañoArregloChar;
    }




}