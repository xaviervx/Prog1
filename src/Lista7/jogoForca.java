/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Xavier
 */
public class jogoForca {

    public static void main(String[] args) throws IOException {
        BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));
        String[] palavras = {"AMOR", "COMPUTADOR", "CADEIRA", "FOGUEIRA", "CANETA", "FILHOTE", "MARTELO", "FORMIGA", "GAFANHOTO", "GIRAFA", "ESPIRAL", "MORCEGO",
            "BORBOLETA", "ELEFANTE", "GOLFINHO", "COELHO", "OVELHA", "RAPADURA", "ESTOJO", "CADERNO", "BORRACHA", "RAQUETE"};

        int ran = ((int) (Math.random() * (palavras.length)));

        String[] palas = new String[(palavras[ran].length())];
        String[] pala = new String[(palavras[ran].length())];
        String digitadas = "";

        // Atribuir caracteres na nova String.
        for (int i = 0; i < (palavras[ran].length()); i++) {
            palas[i] = "" + palavras[ran].charAt(i);
        }

        for (int i = 0; i < (palavras[ran].length()); i++) {
            pala[i] = "_";
        }

        int chances = 7;
        int certo = 0;

        System.out.println("JOGO DA FORCA");
        while (chances >= 0) {
            boolean certo1 = false;
            
            System.out.println("");
            System.out.println("Chances restantes " + chances);
            
            // Mostra os riscos.
            for (int i = 0; i < (palavras[ran].length()); i++) {
                System.out.print(pala[i] + "\t");
            }
        
            System.out.println("");
            System.out.print("Letra: ");
            String le = lt.readLine().toUpperCase().trim();
            digitadas += le + "\t";

            System.out.println(le);

            for (int i = 0; i < (palavras[ran].length()); i++) {
                if (le.equals(palas[i])) {
                    certo1 = true;
                    if ("_".equals(pala[i])) {
                        pala[i] = le;
                        certo++;
                    }
                }
            }
            
            if (!certo1) {
                chances--;
            } 
            
            if (certo != palavras[ran].length()) {
                System.out.println("");
                System.out.println("Letras digitadas: " + digitadas);
            }

            if (certo == palavras[ran].length()) {
                System.out.println("");
                System.out.println("Plavra que foi sorteada: " + palavras[ran]);
                System.out.println("VOCÊ GANHOU!!");
                System.exit(0);
            }
        }
        
        System.out.println("");
        System.out.println("FIM DE JOGO");
        System.out.println("VOCÊ PERDEU");
    }
}
