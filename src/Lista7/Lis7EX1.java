/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista7;

import Lista7.Lis7EX1;
import java.util.Scanner;

/**
 *
 * @author Xavier
 */
public class Lis7EX1 {

    int quantidade;
    double preco;

    public static void main(String[] args) {
        Lis7EX1 i = new Lis7EX1();
        i.dados();
    }

    public void dados() {
        Scanner cs = new Scanner(System.in);

        System.out.print("Quantidade do produto:\t");
        quantidade = cs.nextInt();
        System.out.print("Preço do produto:\t");
        preco = cs.nextDouble();
        System.out.println("Total:\t" + calculaTotalFatura(quantidade, preco));
    }

    public double calculaTotalFatura(int q, double p) {
        double h = q * p;
        return h;
    }
}
