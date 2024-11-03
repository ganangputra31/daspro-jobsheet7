import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tickets, totalticket = 0, ticketprice = 50000;
        double totalticketsold = 0, totalsalesprice;

        do {
            System.out.print("Enter Number Tickets: ");
            tickets = sc.nextInt();
            if (tickets < 0) {
                System.out.println("Number Tickets invalid ");
                continue;
            }

            if (tickets == 0) {
                break;
            }

            totalsalesprice = tickets * ticketprice;

            if (tickets > 10) {
                totalsalesprice = totalsalesprice - (totalsalesprice * 15 / 100);
            } else if (tickets > 4) {
                totalsalesprice = totalsalesprice - (totalsalesprice * 10 / 100);  
            }
            
            totalticket += tickets;
            totalticketsold += totalsalesprice;
            System.out.println("Total price after Discount: " + totalsalesprice);

        } while (true);
        System.out.println(" Total Tickets: " + totalticket);
        System.out.println(" Total sales price:  " + totalticketsold);
    

    }
}
