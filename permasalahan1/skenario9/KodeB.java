import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> kereta = new LinkedList<String>();
        int n = scan.nextInt(); scan.nextLine();

        processInput(scan, kereta, n);
    }

    public static void processInput(Scanner scan, LinkedList<String> kereta, int n) {
        String input = "";
        for (int i = 0; i < n; i++) {
            input = scan.nextLine();
            String[] inputSplit = input.split(" ");
            if (isGagal(inputSplit)) {
                System.out.println("GAGAL");
                break;
            }

            if (shouldAddGerbong(inputSplit)) {
                tambahGerbong(kereta, inputSplit[1]);
            } else if (inputSplit[0].equalsIgnoreCase("PRINT")) {
                print(kereta);
            }
        }
    }

    public static boolean isGagal(String[] inputSplit) {
        return (inputSplit[0].equalsIgnoreCase("BELAKANG") && inputSplit[1].equalsIgnoreCase("LOKOMOTIF")) ||
               (inputSplit[0].equalsIgnoreCase("DEPAN") && inputSplit[1].equalsIgnoreCase("GERBONG"));
    }

    public static boolean shouldAddGerbong(String[] inputSplit) {
        return inputSplit[0].equalsIgnoreCase("DEPAN") || inputSplit[0].equalsIgnoreCase("BELAKANG");
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
