import java.util.Scanner;

public class ForMultiples08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiple, sum = 0, counter = 0;

        System.out.print("input the multiple: ");
        multiple = sc.nextInt();

        for(int i=1; i<= 50; i++) {
            if(i % multiple == 0) {
                sum = sum + i;
                counter++;
            }
            
        }
        System.out.printf("There are %d number that are multiple of %d in range 1 to 50\n",counter,multiple);
         System.out.printf("The sum of all multiples of %d in range 1 to 50 is %d\n",multiple,sum);
    }
}