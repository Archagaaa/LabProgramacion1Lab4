/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labprogramacion1semana4;
import java.util.Scanner;
/**
 *
 * @author Jona Ramos
 */
public class ramos_jonatan__filtrar {
    public static void main(String[]args){
   
       Scanner lea=new Scanner(System.in);
       lea.useDelimiter("\n");
       
       System.out.print("\ningrese una frase completa:");
       String frase=lea.next();
       
       System.out.print("\ningrese una longitug minima para las palabras:");
       int lonMin=lea.nextInt();
       
       int contar=0;
       String palabra="";
       
       System.out.println("Palabras con longitud mayor a "+lonMin+":");
       
       while(contar<frase.length()){
           char letra=frase.charAt(contar);
           
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
       
       
       
       } 
}
      