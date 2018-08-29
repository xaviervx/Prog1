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
        int[] b = new int[6];
        int[] c = new int[6];

        System.out.println("Matriz\t\t\t\t\t\tVetor A: Soma das linhas\t");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print((matriz[i][j] = (int) (Math.random() * 11)) + "\t");
                b[i] += matriz[i][j];
                if (j == 5) {
                    System.out.print("-->   " + b[i]);
                }
            }
            System.out.println("");
        }
        System.out.println("\n|\t|\t|\t|\t|\t|\t");
        System.out.println("v\tv\tv\tv\tv\tv\t\n");
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                c[i] += matriz[j][i];
            }
            System.out.print((c[i]) + "\t");
        }
        System.out.println("\nVetor b. : Soma das colunas\t");
    }
}
