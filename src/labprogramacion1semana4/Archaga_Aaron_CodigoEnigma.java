package labprogramacion1semana4;

import java.util.Scanner;

public class Archaga_Aaron_CodigoEnigma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useDelimiter("\n");

        int opcion, opcion2;

        do {
            System.out.println("==== MENU ====");
            System.out.println("""
                               1. Cifrado Cesar
                               2. Filtrar
                               3. Codigo Enigma
                               4. Salir
                                =============""");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            
            switch (opcion){
                case 1:
                    //Codigo de Aaron
                    System.out.println("==== CIFRADO CESAR ====");
                        String frase = "", frasecifrada = "";
                        char caracter, nuevocaracter;
                        int desplazar, nuevaposicion;

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
                    break;
                case 2:
                    //Codigo de Jonatan
                    System.out.println("==== FILTRACION ====");
                       System.out.print("\ningrese una frase completa:");
                       String frase2=entrada.next();

                       System.out.print("\ningrese una longitug minima para las palabras:");
                       int lonMin=entrada.nextInt();

                       int contar=0;
                       String palabra="";

                       System.out.println("Palabras con longitud mayor a "+lonMin+":");

                       while(contar<frase2.length()){
                           char letra=frase2.charAt(contar);

                         if(letra!=' '){
                         palabra+=letra;
                       }else{
                         if(palabra.length()>lonMin){
                         System.out.println("*" + palabra);
                                 }
                         palabra="";
                         }
                         contar++;
                       }
                    break;
                case 3:
                    System.out.println("==== CODIGO ENIGMA ====");
                    do{
                        System.out.println("==== SUBMENU ====");
                        System.out.println("""
                                             1. Encriptar
                                             2. Desencriptar
                                             3. Regresar
                                             =============""");
                        System.out.print("Ingrese la opcion:" );
                        opcion2 = entrada.nextInt();

                        switch (opcion2){
                            //Codigo por Aaron
                            case 1:
                                System.out.println("==== ENCRIPTAR ====");
                                System.out.println("Ingrese el texto");
                                String texto = entrada.next();
                                String pares = "", impares = "";
                                String resultado = "";

                                for (int i = 0; i < texto.length(); i++) {
                                    if(i % 2 == 0){
                                        impares += texto.charAt(i);
                                    }
                                    else{
                                        pares +=texto.charAt(i);
                                    }
                                }

                                for (int i = 0; i < texto.length(); i++) {
                                    if (i % 2 == 0){
                                        resultado = resultado + texto.charAt(i);
                                    }
                                    else {
                                        resultado = texto.charAt(i) + resultado;
                                    }
                                }

                                System.out.println("Texto original "+texto);
                                System.out.println("Posicion pares "+pares);
                                System.out.println("Posicion impares "+impares);
                                System.out.println("Resultado: "+resultado);
                                break;
                            case 2:
                                //Codigo Jonatan
                                System.out.println("==== DESENCRIPTAR ====");
                                System.out.println("Ingrese el texto encriptado:");
                                String txtEncDes = entrada.nextLine();
                                int lon = txtEncDes.length();
                                int mitad = lon / 2;
                                String parDes = txtEncDes.substring(0, mitad);
                                String imparDes = txtEncDes.substring(mitad);
                                String txtDes = "";

                                int maxLon = 0;
                                for (int i = 0; i < parDes.length() || i < imparDes.length(); i++) {
                                    maxLon = i + 1;
                                }

                                for (int i = 0; i < maxLon; i++) {
                                    if (i < parDes.length()) {
                                        txtDes += parDes.charAt(i);
                                    }
                                    if (i < imparDes.length()) {
                                        txtDes += imparDes.charAt(i);
                                    }
                                }
                                System.out.println("Texto encriptado: " + txtEncDes);
                                System.out.println("Texto desencriptado: " + txtDes);
                                break;
                            case 3:
                                System.out.println("Regresando al menu principal");
                                break;
                            default:
                                System.out.println("Opcion invalida en el submenu");
                        }
                    } while (opcion2 != 3);

                    break;
                case 4:
                    System.out.println("Ha salido");
                    
                    break;
                default:
                    System.out.println("Opcion Incorrecta en el menu");
            }
        } while (opcion != 4);   
    }
}