package Clase1Ej3;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
public class Main {

    /** ESTRUCTURAS DE CONTROL EN JAVA */

    public static void main(String[] args) {
        /* Sentencia If - Else */
        int nro1 = 40;
        int nro2 = 20;
        int nro3 = 50;
        int menor;

        if (nro1 < nro2) {
            if (nro1 < nro3) {
                menor = nro1;
            } else {
                menor = nro3;
            }
        } else if (nro2 < nro3) {
            menor = nro2;
        } else {
            menor = nro3;
        }

        System.out.println("Menor = " + menor);

        /* Sentencia Switch */
        int mes = 3;
        switch (mes) {
            case 1:
                System.out.println("Enero");
                break;
            case 2:
                System.out.println("Febrero");
                break;
            case 3:
                System.out.println("Marzo");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Mayo");
                break;
            case 6:
                System.out.println("Junio");
                break;
            case 7:
                System.out.println("Julio");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Septiembre");
                break;
            case 10:
                System.out.println("Octubre");
                break;
            case 11:
                System.out.println("Noviembre");
                break;
            case 12:
                System.out.println("Diciembre");
                break;
            default:
                System.out.println("Este mes no existe");
                break;
        }

        /* Sentencia For */
        int i; // variable contador para el bucle
        System.out.println("I N C R E M E N T O");
        for (i = 0; i < 10; i++) {
            System.out.print(" " + (i + 1));
        }

        System.out.println("\nD E C R E M E N T O");
        for (i = 10; i > 0; i--) {
            System.out.print(" " + i);
        }

        System.out.println("\nS O L O   P A R E S");
        for (i = 10; i <= 20; i += 2) {
            System.out.print(" " + i);
        }

        /* Sentencia While */
        int n = 1;
        int j = 1;

        System.out.println("");
        while (n <= 3) // mientras n sea menor o igual que 3
        {
            System.out.print("Para i = " + n + " ");
            while (j <= 4) // mientras j sea menor o igual que 4
            {
                System.out.print("j = " + j + " ");
                j++; // aumentar j en una unidad
            }
            System.out.println(""); // avanzar a una nueva línea
            n++; // aumentar n en una unidad
            j = 1; // inicializar j de nuevo a 1
        }
    }
}
