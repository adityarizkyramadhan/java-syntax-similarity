import java.util.Scanner;

public class Playground{
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        char[][] array = new char [10][10];
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array[i].length; j++){
                array[i][j] = a.next().charAt(0);
            }
        }
        int tc = a.nextInt();
        for (int i=0; i<tc; i++) {
            int x, y;
            x = a.nextInt();
            y = a.nextInt();
            if (x<0||x>10||y<0||y>10) {
                System.out.println("Tidak terjangkau");
                continue;
            }if (Character.compare(array[x][y], 'k') == 0) {
                System.out.println("Meleset");
            }
            else {
                if (Character.compare(array[x][y], 't') == 0) {
                    System.out.println("Terkena tank");
                }else if (Character.compare(array[x][y], 'a') == 0) {
                    System.out.println("Terkena altileri");
                }else if (Character.compare(array[x][y], 'p') == 0) {
                    System.out.println("Terkena personel");
                }
            }
        }
    }
}
