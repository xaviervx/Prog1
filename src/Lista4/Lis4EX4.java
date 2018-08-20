/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;

/**
 *
 * @author Xavier
 */
public class Lis4EX4 {
    public static void main(String[] args) {
        
        int[][] mat = new int[2][2];
        int[][] ma  = new int[2][2];
        int[][] m   = new int[2][2];
        
        System.out.println("Matriz 1:\t");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                mat[i][j] = (int) (Math.random()*10);
                System.out.print(mat[i][j] +"\t");
            }
            System.out.println("");
        }
        
        System.out.println("\nMatriz 2:\t");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ma[i][j] = (int) (Math.random()*10);
                System.out.print(ma[i][j] +"\t");
            }
            System.out.println("");
        }
        
        System.out.println("\nSoma das matrizes:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print((m[i][j] = mat[i][j]+ma[i][j]) +"\t");
            }
            System.out.println("");
        }
    }
}
