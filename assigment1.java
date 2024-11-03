import java.util.Scanner;

public class assigment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numInput, i, j ;
        String s = "";

        System.out.print("input some number: ");
        numInput = sc.nextInt();

        for(i = numInput; i > 0; i--) {
            s = "";
            for(j = 0; j < i; j++) {
                s += "*";
            }
            
            System.out.println(s);
        }

       // while (i < numInput) {
       //    s += "*";
           // System.out.println(s);
           //i++;
       // }



    }
}

