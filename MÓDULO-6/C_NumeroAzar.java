package cicloWhile;

public class C_NumeroAzar {

    public static void main(String[] args) {

        //Para generar el número al azar: 
        System.out.println(Math.round(Math.random() * 10));

        //*******
        //Chicos otra forma de interrumpir un ciclo en vez de utilizar el i = 6 pueden colocar: break;
        //Como el siguiente ejemplo:
        int i = 1;
        while (i <= 5) {
            if (i == 2) {
                System.out.println(i);
                break; //lo que hago aquí es que si ya el i llega a valer 2, entonces rompo el ciclo y sale de este
            }
            i++;
        }
    }
}
