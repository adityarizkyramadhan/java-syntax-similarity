import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> kereta = new LinkedList<String>();
        int n = scan.nextInt(); scan.nextLine();
        String input = "";
        for (int i = 0; i < n; i++) {
            input = scan.nextLine();
            String[] inputSplit = input.split(" ");

            // Menggunakan metode equalsIgnoreCaseCustom() untuk menggantikan equalsIgnoreCase()
            if (equalsIgnoreCaseCustom(inputSplit[0], "BELAKANG") && equalsIgnoreCaseCustom(inputSplit[1], "LOKOMOTIF")) {
                System.out.println("GAGAL");
                break;
            }
            else if(equalsIgnoreCaseCustom(inputSplit[0], "DEPAN") && equalsIgnoreCaseCustom(inputSplit[1], "GERBONG")) {
                System.out.println("GAGAL");
                break;
            }

            if(equalsIgnoreCaseCustom(inputSplit[0], "DEPAN") || equalsIgnoreCaseCustom(inputSplit[0], "BELAKANG")) {
                tambahGerbong(kereta, inputSplit[1]);
            }
            else if (equalsIgnoreCaseCustom(inputSplit[0], "PRINT")) {
                print(kereta);
            }
        }
    }

    // Metode untuk membandingkan dua string tanpa memperhatikan huruf kapital
    public static boolean equalsIgnoreCaseCustom(String str1, String str2) {
        // Mengubah kedua string menjadi huruf kecil dan membandingkan
        return str1.toLowerCase().equals(str2.toLowerCase());
    }

    public static void tambahGerbong(LinkedList<String> kereta, String jenisGerbong) {
        kereta.addLast(jenisGerbong);
    }

    public static void print(LinkedList<String> kereta) {
        for (int i = 0; i < kereta.size(); i++) {
            System.out.print(kereta.get(i));
            System.out.print(" ");
        }
        System.out.println();
    }
}
