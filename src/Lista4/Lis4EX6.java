/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;

import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class Lis4EX6 {

    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);

        System.out.print("Informe a dimensão da Mtriz: ");

        int n = cs.nextInt();
        int[][] vet = new int[n][n];
        int soma = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                vet[i][j] = (int) (Math.random() * 100);
                System.out.print(vet[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) >= n) {
                    soma += vet[i][j];
                }
            }
        }
        System.out.println("\nSoma dos elementos abaixo da diagonal segundaria: " + soma);
    }
}
