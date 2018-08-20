/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

/**
 *
 * @author Xavier
 */
public class Lis2EX5 {

    public static void main(String[] args) {

        int[] v = new int[10];
        int[] v2 = new int[10];
        int[] x = new int[10];

        for (int i = 0; i < 10; i++) {
            v[i] = (int) (Math.random() * 10);
            System.out.print(v[i] + " ");
        }

        for (int i = 0; i < 10; i++) {
            int cont = 0;
            for (int j = 0; j < 10; j++) {
                if (v[i] == v[j]) {
                    cont++;
                }
                if (j == 9) {
                    x[i] = cont;
                }
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("O número " + v[i] + " aparece " + x[i] + " vez(es).");
        }
    }

}
