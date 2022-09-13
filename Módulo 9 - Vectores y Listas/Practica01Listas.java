package clase.listas;

import java.util.ArrayList;

public class Practica01Listas {

    public static void main(String[] args) {
        ArrayList<String> ejemplo = new ArrayList<>();
    
        ejemplo.add("Hola");//0
        //1 ---nuevo elemento
        ejemplo.add("como");//2
        ejemplo.add("estas");
        ejemplo.add("elimina");
        
        ejemplo.add(1, "amigo");//agregar en una posicion
        
        ejemplo.set(0, "hi");//reemplazar
        
        //ejemplo.remove("elimina");
        ejemplo.remove(3);
        
        //ejemplo.clear();
        
        for(int i=0; i<ejemplo.size(); i++){
            System.out.println(ejemplo.get(i));
        }
        
    }
}
