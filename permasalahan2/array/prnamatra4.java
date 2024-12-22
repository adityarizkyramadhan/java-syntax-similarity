import java.util.Arrays;
import java.util.Scanner;

public class PemdasHRArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] arrays = new char[10][10];

        for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                arrays[i][j] = in.next().charAt(0);
            }
        }
        int koor = in.nextInt();
        for (int x = 0; x < koor; x++) {
                int a = in.nextInt();
                int b = in.nextInt();

                //maaf kak saya ambil referensi dari temen bagian try catch masih asing sekali dengan perintah itu
                try {
                    if (Character.compare(arrays[a][b], 'k') == 0) {
                        System.out.println("Meleset");
                    } else if (Character.compare(arrays[a][b], 't') == 0) {
                        System.out.println("Terkena tank");
                    } else if (Character.compare(arrays[a][b], 'a') == 0) {
                        System.out.println("Terkena altileri");
                    } else if (Character.compare(arrays[a][b], 'p') == 0) {
                        System.out.println("Terkena personel");
                    }
                }catch(Exception e){
                    System.out.println("Tidak terjangkau");
                }
        }
    }
}

