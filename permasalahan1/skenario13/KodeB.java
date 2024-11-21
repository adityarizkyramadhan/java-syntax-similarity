import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> train = new LinkedList<String>();  // Nama variabel kereta diganti menjadi train
        int totalCommands = scanner.nextInt(); scanner.nextLine();  // Mengganti n menjadi totalCommands
        String command = "";  // Mengganti nama variabel input menjadi command

        for (int index = 0; index < totalCommands; index++) {  // Mengganti i menjadi index
            command = scanner.nextLine();
            String[] commandParts = command.split(" ");  // Mengganti inputSplit menjadi commandParts

            // Logika pemeriksaan kondisi untuk "belakang lokomotif" dan "depan gerbong"
            if (commandParts[0].equalsIgnoreCase("belakang") && commandParts[1].equalsIgnoreCase("lokomotif")) {
                System.out.println("GAGAL");
                break;
            } else if (commandParts[0].equalsIgnoreCase("depan") && commandParts[1].equalsIgnoreCase("gerbong")) {
                System.out.println("GAGAL");
                break;
            }

            // Logika untuk menambah gerbong di depan atau belakang
            if (commandParts[0].equalsIgnoreCase("depan") || commandParts[0].equalsIgnoreCase("belakang")) {
                train.addLast(commandParts[1]);  // Langsung menambahkan ke LinkedList tanpa method terpisah
            }
            // Logika untuk mencetak isi kereta
            else if (commandParts[0].equalsIgnoreCase("print")) {
                for (int position = 0; position < train.size(); position++) {  // Mengganti i menjadi position
                    System.out.print(train.get(position));  // Mencetak nama gerbong
                    System.out.print(" ");  // Menambahkan spasi antar gerbong
                }
                System.out.println();  // Menambahkan baris baru setelah mencetak semua gerbong
            }
        }
    }
}
