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
public class Lis4EX3 {

    public static void main(String[] args) {
        
        int[][] matriz = new int[6][6];
        int[] b = new int [6];
        int[] c = new int [6];
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print((matriz[i][j] = (int) (Math.random() * 11)) + "\t");
            }
            System.out.println("");
        }
        System.out.println("\nVetor A:\t");
        for (int i = 0; i < 6; i++) {
            int soma = 0;
            for (int j = 0; j < 6; j++) {
                soma += matriz[i][j];
            }
            System.out.print((b[i] = soma) +"\t");
        }
        System.out.println("");
        System.out.println("\nVetor b. :\t");
        for (int i = 0; i < 6; i++) {
            int soma = 0;
            for (int j = 0; j < 6; j++) {
                soma += matriz[j][i];
            }
            System.out.print((c[i] = soma) +"\t");
        }
        System.out.println("");
    }
}
