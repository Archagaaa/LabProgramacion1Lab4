//Trabajo grupal con Jona 
package labprogramacion1semana4;

import java.util.Scanner;

public class Archaga_Aaron_Cifrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");
        
        //Variables
        String frase = "", frasecifrada = "";
        char caracter, nuevocaracter;
        int desplazar, nuevaposicion;
        
        System.out.println("==== CIFRADO ==== ");
        System.out.println("Ingrese la frase: ");
        frase = entrada.next();
        System.out.println("Ingrese el numero de posiciones que se quiere desplazar: ");
        desplazar = entrada.nextInt();
        
        for (int i = 0; i < frase.length(); i++) {
            caracter = frase.charAt(i); //Obtiene el caracter actual de la frase
            
            if (caracter >= 'a' && caracter <= 'z') { //revisa para las palabras minusculas
                nuevaposicion = ((caracter - 'a') + desplazar) % 27; //encuentra la nueva posicion
                nuevocaracter = (char) ('a' + nuevaposicion); //convierte la nueva posicion en el caracter que le toca
                frasecifrada += nuevocaracter; //agrega el nuevo caracter a la frase nueva
            }
            //Lo mismo pero ahora con las mayusculas
            else if (caracter >= 'A' && caracter <= 'Z') { //revisa para las palabras mayusculas
                nuevaposicion = ((caracter - 'A') + desplazar) % 27;
                nuevocaracter = (char) ('A' + nuevaposicion);
                frasecifrada += nuevocaracter;
            }
            //Si no es un caracter no hace ningun cambio al caracter de esa posicion
            else{
                frasecifrada += caracter;
            }
        }
        
        //Salidas
        System.out.println("Texto original: "+frase);
        System.out.println("Texto cifrado: "+frasecifrada);
    }
    
}
