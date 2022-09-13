/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase.listas;

//Realizar un programa que permita gestionar un refugio de animales, 
import java.util.ArrayList;
import java.util.Scanner;

//mediante el uso de listas se debe tener un registro de las mascotas,
//además se debe poder ver dicha lista y permitir el tanto el ingreso 
//como la salida de mascotas.
public class Practica02Listas {

    public static void main(String[] args) {
        ArrayList<String> mascotas = new ArrayList<>();
        ArrayList<String> adoptadas = new ArrayList<>();
        ArrayList<String> dueños = new ArrayList<>();
        
        int op;
        String nombre;

        Scanner tecla = new Scanner(System.in);
        
        mascotas.add("Pepe");
        mascotas.add("Lucas");
        mascotas.add("Misi");
        mascotas.add("Jorge");

        do {
            System.out.println("1. Ver lista de Mascotasdel Refugio");
            System.out.println("2. Ver lista de Mascotas Adoptadas");
            System.out.println("3. Ingresar nueva mascota");
            System.out.println("4. Registrar Salida");
            System.out.println("5. Salir");

            System.out.print("Opcion: ");
            op = tecla.nextInt();

            switch (op) {
                case 1:
                    //ciclo ver los elemento de la lista -- get()
                    System.out.println("Lista de Mascotas");
                    for (int i = 0; i < mascotas.size(); i++) {
                        System.out.println((i + 1) + ".- " + mascotas.get(i));
                    }
                    break;
                case 2:
                    System.out.println("Lista de Mascotas Adoptadas");
                    for (int i = 0; i < adoptadas.size(); i++) {
                        System.out.println((i + 1) + ".- " + adoptadas.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Ingrese nombre de la mascota: ");
                    nombre = tecla.next();
                    mascotas.add(nombre);
                    System.out.println("--registro exitoso--");
                    break;
                case 4:
                    System.out.println("Nombre de la  mascota adoptada: ");
                    nombre = tecla.next();
                    mascotas.remove(nombre);
                    adoptadas.add(nombre);
                    break;
            }
            System.out.println("");
        } while (op != 5);
    }
}
