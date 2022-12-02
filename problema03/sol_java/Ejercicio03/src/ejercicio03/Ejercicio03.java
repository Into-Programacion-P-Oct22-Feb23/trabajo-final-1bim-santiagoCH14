/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio03;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author DETPC
 */
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String nombre_empleado;
        int horas_trabajadas;
        int tipo_empleado;
        double cuota;
        double sueldo_pagar;

        System.out.println("Ingrese el nombre del empleado");
        nombre_empleado = entrada.nextLine();
        System.out.println("Ingrese el tipo de empleado");
        tipo_empleado = entrada.nextInt();
        System.out.println("Ingrese el número de horas trabajadas");
        horas_trabajadas = entrada.nextInt();
        
        
        
         switch (tipo_empleado) {
            case 1:
                sueldo_pagar = horas_trabajadas * 1.5;
                System.out.printf("El sueldo a pagar %.2f\n", sueldo_pagar);
                break;
            case 2:
                sueldo_pagar = horas_trabajadas * 2;
                System.out.printf("El sueldo a pagar %.2f\n", sueldo_pagar);
                break;
            case 3:
                
                sueldo_pagar = horas_trabajadas * 2.5;
                System.out.printf("El sueldo a pagar %.2f\n", sueldo_pagar);
                break;
                
            case 4: 
                sueldo_pagar = horas_trabajadas * 3;
                System.out.printf("El sueldo a pagar %.2f\n", sueldo_pagar);
                break;
                
         }       
    }
    
}

    
    
