import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> train = new LinkedList<String>();  // Inisialisasi LinkedList dengan nama variabel 'train'
        int totalCommands = scanner.nextInt(); scanner.nextLine();  // Mengubah 'n' menjadi 'totalCommands'
        String userCommand = "";

        int index = 0;  // Mengganti variabel 'i' menjadi 'index'
        while (index < totalCommands) {  // Mengganti loop 'for' menjadi 'while' dengan 'index'
            userCommand = scanner.nextLine();
            String[] commandParts = userCommand.split(" ");  // Mengganti 'inputSplit' menjadi 'commandParts'

            // Menggunakan perbandingan dengan huruf kecil untuk "depan" dan "belakang"
            if (commandParts[0].toLowerCase().equals("belakang") && commandParts[1].toLowerCase().equals("lokomotif")) {
                System.out.println("gagal");
                break;
            }
            else if(commandParts[0].toLowerCase().equals("depan") && commandParts[1].toLowerCase().equals("gerbong")) {
                System.out.println("gagal");
                break;
            }

            if(commandParts[0].toLowerCase().equals("depan") || commandParts[0].toLowerCase().equals("belakang")) {
                addCarriage(train, commandParts[1]);  // Mengganti 'tambahGerbong' menjadi 'addCarriage'
            }
            else if (commandParts[0].toLowerCase().equals("print")) {
                printTrain(train);
            }

            index++;  // Increment 'index' untuk loop berikutnya
        }
    }

    public static void addCarriage(LinkedList<String> train, String carriageType) {
        train.addLast(carriageType);  // Menambahkan gerbong ke dalam LinkedList
    }

    public static void printTrain(LinkedList<String> train) {
        for (int position = 0; position < train.size(); position++) {  // Mengganti 'i' menjadi 'position'
            System.out.print(train.get(position));  // Mencetak nama gerbong
            System.out.print(" ");  // Menambahkan spasi antar gerbong
        }
        System.out.println();  // Menambahkan baris baru setelah mencetak semua gerbong
    }
}
