import java.util.Iterator;
import java.util.Scanner;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class Solution {
    public static void main(String[] args) {
        PriorityQueue<String> pQueue = new PriorityQueue<String>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); scanner.nextLine();
        for(int i = 0; i <n; i++){
            String input = scanner.nextLine();
                if(input.equalsIgnoreCase("Kendaraan Pribadi")){
                    pQueue.add("7 Kendaraan Pribadi");
                }
                else if(input.equalsIgnoreCase("Pemadam Kebakaran")){
                    pQueue.add("1 Pemadam Kebakaran");
                }
                else if(input.equalsIgnoreCase("Ambulance")){
                    pQueue.add("2 Ambulance");
                }
                else if(input.equalsIgnoreCase("Kendaraan Penolong Laka Lantas")){
                    pQueue.add("3 Kendaraan Penolong Laka Lantas");
                }
                else if(input.equalsIgnoreCase("Kendaraan Pimpinan NKRI")){
                    pQueue.add("4 Kendaraan Pimpinan NKRI");
                }
                else if(input.equalsIgnoreCase("Kendaraan Tamu Negara")){
                    pQueue.add("5 Kendaraan Tamu Negara");
                }
                else if(input.equalsIgnoreCase("Ambulance Jenazah")){
                    pQueue.add("6 Ambulance Jenazah");
                }
                else {
                    pQueue.add("8 "+input);
                }
        }

        Iterator <String> iterator = pQueue.iterator();
        while(iterator.hasNext()){
            System.out.println(pQueue.poll().substring(2));
        }
    }
}
