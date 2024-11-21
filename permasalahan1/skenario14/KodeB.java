import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> kereta = new LinkedList<String>();
        int n = scan.nextInt(); scan.nextLine(); // Membaca jumlah input dan mengonsumsi newline
        String input = "";

        for (int i = 0; i < n; i++) {
            input = scan.nextLine();
            String[] inputSplit = input.split(" ");

            // Pengecekan kondisi 'BELAKANG LOKOMOTIF' atau 'DEPAN GERBONG'
            if (inputSplit[0].equalsIgnoreCase("BELAKANG") && inputSplit[1].equalsIgnoreCase("LOKOMOTIF")) {
                System.out.println("GAGAL");
                break;
            } else if (inputSplit[0].equalsIgnoreCase("DEPAN") && inputSplit[1].equalsIgnoreCase("GERBONG")) {
                System.out.println("GAGAL");
                break;
            }

            // Logika untuk menambahkan gerbong
            if (inputSplit[0].equalsIgnoreCase("DEPAN") || inputSplit[0].equalsIgnoreCase("BELAKANG")) {
                kereta.addLast(inputSplit[1]);  // Menambahkan gerbong ke belakang LinkedList
            }
            // Logika untuk mencetak kereta
            else if (inputSplit[0].equalsIgnoreCase("PRINT")) {
                for (int j = 0; j < kereta.size(); j++) {
                    System.out.print(kereta.get(j));
                    System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
