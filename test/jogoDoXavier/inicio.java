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

    // Contador da jogada.
    int numeroDaJogada = 0;

    // Armazena as jogadas ja feitas pelo jogador:
    int[] primeiraJogadaJogador = new int[2];
    int[] segundaJogadaJogador = new int[2];
    int[] terceiraJogadaJogador = new int[2];
    int[] quartaJogadaJogador = new int[2];

    // Armazena as jogadas feitas pela IA:
    int[] primeiraJogadaIA = new int[2];
    int[] segundaJogadaIA = new int[2];
    int[] terceiraJogadaIA = new int[2];
    int[] quartaJogadaIA = new int[2];

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
        jogo[0][1] = "C";
        jogo[1][0] = "L";
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

        posso(jogo);
        jogo[l][c] = "X";
        escolhaIA(jogo);
    }

    public void escolhaIA(String[][] jogo) {
        l = desConverssao(l);
        c = desConverssao(c);
        switch (numeroDaJogada) {
            // Primeira Jogada
            case 0:
                // Jogada no meio:
                if ((l == 2) && (c == 2)) {
                    int escolhaDeJogada = (int) (Math.random() * (4));
                    switch (escolhaDeJogada + 1) {
                        case 1:
                            lIA = converssao(1);
                            cIA = converssao(1);
                            jogo[lIA][cIA] = "O";
                            break;
                        case 2:
                            lIA = converssao(1);
                            cIA = converssao(3);
                            jogo[lIA][cIA] = "O";
                            break;
                        case 3:
                            lIA = converssao(3);
                            cIA = converssao(1);
                            jogo[lIA][cIA] = "O";
                            break;
                        case 4:
                            lIA = converssao(3);
                            cIA = converssao(3);
                            jogo[lIA][cIA] = "O";
                            break;
                    }
                } else {
                    lIA = converssao(2);
                    cIA = converssao(2);
                    jogo[lIA][cIA] = "O";
                }

                // Armazenar as Linhas
                primeiraJogadaJogador[0] = l;
                primeiraJogadaIA[0] = desConverssao(lIA);
                // Armazenar Colunas
                primeiraJogadaJogador[1] = c;
                primeiraJogadaIA[1] = desConverssao(cIA);

                area51();
                numeroDaJogada++;

                break;

            // Segunda jogada
            case 1:
                // Xis no meio:
                if ((jogo[4][4]).equals("X")) {
                    lIA = 4 - l;
                    cIA = 4 - c;

                    lIA = converssao(lIA);
                    cIA = converssao(cIA);
                    if ("O".equals(jogo[lIA][cIA])) {
                        // Verificação de qual jogada esta disponivel e escolha de qual fazer:
                        boolean possivel = false;
                        while (!possivel) {
                            int[][] posicao = new int[4][2];
                            int aleatorio = (int) (Math.random() * 4);
                            switch (aleatorio) {
                                case 0:
                                    if (jogo[2][2].equals(" ")) {
                                        lIA = posicao[0][0] = 2;
                                        cIA = posicao[0][1] = 2;
                                        possivel = true;
                                    }
                                    break;
                                case 1:
                                    if (jogo[2][6].equals(" ")) {
                                        lIA = posicao[1][0] = 2;
                                        cIA = posicao[1][1] = 6;
                                        possivel = true;
                                    }
                                    break;
                                case 2:
                                    if (jogo[6][2].equals(" ")) {
                                        lIA = posicao[2][0] = 6;
                                        cIA = posicao[2][1] = 2;
                                        possivel = true;
                                    }
                                    break;
                                case 3:
                                    if (jogo[6][6].equals(" ")) {
                                        lIA = posicao[3][0] = 6;
                                        cIA = posicao[3][1] = 6;
                                        possivel = true;
                                    }
                                    break;
                            }
                            jogo[lIA][cIA] = "O";
                        }
                    } else {
                        jogo[lIA][cIA] = "O";
                    }
                }

                // Bolinha no meio
                if ((jogo[4][4]).equals("O")) {
                    if ((l + primeiraJogadaJogador[0] == 4 && c + primeiraJogadaJogador[1] == 4)) {
                        if ((l == 1 || l == 3) && (c == 1 || c == 3)) {
                            boolean posso = false;
                            while (!posso) {
                                switch ((int) (Math.random() * 3) + 1) {
                                    case 1:
                                        if (jogo[2][4].equals(" ")) {
                                            lIA = 2;
                                            cIA = 4;
                                            posso = true;
                                        }
                                        break;
                                    case 2:
                                        if (jogo[4][6].equals(" ")) {
                                            lIA = 4;
                                            cIA = 6;
                                            posso = true;
                                        }
                                        break;
                                    case 3:
                                        if (jogo[6][4].equals(" ")) {
                                            lIA = 6;
                                            cIA = 4;
                                            posso = true;
                                        }
                                        break;
                                    case 4:
                                        if (jogo[4][2].equals(" ")) {
                                            lIA = 4;
                                            cIA = 2;
                                            posso = true;
                                        }
                                        break;
                                }
                            }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        } else {
                            switch ((int) (Math.random() * 3)) {
                                case 0:
                                    boolean possivel = false;
                                    while (!possivel) {
                                        switch ((int) (Math.random() * 3)) {
                                            case 0:
                                                if (jogo[2][2].equals(" ")) {
                                                    lIA = 2;
                                                    cIA = 2;
                                                    possivel = true;
                                                }
                                                break;
                                            case 1:
                                                if (jogo[2][4].equals(" ")) {
                                                    lIA = 2;
                                                    cIA = 4;
                                                    possivel = true;
                                                }
                                                break;
                                            case 2:
                                                if (jogo[2][6].equals(" ")) {
                                                    lIA = 2;
                                                    cIA = 6;
                                                    possivel = true;
                                                }
                                                break;
                                        }
                                    }
                                    break;
                                case 1:
                                    boolean possive = false;
                                    while (!possive) {
                                        switch ((int) (Math.random() * 2)) {
                                            case 0:
                                                if (jogo[4][2].equals(" ")) {
                                                    lIA = 4;
                                                    cIA = 2;
                                                    possive = true;
                                                }
                                                break;
                                            case 1:
                                                if (jogo[4][6].equals(" ")) {
                                                    lIA = 4;
                                                    cIA = 6;
                                                    possive = true;
                                                }
                                                break;
                                        }
                                    }
                                    break;

                                case 2:
                                    boolean possiv = false;
                                    while (!possiv) {
                                        switch ((int) (Math.random() * 3)) {
                                            case 0:
                                                if (jogo[6][2].equals(" ")) {
                                                    lIA = 6;
                                                    cIA = 2;
                                                    possiv = true;
                                                }
                                                break;
                                            case 1:
                                                if (jogo[6][4].equals(" ")) {
                                                    lIA = 6;
                                                    cIA = 4;
                                                    possiv = true;
                                                }
                                                break;
                                            case 2:
                                                if (jogo[6][6].equals(" ")) {
                                                    lIA = 6;
                                                    cIA = 6;
                                                    possiv = true;
                                                }
                                                break;
                                        }
                                    }
                                    break;
                            }

                        }
                    } else {
                        if (((l + c) == 3 || (l + c) == 5) || (l == 1 || l == 3) && (c == 1 || c == 3)) {
                            boolean acabou = false;
                            int lp;
                            int cp; 
                            while (!acabou) {
                                 lp = (int) (Math.random() * 5) + 2;
                                 cp = (int) (Math.random() * 5) + 2;
                                if (jogo[lp][cp].equals(" ") && jogo[8 - lp][8 - cp].equals(" ")) {
                                    lIA = lp;
                                    cIA = cp;
                                    acabou = true;
                                }
                            }
                        } else {
                            if ((l == 1 || l == 3) && (c == 1 || c == 3)) {
                                lIA = converssao((l + primeiraJogadaJogador[0]) / 2);
                                cIA = converssao((c + primeiraJogadaJogador[1]) / 2);
                            } else {
                                if (jogo[converssao(l)][converssao(primeiraJogadaJogador[1])].equals(" ")) {
                                    lIA = converssao(l);
                                    cIA = converssao(primeiraJogadaJogador[1]);
                                } else {
                                    lIA = converssao(primeiraJogadaJogador[0]);
                                    cIA = converssao(c);
                                }
                            }
                        }
                    }
                    jogo[lIA][cIA] = "O";
                }
                // Armazenar as Linhas
                segundaJogadaJogador[0] = l;
                segundaJogadaIA[0] = desConverssao(lIA);
                // Armazenar Colunas
                segundaJogadaJogador[1] = c;
                segundaJogadaIA[1] = desConverssao(cIA);

                area51();
                numeroDaJogada++;

                break;

            // Terceira jogada    
            case 2:

                break;

            // Quarta jogada
            case 3:

                break;

            default:
                break;
        }
        imprime(jogo);
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
                converte += 3;
                break;
            default:
                break;
        }
        return converte;
    }

    public int desConverssao(int converte) {
        switch (converte) {
            case 2:
                converte -= 1;
                break;
            case 4:
                converte -= 2;
                break;
            case 6:
                converte -= 3;
                break;
            default:
                break;
        }
        return converte;
    }

    public void posso(String[][] jogo) {
        if (!(jogo[l][c].equals(" "))) {
            System.out.println("JOGADA INVALIDA");
            imprime(jogo);
            jogada(jogo);
        }
    }

    private void area51() {
        if (numeroDaJogada == 0) {
            System.out.println("Primeira jodada do jogador");
            for (int i = 0; i < 2; i++) {
                System.out.print(primeiraJogadaJogador[i] + " ");
            }
            System.out.println("");
            System.out.println("Primeira jogada da IA");
            for (int i = 0; i < 2; i++) {
                System.out.print(primeiraJogadaIA[i] + " ");
            }
            System.out.println("");
        }
        if (numeroDaJogada == 1) {
            System.out.println("Segunda jogada do jogador");
            for (int i = 0; i < 2; i++) {
                System.out.print(segundaJogadaJogador[i] + " ");
            }
            System.out.println("");
            System.out.println("Segunda jogada da IA");
            for (int i = 0; i < 2; i++) {
                System.out.print(segundaJogadaIA[i] + " ");
            }
            System.out.println("");
        }
    }
}
