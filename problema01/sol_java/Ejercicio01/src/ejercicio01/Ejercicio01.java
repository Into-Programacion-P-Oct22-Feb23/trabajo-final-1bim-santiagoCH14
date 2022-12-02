/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio01;

import java.util.Scanner;
/**
 *
 * @author DETPC
 */
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        double angulo;
        String acumulador = "";
        int contador = 0;
        
        while (contador < 3 ) {
            System.out.println("Ingrese el tamaño del angulo");
            angulo = entrada.nextDouble();
            
            contador = contador + 1;
            
            if (angulo == 90){
               acumulador = acumulador + "El angulo tiene un tamaño de " 
                       + angulo  + " por lo tanto es recto" + "\n";
               }else {
                if (angulo > 90 && angulo < 180 ){ 
                acumulador = acumulador + "El angulo tiene un tamaño de " 
                       + angulo  + " por lo tanto es obtusangulo" + "\n";  
                    }else { 
                       if (angulo < 90 ){ 
                        acumulador = acumulador + "El angulo tiene un tamaño de " 
                        + angulo  + " por lo tanto es acutangulo" + "\n";                     
        }   
        }
    }
    }
        System.out.println();
        System.out.printf("Respuesta:\n%s", acumulador);
}
}
    
    

