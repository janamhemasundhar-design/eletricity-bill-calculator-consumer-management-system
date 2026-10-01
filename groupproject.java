import java.util.Scanner;

public class groupproject {

    static double calculateBill(int units) {
        double bill;

        if (units <= 100) {
            bill = units * 2;
        } 
        else if (units <= 200) {
            bill = 100 * 2 + (units - 100) * 3;
        } 
        else if (units <= 300) {
            bill = 100 * 2 + 100 * 3 + (units - 200) * 5;
        } 
        else {
            bill = 100 * 2 + 100 * 3 + 100 * 5
                    + (units - 300) * 7;
        }

        return bill;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        int consumerNumber;
        int units;
        double bill;

        System.out.print("Enter customer name: ");
        name = sc.nextLine();

        System.out.print("Enter consumer number: ");
        consumerNumber = sc.nextInt();

        System.out.print("Enter units consumed: ");
        units = sc.nextInt();

        bill = calculateBill(units);

        System.out.println("\n----- ELECTRICITY BILL -----");
        System.out.println("Customer Name: " + name);
        System.out.println("Consumer Number: " + consumerNumber);
        System.out.println("Units Consumed: " + units);
        System.out.println("Total Bill: Rs. " + bill);

        sc.close();
    }
}