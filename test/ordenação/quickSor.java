/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenação;

import java.io.IOException;

/**
 *
 * @author Xavier
 */
public class quickSor {

    static int[][] matriz = new int[5][5];
    
    public static void main(String[] args) throws IOException {

        int quantidade = 100000000;
        int[] vetor = new int[quantidade];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quantidade);
        }

        long tempoInicial = System.currentTimeMillis();

       // imprime(vetor);
       // System.out.println("");
        quickSort(vetor, 0, vetor.length - 1);
       // imprime(vetor);
        //System.out.println("");
      //  transforma(vetor, quantidade);
        
        long tempoFinal = System.currentTimeMillis();

        System.out.println("");
        System.out.println("Executado em = " + (tempoFinal - tempoInicial) + " ms");

    }

    private static void imprime(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 10) {
                System.out.print("0" + vetor[i] + " ");
            } else {
                System.out.print(vetor[i] + " ");
            }
        }
    }

    private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
            int posicaoPivo = separar(vetor, inicio, fim);
            quickSort(vetor, inicio, posicaoPivo - 1);
            quickSort(vetor, posicaoPivo + 1, fim);
        }
    }

    private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
            if (vetor[i] <= pivo) {
                i++;
            } else if (pivo < vetor[f]) {
                f--;
            } else {
                int troca = vetor[i];
                vetor[i] = vetor[f];
                vetor[f] = troca;
                i++;
                f--;
            }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
    }

    private static void transforma(int[] vetor, int quan) {
        int k = 0;

        System.out.println("");
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
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
}
