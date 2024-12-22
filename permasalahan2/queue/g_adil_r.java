import java.io.*;
import java.util.*;

public class Solution {
    public static Scanner Input = new Scanner(System.in);
    public static PriorityQueue<String> QVehicle = new PriorityQueue<>(new VehicleComparator<>());

    public static void main(String[] args) {
        int n = Input.nextInt(); Input.nextLine();

        try {
            while (true) {
                QVehicle.offer(Input.nextLine());
            }
        } catch (Exception e) {
            while (!QVehicle.isEmpty()) {
                System.out.println(QVehicle.remove());
            }
        }
    }
}

class VehicleComparator<t> implements Comparator<t> {

    @Override
    public int compare(Object o1, Object o2) {

        String[] prioArr = {
                "Pemadam Kebakaran",
                "Ambulance",
                "Kendaraan Penolong Laka Lantas",
                "Kendaraan Pimpinan NKRI",
                "Kendaraan Tamu Negara",
                "Ambulance Jenazah"
        };

        for (String k:prioArr) {
            if (o1.equals(k)) return -1;
            else if (o2.equals(k)) return 1;
        }
        return 0;
    }
}
