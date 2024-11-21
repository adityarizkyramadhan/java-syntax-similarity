import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Mengganti LinkedList dengan ArrayList yang menyimpan tipe Integer
        ArrayList<Integer> kereta = new ArrayList<Integer>();

        int n = scan.nextInt();
        scan.nextLine(); // Konsumsi newline setelah angka
        String input = "";

        for (int i = 0; i < n; i++) {
            input = scan.nextLine();
            String[] inputSplit = input.split(" ");

            // Mengecek kondisi GAGAL dengan input yang dimasukkan
            if (inputSplit[0].equalsIgnoreCase("BELAKANG") && inputSplit[1].equalsIgnoreCase("LOKOMOTIF")) {
                System.out.println("GAGAL");
                break;
            }
            else if(inputSplit[0].equalsIgnoreCase("DEPAN") && inputSplit[1].equalsIgnoreCase("GERBONG")) {
                System.out.println("GAGAL");
                break;
            }

            // Jika perintah adalah "DEPAN" atau "BELAKANG", kita menambah gerbong dalam bentuk angka
            if(inputSplit[0].equalsIgnoreCase("DEPAN") || inputSplit[0].equalsIgnoreCase("BELAKANG")) {
                tambahGerbong(kereta, Integer.parseInt(inputSplit[1])); // Menggunakan Integer untuk menambah gerbong
            }
            // Jika perintah adalah "PRINT", kita mencetak kereta
            else if (inputSplit[0].equalsIgnoreCase("PRINT")) {
                print(kereta);
            }
        }
    }

    // Fungsi untuk menambah gerbong dengan tipe data Integer
    public static void tambahGerbong(ArrayList<Integer> kereta, int jenisGerbong) {
        kereta.add(jenisGerbong); // Menambahkan angka gerbong ke ArrayList
    }

    // Fungsi untuk mencetak semua gerbong
    public static void print(ArrayList<Integer> kereta) {
        for (int i = 0; i < kereta.size(); i++) {
            System.out.print(kereta.get(i)); // Mencetak angka gerbong
            System.out.print(" "); // Menambahkan spasi antar gerbong
        }
        System.out.println(); // Menambahkan baris baru setelah mencetak semua gerbong
    }
}
