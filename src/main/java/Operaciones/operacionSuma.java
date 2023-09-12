package Operaciones;

import arrayBasico.Array;

import java.util.Arrays;

import static arrayBasico.Array.*;

public class operacionSuma {

    public void sumaArrayInt() {
        int total = 0;
        for (int i = 0; i < tamañoArregloInt.length; i++) {
            total += tamañoArregloInt[i];

        }
        System.out.println("La sumatoria del arreglo con enteros es: " + total);
    }

    public void sumaArrayDouble() {
        double totalD = 0.0;
        for (int i = 0; i < tamañoArregloDouble.length; i++) {
            totalD += tamañoArregloDouble[i];
        }
        System.out.println("La sumatoria del arreglo con valores en double es: " + totalD);
    }

    public void sumaArrayChar() {
        Integer totalC = 0;
        for (int i = 0; i < tamañoArregloChar.length; i++) {
            //totalC +=Integer.parseInt(Character.toString(tamañoArregloChar[i]));
            totalC +=tamañoArregloChar[i];
        }
        System.out.println("La sumatoria del arreglo con valores en double es: " + totalC);
    }

}

