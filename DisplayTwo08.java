import java.util.Scanner;

public class DisplayTwo08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInput, i = 0;
        String s = "";

        System.out.print("input some number: ");
        numInput = sc.nextInt();

        for(i = 0; i <= numInput; i++) {
            s += "*";
            System.out.println(s);
        }

       // while (i < numInput) {
       //    s += "*";
           // System.out.println(s);
           //i++;
       // }



    }
}
