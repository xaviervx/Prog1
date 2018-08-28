/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import java.io.IOException;

/**
 * @author Xavier; 
 * Professora: Eliana; 
 * Influencia: Danieis (existem vários); 
 * ADS 14 2018; Todos os direitos reservados ^-^
 */
public class Lis3EX4 {

    Scanner cs = new Scanner(System.in);
    BufferedReader lt = new BufferedReader(new InputStreamReader(System.in));

    // Váriaveis Globais
    // x = Congonhas; 
    // z = Guarulhos;
    boolean[] x = new boolean[]{false, false, false, false, false};
    boolean[] z = new boolean[]{false, false, false, false, false};

    public static void main(String[] args) throws IOException {
        Lis3EX4 q = new Lis3EX4();
        q.predefiniLugares();
    }

    // Sorteia os lugares que estarão disponiveis ou não, é executado somente uma vez.
    private void predefiniLugares() throws IOException {
        for (int i = 0; i < 5; i++) {
            int h = (int) (Math.random() * 2);
            x[i] = h != 0;
            int f = (int) (Math.random() * 2);
            z[i] = f != 0;
        }
        imprimeLugares();
    }

    // Faz a impressão dos lugares de acordo com o sortei obtido no metodo "predefiniLugares".
    public void imprimeLugares() throws IOException {
        System.out.println("Congonhas");
        System.out.print("Lugares" + "\t");

        for (int i = 0; i < 5; i++) {
            if (!x[i]) {
                System.out.print("\tC" + i + ": Disponivel" + "  \t");
            } else {
                System.out.print("\tC" + i + ": Indisponivel" + "\t");
            }
        }

        System.out.println("\n\nGuarulhos");
        System.out.print("Lugares" + "\t");

        for (int i = 0; i < 5; i++) {
            if (!z[i]) {
                System.out.print("\tG" + i + ": Disponivel" + "  \t");
            } else {
                System.out.print("\tG" + i + ": Indisponivel" + "\t");
            }
        }
        System.out.println("\n");
        escolherLugar();
    }

    // Lugar onde o úsuario informa dados para serem trabalhados. 
    private void escolherLugar() throws IOException {
        verifica();
        System.out.println("Escolha um voo: \n1 - Congonhas\n2 - Guarulhos");
        switch (cs.nextInt()) {
            case 1:
                int q = 1;
                System.out.print("Escolha um lugar: ");
                System.out.print("Complete com o número do assento -> C");
                int e = cs.nextInt();
                if (e < 4) {
                    System.out.println(imprimeCartao(e, q));
                    verifica();
                    System.out.println("\nEscolher outro lugar?\n1 - SIM\n2 - NÂO");
                    if (cs.nextInt() == 1) {
                        System.out.println("");
                        imprimeLugares();
                        escolherLugar();
                    }
                    System.exit(0);
                } else {
                    escolherLugar();
                }
                break;
            case 2:
                int c = 2;
                System.out.print("Escolha um lugar: ");
                System.out.print("Complete com o número do assento -> G");
                int ex = cs.nextInt();
                if (ex < 4) {
                    System.out.println(imprimeCartao(ex, c));
                    verifica();
                    System.out.println("\nEscolher outro lugar?\n1 - SIM\n2 - NÂO");
                    if (cs.nextInt() == 1) {
                        System.out.println("");
                        imprimeLugares();
                        escolherLugar();
                    }
                    System.exit(0);
                } else {
                    escolherLugar();
                }
                break;
            default:
                System.out.println("\nVoo inexistente\n");
                escolherLugar();
        }
    }

    // De acordo com as informações inseridas é retornado um cartão de embarque.
    // Informações no cartão de embarque: | Voo | Data/Horario | Assento |
    public String imprimeCartao(int a, int b) {
        boolean retorno = false;
        String resposta = "";

        // Iportação e formatação de datas:
        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatar1 = new SimpleDateFormat("HH:mm:ss");
        String dataFormatada = formatar.format(data);
        String dataFormatada1 = formatar1.format(data);

        if (b == 1) {
            if (x[a] == true) {
                resposta = "Lugar indisponivél";
            } else {
                x[a] = true;
                resposta = "\n\t\t      CARTÃO DE EMBARQUE\t\t"
                        + "\n\tVOO" + "\t|\t" + "DATA E HORARIO\t" + "\t|\t" + "ASSENTO\n"
                        + "Conconhas" + "\t|\t" + dataFormatada + "\t\t|\t" + "C" + a
                        + "\n\t\t" + "|\t" + dataFormatada1 + "\t\t|\t";
            }
        } else {
            if (z[a] == true) {
                resposta = "Lugar indisponivél";
            } else {
                z[a] = true;
                resposta = "\n\t\t      CARTÃO DE EMBARQUE\t\t"
                        + "\n\tVOO" + "\t|\t" + "DATA E HORARIO\t" + "\t|\t" + "ASSENTO\n"
                        + "Guarulhos" + "\t|\t" + dataFormatada + "\t\t|\t" + "G" + a
                        + "\n\t\t" + "|\t" + dataFormatada1 + "\t\t|\t";
            }
        }
        return resposta;
    }

    // Percorre os dois vetores e verifica se todos os lugares estão ocupados.
    // Caso todos estejam ocupados a execução é encerrada.
    private void verifica() {
        int contx = 0;
        int contz = 0;

        for (int i = 0; i < 4; i++) {
            if (x[i] == true) {
                contx++;
            }
        }
        for (int i = 0; i < 4; i++) {
            if (z[i] == true) {
                contz++;
            }
        }
        if ((contx == 4) && (contz == 4)) {
            System.out.println("\n\t\t\tVOOS LOTADOS!!\t\t");
            System.exit(0);
        }
    }
}