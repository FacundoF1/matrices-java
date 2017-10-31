/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estdatbidi_05;

import java.util.Scanner;

/**
 *
 * @author facundo
 */
public class Producto {
    
    
    public static void Operacion(){
    
        Scanner entrada = new Scanner(System.in);
        
        final int FILAS = 2, COLUMNAS = 2;
            
        int i,j,col1,col2, producto;
        
        int [][] A = new int [FILAS][COLUMNAS];
        
        
        System.out.println("===  Introducir los valores para llenar el array  ===");
        
        for(i=0; i< FILAS; i++){
            for(j=0; j< COLUMNAS; j++){
                
            System.out.println("A["+ i +"]["+ j +"]=");
            A [i][j] = entrada.nextInt();
            
            }
        }
        
        
        System.out.println("Los valores introducidos son: ");
        for(i=0; i< A.length; i++){
            for(j=0; j< A[i].length; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println(" ");
        }
            col1 = A[0][0] * A[0][1];
            col2 = A[1][0] * A[1][1];
        System.out.println(col1+" "+col2);
    
    
    }
    
}
