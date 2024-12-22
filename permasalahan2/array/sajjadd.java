import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] medanPerang = new String[10][10];

        for (int i = 0; i < medanPerang.length; i++) {
            for (int j = 0; j < medanPerang[i].length; j++) {
                medanPerang[i][j] = input.next();
            }
        }
        int jumlahSerangan = input.nextInt();

        for (int x = 0; x < jumlahSerangan; x++) {
            int baris = input.nextInt();
            int kolom = input.nextInt();

            try {
                if ("k".equals(medanPerang[baris][kolom])) {
                    System.out.println("Meleset");

                } else if ("a".equals(medanPerang[baris][kolom])) {
                    System.out.println("Terkena altileri");

                } else if ("t".equals(medanPerang[baris][kolom])) {
                    System.out.println("Terkena tank");

                } else if ("p".equals(medanPerang[baris][kolom])) {
                    System.out.println("Terkena personel");

                }
            } catch (Exception e) {
                System.out.println("Tidak terjangkau");
            }
        }

    }
}
