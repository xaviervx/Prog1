/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class Lis5EX4 {

    public static void main(String[] args) throws IOException {
        Scanner cs = new Scanner(System.in);
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));

        int[][] inteiros = new int[10][10];

        int linhas = 0;
        int colunas = 0;
        int encontrarValor = (int) (Math.random() * 100) + 1;
        boolean encontrou = false;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print((inteiros[i][j] = ((int) (Math.random() * 100) + 1)) + "\t");
                if (inteiros[i][j] == encontrarValor) {
                    linhas = i;
                    colunas = j;
                    encontrou = true;
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Valor a ser encontrado: " + encontrarValor);

        if (encontrou) {
            System.out.println("Número " + encontrarValor + " esta..");
            System.out.println("Linha:\t " + linhas);
            System.out.println("Coluna:\t" + colunas);
        } else {
            System.out.println("Valor não encontrado!!");
        }
    }
}