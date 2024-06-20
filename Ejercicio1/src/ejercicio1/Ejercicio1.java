/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Daniel
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int cantidadEmpleados;
        double salarioEmpleados = 0;
        double totalSalarios=0;
        double totalPagar;
        Scanner sc =new Scanner(System.in);
        
        /**
        Se solicita el numero de empleados
        */
        System.out.println("Ingrese el numero de empleados");
        cantidadEmpleados=sc.nextInt();
        int i;
         
        /**
        Se solicita el salario de cada empleado
        */
        for(i=1;i<=cantidadEmpleados;i++){
            System.out.println("Ingrese el salario de los empleados"); 
            salarioEmpleados=sc.nextDouble();    
            totalSalarios= totalSalarios+salarioEmpleados;
        }
        
        double montoSEM = 0.0925;
        double montoIVM = 0.0508;
        
        /**
        El monto a pagar es la suma del monto de SEM y el IVM
        */
        
        totalPagar=totalSalarios*0.1433;
        
        System.out.println("El total de los salarios es " +totalPagar);
                
            
    }   
    
}
