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
public class Lis5EX1 {

    BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));

    Scanner cs = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Lis5EX1 v = new Lis5EX1();
        v.quaseTudo();

    }

    public void quaseTudo() throws IOException {
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));

        Scanner cs = new Scanner(System.in);

        System.out.println("==================================================================="
                + "=============================================================================\n");

        System.out.print("Informações da matriz A:\nNúmero de Linhas: ");
        int numeroLinhas_a = cs.nextInt();
        System.out.print("Número de Colunas: ");
        int numeroColunas_a = cs.nextInt();

        System.out.print("\nInformações matriz B:\nNúmero de Linhas: ");
        int numeroLinhas_b = cs.nextInt();
        System.out.print("Número de Colunas: ");
        int numeroColunas_b = cs.nextInt();
        System.out.println("\n==================================================================="
                + "=============================================================================\n");

        if ((numeroColunas_a + numeroColunas_b) > 17) {
            System.out.println("Informe uma quantidade de colunas para 'a' e 'b' que"
                    + "\nquando somadas seja menor que 18.\n");
            quaseTudo();
        }
        if (numeroColunas_a != numeroLinhas_b) {
            System.out.println("Para que a operação seja possivél o número de"
                    + "\ncolunas de 'A' deve ser igual ao número de linhas de 'B'.\n");
            quaseTudo();
        }
        int[][] a = new int[numeroLinhas_a][numeroColunas_a];
        int[][] b = new int[numeroLinhas_b][numeroColunas_b];

        int maior = (Math.max(Math.max(numeroLinhas_a, numeroColunas_a), Math.max(numeroLinhas_b, numeroColunas_b)));
        int maiorL = Math.max(numeroLinhas_a, numeroLinhas_b);
        int maiorC = Math.max(numeroLinhas_b, numeroColunas_b);

        String[][] c = new String[maiorL][1 + numeroColunas_a + numeroColunas_b];

        for (int i = 0; i < numeroLinhas_a; i++) {
            for (int j = 0; j < numeroColunas_a; j++) {
                a[i][j] = (int) (Math.random() * 51);
                // Ativar caso queira que a Matriz "B" seja mostrada.System.out.print(a[i][j] + "\t");
            }
            // Ativar caso queira que a Matriz "A" seja mostrada. System.out.println("");
        }

        // Atvar isso tambem caso queira. ("\n==================================================================="
        //        + "=============================================================================\n");
        for (int i = 0; i < numeroLinhas_b; i++) {
            for (int j = 0; j < numeroColunas_b; j++) {
                b[i][j] = (int) (Math.random() * 51);
                // Ativar caso queira que a Matriz "B" seja mostrada.System.out.print(b[i][j] + "\t");
            }
            // Ativar caso queira que a Matriz "B" seja mostrada. System.out.println("");
        }

        System.out.println("\n==================================================================="
                + "=============================================================================\n");

        // Pondo a Matriz "A" dentor da "C".
        for (int i = 0; i < numeroLinhas_a; i++) {
            for (int j = 0; j < numeroColunas_a; j++) {
                c[i][j] = "" + a[i][j];
            }
        }
        // Erro cometido: a variavel "l" não estava sendo setada ao final do seu "for"
        // e a variavel "j" estava começando e terminando no lugar errado.
        //        for (int i = 0; i < numeroLinhas_b; i++) {
        //            for (int j = numeroColunas_a + 1; j < numeroColunas_a + numeroColunas_b; j++) {
        //                c[i][j] = "" + b[k][l];
        //                l++;
        //            }
        //            k++;
        //        }

        // Variaveis k e l usadas com um "for" mas que não deu certo com o "for"
        int k = 0;
        int l = 0;
        // Pondo a Matriz "B" dentor da "C".
        // Comblicado fazer isso. Caso alguém que esteja lendo saiba como melhorar, fique a vontado ^^.
        for (int i = 0; i < numeroLinhas_b; i++) {
            for (int j = numeroColunas_a + 1; j < (1 + (numeroColunas_a + numeroColunas_b)); j++) {
                c[i][j] = "" + b[k][l];
                l++;
            }
            k++;
            l = 0;
        }
        // Inprssão da Matriz "C" na tela
        for (int i = 0; i < (maiorL); i++) {
            for (int j = 0; j < (1 + (numeroColunas_a + numeroColunas_b)); j++) {
                if (j == (numeroColunas_a)) {
                    c[i][j] = "|";
                }
                if (c[i][j] == null) {
                    c[i][j] = " ";
                }
                System.out.print(c[i][j] + "\t");
            }
            System.out.println("");

        }
        System.out.println("\n==================================================================="
                + "=============================================================================\n");

        // Enviando váriaveis para o metodo.
        teste(a, b, numeroLinhas_a, numeroColunas_a, numeroColunas_b);
    }

    // Metodo que realiza a multiplicação das marizes e exibe uma nova como resultado
    private void teste(int[][] a, int[][] b, int l_a, int c_a, int c_b) throws IOException {
        int[][] h = new int[l_a][c_b];

        System.out.println("\nMultiplicação de A * B\n");

        // i e j correspondem respectivamente a o Número de Linhas da Matriz "A" e 
        // o Número de Colunas da Matriz "B"
        // A costante k pode ser tanto c_a ou l_b;
        for (int i = 0; i < l_a; i++) {
            for (int j = 0; j < c_b; j++) {
                for (int k = 0; k < c_a; k++) {
                    h[i][j] += (a[i][k]) * (b[k][j]);
                }
                System.out.print(h[i][j] + "\t");
            }
            System.out.println("\n");
        }
        System.out.print("Deseja Realizar outra operação?\nY - Sim / N - Não: ");
        if (lt.readLine().toUpperCase().equals("Y")) {
            System.out.println("==================================================================="
                    + "=============================================================================\n\n");
            quaseTudo();
        } else {
            System.exit(0);
        }
    }
}
