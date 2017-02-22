/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author test1
 */
public class testclass {
    @Test
    
    int first[][] = {{1,2},{3,4}};
        int second[][] = {{1,0},{0,1}};
    
        Matrix IMultiply = new Matrix(2,2,2,2,first,second);
        
        int sum[][] = IMultiply.iterativeMult();
        
        if(sum == NULL)
        {
            system.print.out("ERROR a NULL Matrix")
        }
}
