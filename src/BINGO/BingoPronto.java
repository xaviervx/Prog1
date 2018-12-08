/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BINGO;

import com.sun.glass.events.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 *
 * @author Xavier
 */
public class BingoPronto {

    static String[][] matrizDoJogador1 = new String[5][5];
    static String[][] matrizDoPC = new String[5][5];
    static int op = 0;
    static boolean essaEAPrimeiraVez;
    static int contadorJG = 0;
    static int contadorPC = 0;
    static int[] numerosJaSorteados = new int[99];
    static int numeroDaJogada = 0;

    // Serve só pra mostrar o "Recadino" e chamar o metodo gerarC().
    public static void main(String[] args) throws Exception {
        System.out.println("Precione 'ENTER' para continuar"
                + "\nQualquer coisa digitada encerrara o processo");
        System.out.println("");
        gerarC();
    }
    
    // Chama o metodo verificaAcerto() que recebe como paremetro o metodo sorteiNum(),
    // e após o acerto ser marcado nas matrizes (ou não), verifica se algum dos jogadores ja completou 
    // as sua cartela - quando ocorrer o metodo dira se foi empate ou vitoria de qual dos dois - 
    // exibe as cartelas usando o metodo exibeCartelas() e volta para o metodo jogo, ou seja,
    // Ele se alto referencia criando um loop que só acaba quando um dos dois ganhar.0
    public static void jogo() throws IOException, InterruptedException {
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));

        verificaAcerto(sorteiNum());
        System.out.println("Continuar...");
        if (!(lt.readLine().equals(""))) {
            System.exit(0);
        }
        verificaGanhador();
        exibeCartelas();
        jogo();
    }
    
    // Cria um vetor que só existe no metodo e sorteia nomeros pra ele da seguinte forma:
    // Usando a váriavel global "op" criei um laço de repetição pra gerar númeoros dentro de um vetor
    // de 1 a 19 até a posição 4,
    // de 20 a 39 até a posição 9,
    // de 40 a 59 até a posição 14,
    // de 60 a 79 até a posição 19 e
    // de 80 a 99 até a posição 24.
    // Cada vez que o sorteio é feito sem repetir os números esse vetor e enviado para o metodo gerarCartela()
    // que  que tambem recebe "op" e assim cria a matriz do jogador e depois a matriz do PC;
    public static void gerarC() throws InterruptedException, IOException {
        essaEAPrimeiraVez = true;

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
                                while (v[i] == v[j]) {
                                    v[i] = (int) ((Math.random() * 19) + 1);
                                }
                            }
                            troca = true;
                        }
                    }
                    if (i >= 5 && i < 10) {
                        boolean troca = false;
                        while (!troca) {
                            v[i] = (int) ((Math.random() * 19) + 21);
                            for (int j = 0; j < i; j++) {
                                while (v[i] == v[j]) {
                                    v[i] = (int) ((Math.random() * 19) + 21);
                                }
                            }
                            troca = true;
                        }
                    }
                    if (i >= 10 && i < 15) {
                        boolean troca = false;
                        while (!troca) {
                            v[i] = (int) ((Math.random() * 19) + 41);
                            for (int j = 0; j < i; j++) {
                                while (v[i] == v[j]) {
                                    v[i] = (int) ((Math.random() * 19) + 41);
                                }
                            }
                            troca = true;
                        }
                    }
                    if (i >= 15 && i < 20) {
                        boolean troca = false;
                        while (!troca) {
                            v[i] = (int) ((Math.random() * 19) + 61);
                            for (int j = 0; j < i; j++) {
                                while (v[i] == v[j]) {
                                    v[i] = (int) ((Math.random() * 19) + 61);
                                }
                            }
                            troca = true;
                        }
                    }
                    if (i >= 20 && i < 25) {
                        boolean troca = false;
                        while (!troca) {
                            v[i] = (int) ((Math.random() * 19) + 81);
                            for (int j = 0; j < i; j++) {
                                if (v[i] == v[j]) {
                                    while (v[i] == v[j]) {
                                        v[i] = (int) ((Math.random() * 19) + 81);
                                    }
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
    }

    // Com a inversão do i e j e com o axilio da variavel k consegui trasformar o vetor na matriz;
    // E no espaço central coloquei FE  que significa Free espaço;
    public static void gerarCartela(int[] vetor, int op1) {
        int k = 0;

        if (op == 0) {
            for (int i = 0; i < matrizDoJogador1.length; i++) {
                for (int j = 0; j < matrizDoJogador1[0].length; j++) {
                    if (i == 2 && j == 2) {
                        matrizDoJogador1[j][i] = "FE";
                    } else {
                        if (vetor[k] < 10) {
                            matrizDoJogador1[j][i] = "0" + vetor[k];
                        } else {
                            matrizDoJogador1[j][i] = "" + vetor[k];
                        }
                    }
                    k++;
                }
            }
        }

        if (op == 1) {
            for (int i = 0; i < matrizDoPC.length; i++) {
                for (int j = 0; j < matrizDoPC[0].length; j++) {
                    if (i == 2 && j == 2) {
                        matrizDoPC[j][i] = "FE";
                    } else {
                        if (vetor[k] < 10) {
                            matrizDoPC[j][i] = "0" + vetor[k];
                        } else {
                            matrizDoPC[j][i] = "" + vetor[k];
                        }
                    }
                    k++;
                }
            }
        }
    }

    // Chama o metodo limpaConsole() e depois imprime as cartelas lado a lado.
    public static void exibeCartelas() throws InterruptedException, IOException {

        limpaConsole();

//      Codigo só pra lembrar como dar Delay;            
//      Thread.sleep(500);
        

        System.out.println("  CARTELA JG   \t\t   CARTELA PC   ");
        System.out.println("B  I  N  G  O\t\t B  I  N  G  O");
        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                System.out.print(matrizDoJogador1[i][j] + " ");
            }

            System.out.print("    |    ");

            for (int j = 0; j < 5; j++) {
                System.out.print(matrizDoPC[i][j] + " ");
            }

            System.out.println("");
        }

        if (essaEAPrimeiraVez) {
            if (verificaCartela()) {
                op = 0;
                gerarC();
            }
        }
        
        jogo();
    }
    
    // Sorteia um numero e armazena em um vetor com a condição de que não repitão e assim mosta para o jogador e
    // a partir disso chama o metodo verificaAcerto().
    public static String sorteiNum() {
        int sorteio1 = ((int) (Math.random() * 99) + 1);
        numerosJaSorteados[numeroDaJogada] = sorteio1;

        if (numeroDaJogada > 0) {
            numerosJaSorteados[numeroDaJogada] = sorteio1;
            for (int j = 0; j < numeroDaJogada; j++) {
                while (numerosJaSorteados[j] == numerosJaSorteados[numeroDaJogada]) {
                    numerosJaSorteados[numeroDaJogada] = (sorteio1 = ((int) (Math.random() * 99) + 1));
                    j = 0;
                }
            }

        }
        numeroDaJogada++;

        String sorteio2;
        if (sorteio1 < 10) {
            sorteio2 = "0" + sorteio1;
        } else {
            sorteio2 = "" + sorteio1;
        }

        // Isso exibira o número sorteado na jogada atual;
        System.out.println("");
        if (sorteio1 < 20) {
            System.out.println("        Número sorteado: B-" + sorteio1);
        }
        if (sorteio1 >= 20 && sorteio1 < 40) {
            System.out.println("        Número sorteado: I-" + sorteio1);
        }
        if (sorteio1 >= 40 && sorteio1 < 60) {
            System.out.println("        Número sorteado: N-" + sorteio1);
        }
        if (sorteio1 >= 60 && sorteio1 < 80) {
            System.out.println("        Número sorteado: G-" + sorteio1);
        }
        if (sorteio1 >= 80) {
            System.out.println("        Número sorteado: O-" + sorteio1);
        }
       
        return sorteio2;
    }

    
    // Recebe o número sorteado convertido em String e verifica se ele esta presente em algumas
    // das duas matrizes e substitui por "XX", além de contar acerto pro jogador ou para o Pc
    // dependendo de qual possui o número sorteado.
    public static void verificaAcerto(String Num) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matrizDoJogador1[i][j].equals(Num)) {
                    matrizDoJogador1[i][j] = "XX";
                    contadorJG++;
                }
                if (matrizDoPC[i][j].equals(Num)) {
                    matrizDoPC[i][j] = "XX";
                    contadorPC++;
                }
            }
        }

    }

    public static void verificaGanhador() {
        if (contadorJG == 24 && contadorPC == 24) {
            System.out.println("Enpate");
            System.exit(0);
        } else {
            if (contadorJG == 24) {
                System.out.println("Você VENCEU!!!...");
                System.exit(0);
            }
            if (contadorPC == 24) {
                System.out.println("Você perdeu...");
                System.exit(0);
            }
        }

    }
    
    // Limpa o console pelo que entendi ele apaga eventos, mas não sei se é isso.
    public final static void limpaConsole() {
        try {
            Robot robot = new Robot();
            robot.setAutoDelay(10);
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_L);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_L);
        } catch (AWTException ex) {
        }

    }

    // Verifica se as cartelas são iguais, caso forem ele volta pra o metodo
    // gerarC e refaz as duas;
    public static boolean verificaCartela() {
        boolean repetir = false;
        int cont = 0;

        For:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (!(matrizDoJogador1[i][j].equals(matrizDoPC[i][j]))) {
                    repetir = false;
                    essaEAPrimeiraVez = false;
                    break For;
                } else {
                    cont++;
                }
            }
        }
        if (cont == 25) {
            repetir = true;
        }
        return repetir;
    }
    
}