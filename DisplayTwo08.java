
import java.util.Scanner;

public class DisplayTwo08 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int numInput;

     System.out.print("input some number: ");
     numInput = sc.nextInt();

     for(int i = 1; i <= numInput; i++) {
        if(i % 2 == 0) {
            System.out.println("2 multiple:" +i);
        }
    }
}
}