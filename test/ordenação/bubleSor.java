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
public class bubleSor {
    
    static int[][] matriz = new int[5][5];

    public static void main(String[] args) throws IOException {

        long tempoInicial = System.currentTimeMillis();

        int quan = 10000;
        int[] vetor = new int[quan];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * quan);
        }
        
        imprime(vetor);
        bubbleSort(vetor);
        System.out.println("");
        System.out.println("");
        imprime(vetor);
//        System.out.println("");
//        transforma(vetor, quan);
        
        long tempoFinal = System.currentTimeMillis();
        System.out.println("");
        System.out.println("Executado em: " + (tempoFinal - tempoInicial));

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
    
    private static void bubbleSort(int[] vetor) {
        boolean troca = true;
        int aux;
        while (troca) {            
            troca = false;
            for (int i = 0; i < vetor.length - 1; i++) {
                if (vetor[i] > vetor[i + 1]) {
                    aux = vetor[i];
                    vetor[i] = vetor[i + 1];
                    vetor[i + 1] = aux;
                    troca = true;
                }
            }
        }
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
