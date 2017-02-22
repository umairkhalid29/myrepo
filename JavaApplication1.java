/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author test1
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int first[][] = {{1,2},{3,4}};
        int second[][] = {{1,0},{0,1}};
    
        Matrix IMultiply = new Matrix(2,2,2,2,first,second);
        
        int sum[][] = IMultiply.iterativeMult();
        
        System.out.println("Product of entered matrices:-");
        int c, d;
         for ( c = 0 ; c < 2 ; c++ )
         {
            for ( d = 0 ; d < 2 ; d++ )
               System.out.print(sum[c][d]+"\t");
 
            System.out.print("\n");
         }
    }
    
}
