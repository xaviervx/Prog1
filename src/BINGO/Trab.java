/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BINGO;

import java.util.Arrays;

/**
 *
 * @author Xavier
 */
public class Trab {

    static int[][] matrizDoJogador1 = new int[5][5];
    static int[][] matrizDoPC = new int[5][5];
    static int op = 0;

    public static void main(String[] args) {
      //  ordenaMatriz();
        op = 0;
        gerarCartela();
    }

    public static void gerarCartela() {
        long tempoInicial = System.currentTimeMillis();
        while (op < 2) {
            int[] v = new int[25];

            for (int i = 0; i < v.length; i++) {
                if (i == 0) {
                    v[i] = (int) ((Math.random() * 99) + 1);
                } else {
                    boolean troca = false;
                    while (!troca) {
                        v[i] = (int) ((Math.random() * 99) + 1);
                        for (int j = 0; j < i; j++) {
                            if (v[i] == v[j]) {
                                while (v[i] == v[j]) {
                                    v[i] = (int) ((Math.random() * 99) + 1);
                                }
                                break;
                            }
                        }
                        troca = true;
                    }
                }

            }
            Arrays.sort(v);
            transforma(v, op);
            op++;
        }

        imprime();

        System.out.println("");

        long tempoFinal = System.currentTimeMillis();
        System.out.println("Executado em: " + (tempoFinal - tempoInicial));
    }

    public static void transforma(int[] vetor, int op) {
        int k = 0;

        if (op == 0) {
            for (int[] matriz1 : matrizDoJogador1) {
                for (int j = 0; j < matrizDoJogador1[0].length; j++) {
                    matriz1[j] = vetor[k];
                    k++;
                }
            }
        }

        if (op == 1) {
            for (int[] matriz1 : matrizDoPC) {
                for (int j = 0; j < matrizDoPC[0].length; j++) {
                    matriz1[j] = vetor[k];
                    k++;
                }
            }
        }
    }

    public static void imprime() {
        System.out.println("  CARTELA JG   \t\t   CARTELA PC   ");
        System.out.println("B  I  N  G  O\t\t B  I  N  G  O");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2) {
                    System.out.print("-- ");
                } else if (matrizDoJogador1[i][j] < 10) {
                    System.out.print("0" + matrizDoJogador1[i][j] + " ");
                } else {
                    System.out.print(matrizDoJogador1[i][j] + " ");
                }
            }
            System.out.print("    |    ");
            for (int j = 0; j < 5; j++) {
                if (i == 2 && j == 2) {
                    System.out.print("-- ");
                } else if (matrizDoPC[i][j] < 10) {
                    System.out.print("0" + matrizDoPC[i][j] + " ");
                } else {
                    System.out.print(matrizDoPC[i][j] + " ");
                }
            }
            System.out.println("");
        }

    }

    // Ordema Matriz:
    public static void ordenaMatriz() {
        int[][] matrizTeste = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizTeste[i][j] = (int) (Math.random() * 100);
            }
        }

        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                if (j == 4) {
                    linha = i + 1;
                    coluna = 0;
                } else {
                    linha = i;
                    coluna = j + 1;
                }
                for (int k = linha; k < 5; k++) {
                    for (int l = coluna; l < 5; l++) {
                        if (matrizTeste[i][j] > matrizTeste[k][l]) {
                            int aux = matrizTeste[k][l];
                            matrizTeste[k][l] = matrizTeste[i][j];
                            matrizTeste[i][j] = aux;
                        }
                    }
                    coluna = 0;
                }
            }
        }
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizTeste[i][j] +"\t");
            }
            System.out.println("");
        }
        System.exit(0);
    }
}
