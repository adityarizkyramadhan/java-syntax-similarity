import java.util.LinkedList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> train = new LinkedList<String>();
        int numOfInputs = scanner.nextInt(); scanner.nextLine();
        String userInput = "";

        int counter = 0;  // Mengganti variabel i menjadi counter
        while (counter < numOfInputs) {  // Mengganti variabel i menjadi counter
            userInput = scanner.nextLine();
            String[] splitInput = userInput.split(" ");

            if (splitInput[0].equalsIgnoreCase("BELAKANG") && splitInput[1].equalsIgnoreCase("LOKOMOTIF")) {
                System.out.println("GAGAL");
                break;
            }
            else if(splitInput[0].equalsIgnoreCase("DEPAN") && splitInput[1].equalsIgnoreCase("GERBONG")) {
                System.out.println("GAGAL");
                break;
            }

            if(splitInput[0].equalsIgnoreCase("DEPAN") || splitInput[0].equalsIgnoreCase("BELAKANG")) {
                addCarriage(train, splitInput[1]);
            }
            else if (splitInput[0].equalsIgnoreCase("PRINT")) {
                print(train);
            }

            counter++;  // Mengganti variabel i menjadi counter
        }
    }

    public static void addCarriage(LinkedList<String> train, String carriageType) {
        train.addLast(carriageType);  // Mengganti nama metode dari tambahGerbong menjadi addCarriage
    }

    public static void print(LinkedList<String> train) {
        for (int idx = 0; idx < train.size(); idx++) {  // Mengganti variabel i menjadi idx
            System.out.print(train.get(idx));  // Mengganti variabel i menjadi idx
            System.out.print(" ");  // Menambahkan spasi antar gerbong
        }
        System.out.println();  // Menambahkan baris baru setelah mencetak semua gerbong
    }
}
