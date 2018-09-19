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
public class Lis6EX1 {

    public static void main(String[] args) {
        String[] gabarito = {"A", "B", "C", "C", "A"};
        String[][] respostas = new String[10][5];

        for (int i = 0; i < 10; i++) {
            int passa = 0;
            for (int j = 0; j < 5; j++) {
                int resposta = (int) (Math.random() * 3);
                if (resposta == 0) {
                    respostas[i][j] = "A";
                }
                if (resposta == 1) {
                    respostas[i][j] = "B";
                }
                if (resposta == 2) {
                    respostas[i][j] = "C";
                }

                if (respostas[i][j].equals(gabarito[j])) {
                    passa++;
                }
            }
            if (passa >= 3) {
                System.out.println("Aluno " + (i + 1) + " aprovado.");
            }else{
                System.out.println("Aluno " + (i + 1) + " reprovado.");
            }

        }
    }
}
