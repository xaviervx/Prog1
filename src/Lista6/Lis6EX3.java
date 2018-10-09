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
public class Lis6EX3 {

    public static void main(String[] args) {
        Lis6EX3 vx = new Lis6EX3();

        int[][] matriz = new int[10][10];
        int[][] matriz2 = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j || i + j == 2) {
                    matriz2[i][j] = 1;
                    if (i + j == 4) {
                        matriz2[i][j] = 0;
                    }
                } else {
                    matriz2[i][j] = 0;
                }
                System.out.print(matriz2[i][j] + "  ");
                if ( i == 1 && j == 2) {
                    System.out.print("------------------------------------------------");
                }
                if (i == 2 && j == 2) {
                    System.out.print("                                               |");
                }
            }
            System.out.println("");
        }
        System.out.println("                                                        V");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = (int) (Math.random() * 2);

            }
        }

        // Atribuição manual de igualdade.
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                matriz[i + 0][j + 7] = matriz2[i][j];
//            }
//        }
        vx.troca(matriz, matriz2);
    }

    public void troca(int[][] matriz, int[][] matriz2) {
        int[][] matrizDemonstracao = new int[10][10];
        int me = 0;
        int m = 0;
        int cont = 0;
        boolean achou = false;

        do {
            For:
            for (int i = 0 + me; i < 3 + me; i++) {
                for (int j = 0 + m; j < 3 + m; j++) {
                    if (matriz[i][j] == matriz2[i - me][j - m]) {
                        cont++;
                    } else {
                        break;
                    }
                }
            }
            if (cont != 9) {
                m++;
                cont = 0;
                if (m == 8) {
                    me++;
                    m = 0;
                } else {
                    achou = true;
                }
                if (me == 8) {
                    cont = 9;
                    achou = false;
                }
            }
        } while (cont != 9);
        if (achou) {
            String espassamento = "";
            int aumentoL = 0;
            int aumentoC = 0;


            for (int i = 0; i < m; i++) {
                espassamento += "-  ";
            }

            for (int i = 0; i < 10; i++) {
                aumentoC = 0;
                for (int j = 0; j < 10; j++) {
                    System.out.print(matriz[i][j] + "  ");
                }

                System.out.print("         |");
                for (int j = 0; j < 10; j++) {
                    if (i >= me && i <= me + 2) {
                        if (j >= m && j <= m + 2) {
                            System.out.print((matriz2[0 + aumentoL][0 + aumentoC]) + "  ");
                            aumentoC++;
                        } else {
                            System.out.print("-  ");
                        }
                    } else {
                        System.out.print("-  ");
                    }
                }
                if (aumentoC == 3) {
                    aumentoL++;
                }

                System.out.println("");
            }

        } else {
            System.out.println("Não encontrado!!");
        }

    }
}
