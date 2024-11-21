import java.util.LinkedList;
import java.util.Scanner;

public class TrainManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> train = new LinkedList<String>();
        int commandCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        String command = "";
        for (int i = 0; i < commandCount; i++) {
            command = scanner.nextLine();
            String[] commandParts = command.split(" ");
            if (commandParts[0].equalsIgnoreCase("BELAKANG") && commandParts[1].equalsIgnoreCase("LOKOMOTIF")) {
                System.out.println("ERROR");
                break;
            } else if (commandParts[0].equalsIgnoreCase("DEPAN") && commandParts[1].equalsIgnoreCase("GERBONG")) {
                System.out.println("ERROR");
                break;
            }

            if (commandParts[0].equalsIgnoreCase("DEPAN") || commandParts[0].equalsIgnoreCase("BELAKANG")) {
                addCarriage(train, commandParts[1]);
            } else if (commandParts[0].equalsIgnoreCase("TAMPILKAN")) {
                displayTrain(train);
            }
        }
    }

    public static void addCarriage(LinkedList<String> train, String carriageType) {
        train.addLast(carriageType);
    }

    public static void displayTrain(LinkedList<String> train) {
        for (int i = 0; i < train.size(); i++) {
            System.out.print(train.get(i));
            System.out.print(" ");
        }
        System.out.println();
    }
}
