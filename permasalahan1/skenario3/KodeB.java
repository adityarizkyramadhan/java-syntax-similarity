import java.util.LinkedList;
import java.util.Scanner;

public class TrainSystem {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        LinkedList<String> train = new LinkedList<String>();
        int commandsCount = inputScanner.nextInt();
        inputScanner.nextLine(); // Konsumsi newline
        String userCommand = "";

        for (int commandIndex = 0; commandIndex < commandsCount; commandIndex++) {
            userCommand = inputScanner.nextLine();
            String[] commandParts = userCommand.split(" ");

            if (commandParts[0].equalsIgnoreCase("PRINT")) {
                displayTrain(train);
            } else if (commandParts[0].equalsIgnoreCase("DEPAN") || commandParts[0].equalsIgnoreCase("BELAKANG")) {
                if (commandParts[0].equalsIgnoreCase("BELAKANG") && commandParts[1].equalsIgnoreCase("LOKOMOTIF")) {
                    System.out.println("GAGAL");
                    break;
                } else if (commandParts[0].equalsIgnoreCase("DEPAN") && commandParts[1].equalsIgnoreCase("GERBONG")) {
                    System.out.println("GAGAL");
                    break;
                }
                addCarriage(train, commandParts[1]);
            }
        }
    }

    public static void addCarriage(LinkedList<String> train, String carriageType) {
        train.addLast(carriageType);
    }

    public static void displayTrain(LinkedList<String> train) {
        for (int carriageIndex = 0; carriageIndex < train.size(); carriageIndex++) {
            System.out.print(train.get(carriageIndex));
            System.out.print(" ");
        }
        System.out.println();
    }
}
