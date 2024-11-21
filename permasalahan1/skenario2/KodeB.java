import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> kereta = new LinkedList<String>();
        int n = scan.nextInt();
        scan.nextLine(); // Konsumsi newline
        String input;
        int count = 0;

        while (count < n) {
            input = scan.nextLine();
            String[] inputSplit = input.split(" ");
            String command = inputSplit[0].toUpperCase();
            String jenisGerbong = inputSplit.length > 1 ? inputSplit[1].toUpperCase() : "";

            switch (command) {
                case "BELAKANG":
                    if (jenisGerbong.equals("LOKOMOTIF")) {
                        System.out.println("GAGAL");
                        return; // Hentikan program
                    }
                    tambahGerbong(kereta, jenisGerbong);
                    break;

                case "DEPAN":
                    if (jenisGerbong.equals("GERBONG")) {
                        System.out.println("GAGAL");
                        return; // Hentikan program
                    }
                    tambahGerbong(kereta, jenisGerbong);
                    break;

                case "PRINT":
                    print(kereta);
                    break;

                default:
                    // Abaikan perintah yang tidak valid
                    break;
            }
            count++;
        }
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
