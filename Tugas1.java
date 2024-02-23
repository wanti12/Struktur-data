package TugasStrukturData;

import java.util.Arrays;

public class Tugas1 {

    public static void main(String[] args) {
        System.out.println("1. buat kode Array 1 dimensi (primitif) ");
        System.out.println("- Byte ");
        byte a[] = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(a));

        System.out.println("\n- short ");
        short b[] = {6, 7, 8};
        System.out.println("indeks ke- 0 = " + b[0]);
        System.out.println("indeks ke- 1 = " + b[1]);
        System.out.println("indeks ke- 2 = " + b[2]);

        System.out.println("\n-long");
        long[] c = {100, 200, 300, 400, 500};
        int batas = 0;
        while (batas < c.length) {
            System.out.println(c[batas]);
            batas++;
        }

        System.out.println("\n-integer");
        int[] d = {20, 40, 60};
        int batas2 = 0;
        do {
            System.out.println(d[batas2]);
            batas2++;
        } while (batas2 < d.length);

        System.out.println("\n-float");
        float e[] = {10.5f, 30.2f, 50.3f, 70.6f, 90.1f};
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }

        System.out.println("\n-double");
        double[] f = {1.11, 2.22, 3.33, 4.44, 5.55};
        for (double cetak : f) {
            System.out.println(cetak);
        }

        System.out.println("\n-boolean");
        boolean[] g = {true, false};
        String z = new String(Arrays.toString(g));
        System.out.println(z);

        System.out.println("\n-char");
        char[] h = {'A', 'B', 'O'};
        char h1 = h[0];
        char h2 = h[1];
        char h3 = h[2];
        System.out.println(h1 + " " + h2 + " " + h3);
    }
}
