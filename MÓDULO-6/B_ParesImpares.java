package cicloWhile;

import java.util.Scanner;

public class B_ParesImpares {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int inicio, fin, cantidadPares, cantidadImpares;
        System.out.print("Ingrese el número inicial del rango: ");
        inicio = entrada.nextInt();
        System.out.print("Ingrese el número final del rango: ");
        fin = entrada.nextInt();
        cantidadPares = 0;
        cantidadImpares = 0;

        while (inicio <= fin) {
            if (inicio != 0) {
                if (inicio % 2 == 0) {
                    cantidadPares++;
                } else {
                    cantidadImpares++;
                }
            }
            inicio++;
        }

        System.out.println("Pares: " + cantidadPares);
        System.out.println("Impares: " + cantidadImpares);
    }
}
