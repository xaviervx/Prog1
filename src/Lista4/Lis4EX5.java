/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista4;

/**
 *
 * @author Xavier
 */
public class Lis4EX5 {

    public static void main(String[] args) {

        int[][] lj = new int[3][12];
        int[][] em = new int[2][12];
        int lucro = 0;
        int maior = 0;
        int loja = 0;

        for (int i = 0; i < 3; i++) {
            System.out.print("Loja " + (i + 1) + "\t");
            for (int j = 0; j < 12; j++) {
                lj[i][j] = (int) ((Math.random() * 200) + 50);
                System.out.print(lj[i][j] + "\t");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            if (i == 0) {
                maior = lj[0][0];
                loja = i + 1;
            }
            for (int j = 0; j < 12; j++) {
                int m = maior;
                maior = Math.max(maior, lj[i][j]);
                if (m != maior) {
                    loja = i + 1;
                }
            }
        }
        
//        For sem sentido mas que ficou legal.
//        for (int i = 0; i < 12; i++) {
//            for (int j = 0; j < 12; j++) {
//                for (int k = 0; k < 3; k++) {
//                    em[0][i] += lj[k][j];
//                }
//            }
//        }

        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 3; j++) {
                lucro += lj[j][i];
            }
        }
        System.out.println("\nLucro Total:\t" + lucro + "\t");
        System.out.println("O maior lucro foi da loja " + loja + " = " + maior +" reais.");
    }

}
