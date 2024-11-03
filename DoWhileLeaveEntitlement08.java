import java.util.Scanner;

public class DoWhileLeaveEntitlement08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  leaveEntitlement , numLeave;
        String confirmation;

        System.out.print ("input The Number of Leave Entitlement: ");
        leaveEntitlement = sc.nextInt();

        do {
            System.out.print("do you want to take a leave (y/n)? ");
            confirmation = sc.next();

            if (confirmation.equalsIgnoreCase("y")) {
                System.out.print("How many day(s)?");
                numLeave = sc.nextInt();
                
              //  while (numLeave > leaveEntitlement) {
                //    System.out.println(" You don't have enough leave entitlement.please enter a valid  number of days. ");
                  //  System.out.print("How many day(s)?");
                    //numLeave = sc.nextInt();
               // }

                leaveEntitlement -= numLeave;
                System.out.println("Remaining leave entitlement:" + leaveEntitlement);

                if(numLeave <= leaveEntitlement) {
                    leaveEntitlement -= numLeave;
                    System.out.println("Remaining leave entitlement:" + leaveEntitlement);
                } else if (confirmation.equalsIgnoreCase("t")) {
                    break;
                }
                } else {
                    break;
                }
            
        } while(leaveEntitlement > 0);


        
    }
}
    

