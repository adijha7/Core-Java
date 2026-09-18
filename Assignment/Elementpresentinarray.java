package Assignment;

import java.util.Scanner;

public class Elementpresentinarray {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Element: ");
        int a = sc.nextInt();

        boolean found = false;  // flag to track presence

        for (int i = 0; i < arr.length; i++) {
            if (a == arr[i]) {
                found = true;
                break;  // stop searching once found
            }
        }

        if (found) {
            System.out.println("The Element is Present: " + a);
        } else {
            System.out.println("The Element is Not Present");
        }
    }
}
