/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogoDoXavier;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class inicio {

    BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
    Scanner cs = new Scanner(System.in);
    // Linha e colunas da pessoa.
    int l;
    int c;
    // Linha e coluna da IA;
    int lIA;
    int cIA;

    public static void main(String[] args) {
        inicio in = new inicio();
        String[][] jogo = new String[7][7];
        boolean primeiraImpressao = true;
        in.criarCampo(jogo);

    }

    public void criarCampo(String[][] jogo) {
        for (int i = 2; i < 7; i++) {
            for (int j = 2; j < 7; j++) {
                if (((i == 3) || (i == 5)) && ((j == 3) || (j == 5))) {
                    jogo[i][j] = "+";
                } else {
                    if (((j == 3) || (j == 5)) && !((i == 3) && (i == 5))) {
                        jogo[i][j] = "|";
                    } else {
                        if (((i == 3) || (i == 5)) && !((j == 3) && (j == 5))) {
                            jogo[i][j] = "-";
                        } else {
                            jogo[i][j] = " ";

                        }
                    }
                }
            }
        }
        marcacao(jogo);
    }

    public void marcacao(String[][] jogo) {

        // Marcação superior.
        for (int i = 0; i < 1; i++) {
            int cont = 1;
            for (int j = 0; j < 7; j++) {
                if (((j % 2) == 0) && (((j != 0) && (j != 1)))) {
                    jogo[i][j] = "" + cont;
                    jogo[i + 1][j] = "v";
                    cont++;
                } else {
                    jogo[i][j] = " ";
                    jogo[i + 1][j] = " ";
                }
            }
        }

        // Marcação inferior.
        int cont = 1;
        for (int i = 2; i < 7; i++) {
            for (int j = 0; j < 1; j++) {
                if ((i % 2) == 0) {
                    jogo[i][j] = "" + cont;
                    jogo[i][j + 1] = ">";
                    cont++;
                } else {
                    jogo[i][j] = " ";
                    jogo[i][j + 1] = " ";
                }
            }
        }
        imprime(jogo);
    }

    public void imprime(String[][] jogo) {
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print(jogo[i][j] + " ");
            }
            System.out.println("");
        }
        jogada(jogo);
    }

    public void jogada(String[][] jogo) {
        System.out.println("");
        System.out.println("Jogada");
        System.out.print("Linha: ");
        l = converssao(cs.nextInt());
        System.out.print("Coluna: ");
        c = converssao(cs.nextInt());
        System.out.println("");

        jogo[l][c] = "X";
        imprime(jogo);
    }

    public void escolhaIA() {
        // Jogada no meio:
        if (true) {
            
        }
    }

    public int converssao(int converte) {
        switch (converte) {
            case 1:
                converte += 1;
                break;
            case 2:
                converte += 2;
                break;
            case 3:
                converte += 4;
                break;
            default:
                break;
        }
        return converte;
    }

}
