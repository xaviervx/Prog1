/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenação;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class insertionSort {

    static int[][] matrizDoJogador = new int[5][5];
    static int[][] matrizDoPC = new int[5][5];

    public static void main(String[] args) {

        fazer();
        System.exit(0);

        long tempoInicial = System.currentTimeMillis();

        int quan = 25;
        int[] vetor = new int[quan];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100);
        }

        //    imprime(vetor);
        //  transforma(vetor, quan);
        Arrays.sort(vetor);
        //insertionSorte(vetor);

        System.out.println("");
        System.out.print("Ordenado");

        //  imprime(vetor);
        transforma(vetor);

        System.out.println("");
        long tempoFinal = System.currentTimeMillis();
        System.out.println("Executado em: " + (tempoFinal - tempoInicial));
    }

    private static void insertionSorte(int[] vetor) {

        int j;
        int key;
        int i;

        for (j = 1; j < vetor.length; j++) {
            key = vetor[j];
            for (i = j - 1; (i >= 0) && (vetor[i] > key); i--) {

                vetor[i + 1] = vetor[i];
            }
            vetor[i + 1] = key;

        }
    }

    private static void imprime(int[] vetor) {
        System.out.println("");
        for (int i = 0; i < vetor.length; i++) {
//            if (vetor[i] < 100 && vetor[i] >= 10) {
//                System.out.print("0" + vetor[i] + " ");
//            } else 
            if (vetor[i] < 10) {
                System.out.print("0" + vetor[i] + " ");
            } else {
                System.out.print(vetor[i] + " ");
            }
        }
    }

    private static void transforma(int[] vetor) {
        int k = 0;

        for (int[] matriz1 : matrizDoJogador) {
            for (int j = 0; j < matrizDoJogador[0].length; j++) {
                matriz1[j] = vetor[k];
                if (vetor[k] < 10) {
                    System.out.print("0" + matriz1[j] + " ");
                } else {
                    System.out.print(matriz1[j] + " ");
                }
                k++;
            }
            System.out.println("");
        }
    }

    private static void fazer() {

        long tempoInicial = System.currentTimeMillis();
        int[] v = new int[25];

        for (int i = 0; i < v.length; i++) {
            if (i == 0) {
                v[i] = (int) (Math.random() * 100);
            } else {
                boolean troca = false;
                while (!troca) {
                    v[i] = (int) (Math.random() * 100);
                    for (int j = 0; j < i; j++) {
                        if (v[i] == v[j]) {
                            while (v[i] == v[j]) {
                                v[i] = (int) (Math.random() * 100);
                            }
                            break;
                        }
                    }
                    troca = true;
                }
            }

        }
        Arrays.sort(v);
        transforma(v);

        System.out.println("");

        long tempoFinal = System.currentTimeMillis();
        System.out.println("Executado em: " + (tempoFinal - tempoInicial));
    }

}
