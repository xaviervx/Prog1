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
public class Lis4EX1 {

    public static void main(String[] args) {

        int[] ve = new int[5];
        int[] v = new int[5];
        int[][] matriz = new int[5][2];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                ve[i] = (int) (Math.random() * 100);
                matriz[i][j] = ve[i];
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                v[i] = (int) (Math.random() * 100);
                matriz[i][j] = v[i];
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] +"\t");
            }
            System.out.println("");
        }
    }
}
