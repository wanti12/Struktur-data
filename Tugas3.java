package TugasStrukturData;

import java.util.Arrays;

public class Tugas3 {

    public static void main(String[] args) {
        System.out.println("1. buat kode Array 2 dimensi (primitif) ");
        System.out.println("- Byte ");
        byte a[][] = {
            {1, 2, 3},
            {4, 5, 6}};
        System.out.println(a[0][0] + " " + a[0][1] + " " + a[0][2]);
        System.out.println(a[1][0] + " " + a[1][1] + " " + a[1][2]);

        System.out.println("\n- short ");
        short b[][] = {
            {6, 7, 8},
            {9, 10, 11}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.println(b[i][j]);
            }
            System.out.println();
        }

        System.out.println("\n-long");
        long[][] c = {
            {100, 200},
            {300, 400}};
        for (long[] cetak : c) {
            for (long cetak2 : cetak) {
                System.out.println(cetak2);
            }
        }

        System.out.println("\n-integer");
        int[][] d = {
            {20, 40, 60},
            {70, 80, 90}};
        System.out.println(Arrays.deepToString(d));

        System.out.println("\n-float");
        float e[][] = {
            {10.5f, 30.2f, 50.3f},
            {70.6f, 90.1f, 100, 7}};
        System.out.println(Arrays.deepToString(e));

        System.out.println("\n-double");
        double[][] f = {
            {1.11, 2.22},
            {3.33, 4.44, 5.55}};
        for (double[] cetak3 : f) {
            for (double cetak4 : cetak3) {
                System.out.println(cetak4);
            }
        }

        System.out.println("\n-boolean");
        boolean[][] g = {
            {true, false},
            {false, true}};
        for (int i = 0; i < g.length; i++) {
            for (int j = 0; j < g[i].length; j++) {
                System.out.println(g[i][j]);
            }
        }

        System.out.println("\n-char");
        char[][] h = {
            {'A', 'B', 'O'},
            {'C', 'H', 'K'}};
        System.out.println(Arrays.deepToString(h));
    }
}
