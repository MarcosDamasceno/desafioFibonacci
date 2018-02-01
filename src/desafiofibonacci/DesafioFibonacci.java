/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package desafiofibonacci;

/**
 *
 * @author meumd
 */
public class DesafioFibonacci {

    /**
     * @param args the command line arguments
     * Exercício DESAFIO apostila Caelum Fibonacci com apenas 2 variáveis
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1 = 0;
        int n2 = 1;
        
        System.out.print(n1 + ", ");
        
        for (int i = 0; i < 20; i++) {
            
            n2 = n1 + n2;
        //  1  = 0  + 1;
        //  2  = 1  + 1;
        //  3  = 1  + 2;
        //  5  = 2  + 5;
        //  8  = 3  + 5;
        
            n1 = n2 - n1;
        //  1  = 1  - 0;
        //  1  = 2  - 1;
        //  2  = 3  - 1;
        //  3  = 5  - 2;
        //  5  = 8  - 3;
        
            System.out.print(n1 + ", ");
        //                   1, 1, 2, 3, 5,
            
        }
        
        /*
        0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
        0
        0+0=1 n1+n2 = n3
        0+1=1 n2+n3 = n4
        1+1=2 n
        1+2=3 n1+n2=n2
        2+3=5 n1+n2=n2
        3+5=8 
        5+8=13
        8+13=21
        
        */
    }
    
}
