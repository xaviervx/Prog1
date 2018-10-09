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
public class agoraVai {

    static String[][] matrizDoJogador1 = new String[5][5];
    static String[][] matrizDoPC = new String[5][5];
    static int op = 0;

    public static void main(String[] args) {
        long tempoInicial = System.currentTimeMillis();
        while (op < 2) {
            int[] v = new int[25];

            for (int i = 0; i < v.length; i++) {
                if (i == 0) {
                    v[i] = (int) ((Math.random() * 19) + 1);
                } else {
                    if (i < 5) {
                        boolean troca = false;
                        while (!troca) {
                            v[i] = (int) ((Math.random() * 19) + 1);
                            for (int j = 0; j < i; j++) {
                                if (v[i] == v[j]) {
                                    while (v[i] == v[j]) {
                                        v[i] = (int) ((Math.random() * 19) + 1);
                                    }
                                    break;
                                }
                            }
                            troca = true;
                        }
                    }
                    if (i < 10) {
                        boolean troca = false;
                        while (!troca) {
                            v[i] = (int) ((Math.random() * 19) + 21);
                            for (int j = 0; j < i; j++) {
                                if (v[i] == v[j]) {
                                    while (v[i] == v[j]) {
                                        v[i] = (int) ((Math.random() * 19) + 21);
                                    }
                                    break;
                                }
                            }
                            troca = true;
                        }
                    }
                    if (i < 15) {
                        boolean troca = false;
                        while (!troca) {
                            v[i] = (int) ((Math.random() * 19) + 41);
                            for (int j = 0; j < i; j++) {
                                if (v[i] == v[j]) {
                                    while (v[i] == v[j]) {
                                        v[i] = (int) ((Math.random() * 19) + 41);
                                    }
                                    break;
                                }
                            }
                            troca = true;
                        }
                    }
                    if (i < 20) {
                        boolean troca = false;
                        while (!troca) {
                            v[i] = (int) ((Math.random() * 19) + 61);
                            for (int j = 0; j < i; j++) {
                                if (v[i] == v[j]) {
                                    while (v[i] == v[j]) {
                                        v[i] = (int) ((Math.random() * 19) + 61);
                                    }
                                    break;
                                }
                            }
                            troca = true;
                        }
                    }
                    if (i < 25) {
                        boolean troca = false;
                        while (!troca) {
                            v[i] = (int) ((Math.random() * 19) + 91);
                            for (int j = 0; j < i; j++) {
                                if (v[i] == v[j]) {
                                    while (v[i] == v[j]) {
                                        v[i] = (int) ((Math.random() * 19) + 81);
                                    }
                                    break;
                                }
                            }
                            troca = true;
                        }
                    }

                }

            }
            Arrays.sort(v);
            gerarCartela(v, op);
            op++;
        }

        exibeCartelas();

        System.out.println("");

        long tempoFinal = System.currentTimeMillis();
        System.out.println("Executado em: " + (tempoFinal - tempoInicial));
    }

    public static void gerarCartela(int[] vetor, int op1) {
        int k = 0;

        if (op == 0) {
            for (String[] matriz1 : matrizDoJogador1) {
                for (int j = 0; j < matrizDoJogador1[0].length; j++) {
                    if (vetor[k] < 10) {
                        matriz1[j] = "0" + vetor[k];
                    } else {
                        matriz1[j] = "" + vetor[k];
                    }
                    k++;
                }
            }
        }

        if (op == 1) {
            for (String[] matriz1 : matrizDoPC) {
                for (int j = 0; j < matrizDoPC[0].length; j++) {
                    if (vetor[k] < 10) {
                        matriz1[j] = "0" + vetor[k];
                    } else {
                        matriz1[j] = "" + vetor[k];
                    }
                    k++;
                }
            }
        }
    }

    public static void sorteiNum() {

    }

    public static void verificaAcerto() {

    }

    public static void exibeCartelas() {
        System.out.println("  CARTELA JG   \t\t   CARTELA PC   ");
        System.out.println("B  I  N  G  O\t\t B  I  N  G  O");
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

            }

            System.out.print("    |    ");

            for (int j = 0; j < 5; j++) {

            }

            System.out.println("");
        }
    }

    public static void firificaGanhador() {

    }

    private static void transforma(int[] v, int op) {

    }
}
