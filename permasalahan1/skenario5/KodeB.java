import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scan = new Scanner(System.in);

        // Membuat linked list untuk menampung jenis gerbong
        LinkedList<String> kereta = new LinkedList<String>();

        // Membaca jumlah perintah yang akan diberikan
        int n = scan.nextInt();
        scan.nextLine(); // Mengkonsumsi newline setelah angka

        String input = ""; // Variabel untuk menyimpan input setiap baris

        // Melakukan iterasi sebanyak n perintah
        for (int i = 0; i < n; i++) {
            input = scan.nextLine(); // Membaca input perintah pengguna
            String[] inputSplit = input.split(" "); // Memisahkan perintah dan jenis gerbong

            // Mengecek apakah perintah mengandung kondisi GAGAL
            if (inputSplit[0].equalsIgnoreCase("BELAKANG") && inputSplit[1].equalsIgnoreCase("LOKOMOTIF")) {
                System.out.println("GAGAL"); // Menampilkan GAGAL jika kondisi benar
                break; // Menghentikan eksekusi program
            }
            // Mengecek kondisi GAGAL lainnya
            else if(inputSplit[0].equalsIgnoreCase("DEPAN") && inputSplit[1].equalsIgnoreCase("GERBONG")) {
                System.out.println("GAGAL"); // Menampilkan GAGAL jika kondisi benar
                break; // Menghentikan eksekusi program
            }

            // Menambahkan gerbong ke kereta jika perintah adalah "DEPAN" atau "BELAKANG"
            if(inputSplit[0].equalsIgnoreCase("DEPAN") || inputSplit[0].equalsIgnoreCase("BELAKANG")) {
                tambahGerbong(kereta, inputSplit[1]); // Menambah jenis gerbong ke linked list
            }
            // Jika perintah adalah "PRINT", mencetak semua gerbong
            else if (inputSplit[0].equalsIgnoreCase("PRINT")) {
                print(kereta); // Memanggil fungsi print untuk menampilkan gerbong
            }
        }
    }

    // Fungsi untuk menambah gerbong ke akhir list
    public static void tambahGerbong(LinkedList<String> kereta, String jenisGerbong) {
        kereta.addLast(jenisGerbong); // Menambahkan gerbong di akhir linked list
    }

    // Fungsi untuk mencetak semua gerbong
    public static void print(LinkedList<String> kereta) {
        for (int i = 0; i < kereta.size(); i++) {
            System.out.print(kereta.get(i)); // Mencetak setiap gerbong
            System.out.print(" "); // Menambahkan spasi antar gerbong
        }
        System.out.println(); // Menambahkan baris baru setelah mencetak semua gerbong
    }
}
