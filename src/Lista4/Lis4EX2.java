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
public class Lis4EX2 {

    public static void main(String[] args) {
        
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print((matriz[i][j] = (int) (Math.random() * 11)) + "\t");
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("Matriz somente com os números que \ncompõem a diagonal principal");
        System.out.println("");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                }else{
                    matriz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] +"\t");
            }
            System.out.println("");
        }
    }
}
