package forloop;

import java.util.Scanner;

public class CountnooDigits {
    // to count number of digits
    public static void data(int num) {
        int count = 0;
        while (num != 0) {
            num = num / 10; 
            count++;
        }
        System.out.println("Number of digits: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num = sc.nextInt();

        data(num);
    }
}
