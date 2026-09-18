package Assignment;

public class FindFourthMaximumvalue {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50, 60, 70, 80};

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int max4 = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max1) {
                max4 = max3;
                max3 = max2;
                max2 = max1;
                max1 = arr[i];
            }

            else if (arr[i] > max2 && arr[i] != max1) {
                max4 = max3;
                max3 = max2;
                max2 = arr[i];
            }

            else if (arr[i] > max3 && arr[i] != max1 && arr[i] != max2) {
                max4 = max3;
                max3 = arr[i];
            }

            else if (arr[i] > max4 && arr[i] != max1 && arr[i] != max2 && arr[i] != max3) {
                max4 = arr[i];
            }
        }
        

        System.out.println("Thirth Maximum =" +max3);
        System.out.println("Fourth Maximum = " + max4);
    }
}
