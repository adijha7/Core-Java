
package ManyToOne;

import java.util.Scanner;

public class CustomerDriver {

    static {
        System.out.println("Welcome Customer");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Customer Id: ");
        int a = sc.nextInt();

        System.out.println("Enter Customer Name: ");
        String b = sc.next();

        System.out.println("Enter Customer Gender: ");
        String c = sc.next();

        System.out.println("Enter Customer Address: ");
        String d = sc.next();

        System.out.println("Enter Customer Contact No: ");
        long e = sc.nextLong();

        System.out.println("How Many Orders?");
        int n = sc.nextInt();

        Order[] orders = new Order[n];

        for (int i = 0; i < n; i++) {

            System.out.println("Enter Order " + (i + 1) + " Details");

            System.out.println("Order Id: ");
            int oid = sc.nextInt();

            System.out.println("Order Name: ");
            String oname = sc.next();

            System.out.println("Order Price: ");
            int price = sc.nextInt();

            System.out.println("Order Quantity: ");
            int qty = sc.nextInt();

            orders[i] = new Order(oid, oname, price, qty);

            System.out.println("Order is Prepared");
        }

        Customer cu = new Customer(a, b, c, d, e, orders);
System.out.println();
System.out.println("-------------------Customer Details----------------------");
        cu.display_data();

        sc.close();
    }
}
