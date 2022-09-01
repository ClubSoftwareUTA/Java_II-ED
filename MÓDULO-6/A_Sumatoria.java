package cicloWhile;

import java.util.Scanner;

public class A_Sumatoria {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cantidadNumeros, suma, i, numero;

        System.out.print("Ingrese la cantidad de números a sumar: ");
        cantidadNumeros = entrada.nextInt();
        suma = 0;
        i = 1;
        while (i <= cantidadNumeros) {
            System.out.print("Ingresar número #" + i + ": ");
            numero = entrada.nextInt();
            suma += numero;
            i++;
        }

        System.out.println("Total: " + suma);
    }
}
