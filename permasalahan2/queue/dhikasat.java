import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner wkwk = new Scanner(System.in);
        int jml = wkwk.nextInt();wkwk.nextLine();
        Queue<String> q1 = new LinkedList<String>();
        Queue<String> store = new LinkedList<String>();
        int pk = 0;
        int am = 0;
        int kpll = 0;
        int kpn = 0;
        int ktn = 0;
        int amj = 0;
        int kp = 0;
        for (int i = 0; i < jml; i++) {
            q1.add(wkwk.nextLine());
        }
        for (int i = 0; i < jml; i++) {
            switch (q1.poll()) {
                case "Pemadam Kebakaran" -> {
                    pk++;
                    break;
                }
                case "Ambulance" -> {
                    am++;
                    break;
                }
                case "Kendaraan Penolong Laka Lantas" -> {
                    kpll++;
                    break;
                }
                case "Kendaraan Pimpinan NKRI" -> {
                    kpn++;
                    break;
                }
                case "Kendaraan Tamu Negara" -> {
                    ktn++;
                    break;
                }
                case "Ambulance Jenazah" -> {
                    amj++;
                    break;
                }
                case "Kendaraan Pribadi" -> {
                    kp++;
                    break;
                }
            }
        }
        while(pk>0){
            for (int i = 0; i < pk; i++) {
                System.out.println("Pemadam Kebakaran");
                pk--;
            }
        }
        while(am>0){
            for (int i = 0; i < am; i++) {
                System.out.println("Ambulance");
                am--;
            }
        }
        while(kpll>0){
            for (int i = 0; i < kpll; i++) {
                System.out.println("Kendaraan Penolong Laka Lantas");
                kpll--;
            }
        }
        while(kpn>0){
            for (int i = 0; i < kpn; i++) {
                System.out.println("Kendaraan Pimpinan NKRI");
                kpn--;
            }
        }
        while(ktn>0){
            for (int i = 0; i < ktn; i++) {
                System.out.println("Kendaraan Tamu Negara");
                ktn--;
            }
        }
        while(amj>0){
            for (int i = 0; i < amj; i++) {
                System.out.println("Ambulance Jenazah");
                amj--;
            }
        }
        while(kp>0){
            for (int i = 0; i < kp; i++) {
                System.out.println("Kendaraan Pribadi");
                kp--;
            }
       }
    }
}
