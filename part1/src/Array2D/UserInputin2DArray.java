package Array2D;

import java.util.Scanner;

public class UserInputin2DArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Rows Size :- ");
        int a = sc.nextInt();

        System.out.println("Enter The Column Size :- ");
        int b = sc.nextInt();

        int[][] arr = new int[a][b];

        // Taking input
        System.out.println("Enter the array elements:");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing the array
        System.out.println("The 2D Array is:");

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}