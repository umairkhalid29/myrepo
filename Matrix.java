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
public class Matrix {
    int m, n, p, q;
    int c, d, k;
    
    int first[][];
    int second[][];
    int resultant[][];
    
    Matrix(int row1, int col1, int row2, int col2, int f[][], int s[][]){
        this.m = row1;
        this.n = col1;
        this.p = row2;
        this.q = col2;
        
        first = new int [row1][col1];
        second = new int [row2][col2];
        resultant = new int[row1][col2];
        
        first = f;
        second = s;
    }
        public int[][] iterativeMult(){
            
        int sum = 0;
            for ( c = 0 ; c < m ; c++ )
         {
            for ( d = 0 ; d < q ; d++ )
            {   
               for ( k = 0 ; k < p ; k++ )
               {
                  
                  sum = sum + first[c][k]*second[k][d];
                  
               }
 
               resultant[c][d] = sum;
               sum = 0;
            }
         }
            return resultant;
        } 
}
