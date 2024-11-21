import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> kereta = new LinkedList<String>();
        int n = scan.nextInt(); scan.nextLine();  // Membaca jumlah input dan mengonsumsi newline
        String input = "";

        int i = 0;  // Inisialisasi variabel loop
        while (i < n) {  // Mengganti for loop dengan while loop
            input = scan.nextLine();
            String[] inputSplit = input.split(" ");

            if (inputSplit[0].equalsIgnoreCase("BELAKANG") && inputSplit[1].equalsIgnoreCase("LOKOMOTIF")) {
                System.out.println("GAGAL");
                break;
            }
            else if(inputSplit[0].equalsIgnoreCase("DEPAN") && inputSplit[1].equalsIgnoreCase("GERBONG")) {
                System.out.println("GAGAL");
                break;
            }

            if(inputSplit[0].equalsIgnoreCase("DEPAN") || inputSplit[0].equalsIgnoreCase("BELAKANG")) {
                tambahGerbong(kereta, inputSplit[1]);
            }
            else if (inputSplit[0].equalsIgnoreCase("PRINT")) {
                print(kereta);
            }
            i++;  // Menambah nilai i untuk iterasi selanjutnya
        }
    }

    public static void tambahGerbong(LinkedList<String> kereta, String jenisGerbong) {
        kereta.addLast(jenisGerbong);  // Menambahkan jenis gerbong ke dalam LinkedList
    }

    public static void print(LinkedList<String> kereta) {
        for (int i = 0; i < kereta.size(); i++) {
            System.out.print(kereta.get(i));  // Mencetak setiap gerbong
            System.out.print(" ");  // Menambahkan spasi antar gerbong
        }
        System.out.println();  // Menambahkan baris baru setelah mencetak semua gerbong
    }
}
