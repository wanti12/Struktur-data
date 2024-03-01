package TugasStrukturData;

import java.util.*;

public class ArrayDanArrayList {

    public static void main(String[] args) {
        System.out.println("soal ArrayList");
        //1.membuat ArrayList dengan tipe data wrapper
        ArrayList<Byte> ganjil = new ArrayList<>();
        ganjil.add(Byte.valueOf((byte) 1));
        ganjil.add(Byte.valueOf((byte) 3));
        ganjil.add(Byte.valueOf((byte) 5));
        System.out.println("data array list : " + ganjil);

        //2. membuat ArrayList tipe data Integer
        ArrayList<Integer> ArrayInte = new ArrayList<>();
        System.out.println("\nmenambahkan nilai");
        ArrayInte.add(10);
        ArrayInte.add(20);
        ArrayInte.add(30);
        System.out.println("data array list : " + ArrayInte);
        System.out.println("mengakses nilai pada indeks ke 1 = " + ArrayInte.get(1));
        System.out.println("mengganti nilai " + ArrayInte.set(2, 50) + "\nsetelah di ganti = " + ArrayInte);
        System.out.println("menghapus nilai = " + ArrayInte.remove(0) + "\nmenjadi " + ArrayInte);
        System.out.println("size array = " + ArrayInte.size());

        System.out.println("\nsoal Array");
        //1.buat array 1 dimensi dengan 8 tipe data primitif
        byte a[] = {1, 2, 3, 4, 5};
        short b[] = {6, 7, 8};
        long[] c = {100, 200, 300, 400, 500};
        int[] d = {20, 40, 60};
        double[] f = {1.11, 2.22, 3.33, 4.44, 5.55};
        boolean[] g = {true, false, false, true};

        //2.buatlah array 1 dimensi bertipe data primitif kemudian cetak menggunakan 5 metode 
        int cetak[] = {1, 2, 3, 4};
        System.out.println("1.class array");
        System.out.println(Arrays.toString(cetak));

        System.out.println("2.for");
        System.out.print("[");
        for (int i = 0; i < cetak.length; i++) {
            System.out.print(cetak[i] + " ");
        }
        System.out.print("]");

        System.out.println("\n3.for-each");
        System.out.print("[");
        for (int print : cetak) {
            System.out.print(print + " ");
        }
        System.out.print("]");

        System.out.println("\n4.do while");
        System.out.print("[");
        int batas = 0;
        do {
            System.out.print(cetak[batas] + " ");
            batas++;
        } while (batas < cetak.length);
        System.out.print("]");

        System.out.println("\n4.while");
        int batas1 = 0;
        System.out.print("[");
        while (batas1 < cetak.length) {
            System.out.print(cetak[batas1] + " ");
            batas1++;
        }
        System.out.print("]\n");

        //3.buatlan Array 2 dimensi dengan inputan
        Scanner wa = new Scanner(System.in);
        int[][] x = new int[3][3];
        System.out.println("\nmasukkan angka : ");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[i].length; j++) {
                x[i][j] = wa.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(x));
        wa.close();;
    }
}
