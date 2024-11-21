import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> kereta = new LinkedList<String>();
        int n = scan.nextInt();
        scan.nextLine(); // Konsumsi newline
        String input = "";

        for (int i = 0; i < n; i++) {
            input = scan.nextLine();
            String[] inputSplit = input.split(" ");

            if (inputSplit[0].equalsIgnoreCase("PRINT")) {
                print(kereta);
            } else if (inputSplit[0].equalsIgnoreCase("DEPAN") || inputSplit[0].equalsIgnoreCase("BELAKANG")) {
                if (inputSplit[0].equalsIgnoreCase("BELAKANG") && inputSplit[1].equalsIgnoreCase("LOKOMOTIF")) {
                    System.out.println("GAGAL");
                    break;
                } else if (inputSplit[0].equalsIgnoreCase("DEPAN") && inputSplit[1].equalsIgnoreCase("GERBONG")) {
                    System.out.println("GAGAL");
                    break;
                }
                tambahGerbong(kereta, inputSplit[1]);
            }
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
