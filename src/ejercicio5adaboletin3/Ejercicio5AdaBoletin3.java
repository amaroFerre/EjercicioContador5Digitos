/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5adaboletin3;

/**
 *
 * @author Amarico
 */
public class Ejercicio5AdaBoletin3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Necesitamos mostrar un contador con 5 dígitos (X-X-X-X-X), 
        //que muestre los números del 0-0-0-0-0  al 9-9-9-9-9,
        // con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
        
       // Creo un bucle for con los cinco digitos
       
        for (int i = 0; i <=9; i++) {
            
            for (int j = 0; j <= 9; j++) {
                
                for (int k = 0; k <= 9; k++) {
                    
                    for (int l = 0; l <= 9; l++) {
                        
                        for (int m = 0; m <=9; m++) {
                            
                            // Si la variable es i, j, k, l, m es un 3 
                            // le decimos que imprima un E
                            
                            if (i == 3){
                                
                                System.out.print("E");
                                
                            }else
                                
                                System.out.print(i);
                            if (j == 3){
                                
                                System.out.print("E");
                                
                             }else 
                                
                                System.out.print(j);
                            
                            if (k == 3){
                                
                                System.out.print("E");
                                                               
                                                                
                            }else
                                
                                System.out.print(k);
                            
                            if (l == 3){
                                
                                System.out.print("E");
                                                               
                                                                
                            }else
                                
                                System.out.print(l);
                            if (m == 3){
                                
                                System.out.print("E");
                                                               
                                                                
                            }else
                                
                                System.out.print(m);
                            
                            
                            
                            System.out.println(i +"-"+ j + "-" + k + "-" + l + "-" + m);
                            
                        }
                        
                    }
                    
                }
                
            }
            
        }
    }
    
}
