/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andru_bernal_menu;
import java.util.Scanner;
/**
 *
 * @author andru
 */
public class Andru_Bernal_Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int op=1, num=0, cont=0, sumaI=0,suma=0;
        String salida=" ";
        String sumaS,a;
        int numPalabras,conta,lon=0;
        String palabras,reves="",palindromo="",noPalindromo="";
        Scanner leer= new Scanner(System.in);
        leer.useDelimiter("\n");
       while(op!=4){ 
        System.out.println("Eliga una de las opciones \n");
        System.out.println("1: PIRAMIDE DE PALABRA");
        System.out.println("2: Piramide");
        System.out.println("3: Palindromo");
        System.out.println("4: Salir del sistema");
        op = leer.nextInt();
        cont=0;
        
        if(op==1){
            String palabra;
     char caracter;
        System.out.println("Ingrese una palabra");
        palabra = leer.next();
     for(int i=0 ; i<palabra.length();i++){
         for(int j=0; j<=i;j++){
             System.out.print(" ");
         }
         caracter=palabra.charAt(i);
         System.out.print(caracter+"\n");
         
        
     }
     
     
     for(int k=palabra.length()-1; k>=0;k--){
      for(int j=0; j<k;j++){
             System.out.print(" ");
         }
         caracter=palabra.charAt(k);
         System.out.println(caracter);
     }
            
        }
        
        
        
        
        
        
        
        
        
        if(op==3){
           
        
        System.out.println("Ingrresar la cantidad de palabras");
        numPalabras=leer.nextInt();
        for(int i=1 ; i<=numPalabras;i++){
            System.out.println("Ingrese la palabra #"+(i));
            palabras=leer.next();
            lon=palabras.length();
            for(int j=0;j<=lon;j--){
                conta=palabras.length();
              reves=reves+palabras.charAt(cont);
              conta--;
              
           if(palabras.equalsIgnoreCase(reves)){
               palindromo=palindromo+palabras+"\n";
           }
           else{
               noPalindromo=noPalindromo+palabras+"\n";
           }
            }
         }
        System.out.println("Palindromo");
        System.out.println(palindromo);
        }
        
        
        
        
        
        if(op==2){
           System.out.println("Opcion 3: Piramide\n");  
           
            System.out.println("Que numero de filas desea en la piramide");
            
        while(cont==0){
            num=leer.nextInt();
            if(num>0){
            cont++;
            for(int i=1 ; i<=num ;i++){
                for(int o=1;o<i;o++){
                    System.out.print("  ");
                }
                  for(int n=i;n<=num;n++){
                      System.out.print(n+" ");
                  }
                   for(int nu=num-1;nu>=i;nu--){
                       System.out.print(nu+" ");
                   }
                 System.out.println();
            }
            
        }
            else{
                System.out.println("Ingrese numero positivos");
            }
        }
       }
        if(op<0 || op>4){
            System.out.println("Opcion no valida, favor de usar una de las opciones");
        } 
       }
        System.out.println("Salio del sistema");
        // TODO code application logic here
    }
    
}
