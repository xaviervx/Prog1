/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista6;

/**
 *
 * @author Xavier
 */
public class Lis6EX2 {

    public static void main(String[] args) {
        int[][] matriz1 = new int[10][10];
        int[][] matriz2 = new int[10][10];

        // Atribui valores as duas matrizes e imprime uma
        System.out.println("Matriz 1:" + "\t\t\t\t" + "Matriz 2:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz1[i][j] = (int) (Math.random() * 10);
                matriz2[i][j] = (int) (Math.random() * 10);
                System.out.print(matriz1[i][j] + "  ");
            }
            System.out.print("          ");
            for (int k = 0; k < 10; k++) {
                System.out.print(matriz2[i][k] + "  ");
            }
            System.out.println("");
        }

        System.out.println("");
        System.out.println("Matriz 1:" + "\t\t\t\t" + "Matriz 2:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (i == j) {
                    System.out.print(matriz2[9 - j][i] + "  ");
                } else {
                    System.out.print(matriz1[i][j] + "  ");
                }
            }
            System.out.print("          ");
            for (int k = 0; k < 10; k++) {
                if (i + k == 9) {
                    System.out.print(matriz1[i][i] +"  ");
                }else
                System.out.print(matriz2[i][k] + "  ");
            }
            System.out.println("");
        }
    }
}
