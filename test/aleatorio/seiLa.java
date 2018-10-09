/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Xavier
 */
public class seiLa {
    public static void main(String[] args) {
        int matrix[][] = {{1, 1, 0, 0, 0, 1}, 
                                  {3, 1, 4, 0, 0, 1},
                                  {0, 2, 0, 0, 0, 1},
                                  {4, 3, 0, 0, 0, 1},
                                  {1, 0, 0, 0, 0, 1}};
        double vector[] = {0.34, 0.21, 0.45, 0.32, 0.11};
        List<VectorAndMatrixLine> lines = new ArrayList<VectorAndMatrixLine>();
        for (int i = 0; i < vector.length; i++)
            lines.add(new VectorAndMatrixLine(i, vector[i], matrix[i]));
        Collections.sort(lines);
        System.out.println("Vector     Matrix Line");
        for (VectorAndMatrixLine line : lines) {
            System.out.printf(" %.2f       %s", line.getValor(), line.getMatrizStr());
            System.out.println();
        }
    }
}
class VectorAndMatrixLine implements Comparable<VectorAndMatrixLine> {
    private int matriz[];
    private double valor;
    private int index;
    public VectorAndMatrixLine(int index, double valor, int matriz[]) {
        this.index = index;
        this.valor = valor;
        this.matriz = matriz;
    }
    public String getMatrizStr() {
        StringBuilder str = new StringBuilder();
        for (int value : matriz)
            str.append(value).append(" ");
        return str.toString();
    }
    public int compareTo(VectorAndMatrixLine o) {
        return valor > o.valor ? 1 : (valor < o.valor ? -1 : 0);
    }
    public int[] getMatriz() {
        return matriz;
    }
    public double getValor() {
        return valor;
    }
    public int getIndex() {
        return index;
    }
}

