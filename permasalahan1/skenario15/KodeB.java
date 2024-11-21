import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> train = new LinkedList<String>();
        int totalCommands = scan.nextInt(); scan.nextLine();
        String command = "";

        int index = 0;
        while (index < totalCommands) {
            command = scan.nextLine();
            String[] commandParts = command.split(" ");

            // Menangani kondisi 'belakang lokomotif' atau 'depan gerbong'
            if (commandParts[0].equals("belakang") && commandParts[1].equals("lokomotif")) {
                System.out.printf("gagal%n");
                break;
            } else if (commandParts[0].equals("depan") && commandParts[1].equals("gerbong")) {
                System.out.printf("gagal%n");
                break;
            }

            // Menambahkan gerbong ke belakang atau depan
            if (commandParts[0].equals("depan") || commandParts[0].equals("belakang")) {
                train.addLast(commandParts[1]);  // Menambah gerbong ke belakang
            }
            // Menampilkan kereta
            else if (commandParts[0].equals("print")) {
                for (String car : train) {
                    System.out.printf("%s ", car);
                }
                System.out.println();  // Menambahkan baris baru setelah mencetak semua gerbong
            }

            index++;  // Increment untuk loop while
        }
    }
}
