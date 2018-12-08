/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista8;

import com.sun.glass.events.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class EX1 {

    static int cidades[][] = new int[5][2];

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //System.out.println("Informações da cidade " + (i + 1) + ": ");
            informacoes(cidades, i);
        }

        System.out.println("Maior número de acidentes: " + maiorIndice());
        System.out.println("Menor número de acidentes: " + menorIndice());
        System.out.println("Média de veículos em cada cidade: " + mediaVeiculosCadaCidade());
        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: " + mediaAcidentes());
    }

    public static void informacoes(int[][] cit, int l) {
        Scanner cs = new Scanner(System.in);

        // System.out.print("Informe o número de veiculos: ");
        cit[l][0] = (int) ((Math.random() * 3000) + 1000);//cs.nextInt();

        //System.out.print("Número de acidentes: ");
        cit[l][1] = (int) (Math.random() * 1000);//cs.nextInt();

        //limpaConsole();
    }

    public static int maiorIndice() {
        int vetorTeste[] = new int[5];
        for (int i = 0; i < cidades.length; i++) {
            vetorTeste[i] = cidades[i][1];
        }
        Arrays.sort(vetorTeste);
        return vetorTeste[4];
    }

    public static int menorIndice() {
        int vetorTeste[] = new int[5];
        for (int i = 0; i < cidades.length; i++) {
            vetorTeste[i] = cidades[i][1];
        }
        Arrays.sort(vetorTeste);
        return vetorTeste[0];
    }

    public static int mediaVeiculosCadaCidade() {
        int resultado = 0;
        for (int i = 0; i < 5; i++) {
            resultado += cidades[i][0];
        }
        return (resultado / 5);
    }

    public static int mediaAcidentes() {
        int resultado = 0;
        int div = 0;
        for (int i = 0; i < 5; i++) {
            if (cidades[i][0] < 2000) {
                resultado += cidades[i][0];
                div += cidades[i][1];
            }
        }
        if (div == 0 || resultado == 0) {
            return 0;
        } else {
            return (resultado / div);
        }
    }

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
}