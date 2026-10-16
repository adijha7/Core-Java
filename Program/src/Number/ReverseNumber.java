package Number;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Number :- ");
    	int num=sc.nextInt();
           
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;               // get last digit
            reversed = reversed * 10 + digit;  // build reversed number
            num = num / 10;                    // remove last digit
        }

        System.out.println("Reversed number: " + reversed);
    }
}


/*

*  for example number is 1234  result 4321 
*  case 1
*     while (num != 0) {
            int digit = num % 10;  =   in this stage we get 1234%10 = 4            
            reversed = reversed * 10 + digit;     = 0*10+4=4
            num = num / 10;     1234= remove the last digit =4 
            reveresd=4
            
   
*
*case 2
*     while (num != 0)  123 !=0 true {
            int digit = num % 10;  =   in this stage we get 123%10 = 3            
            reversed = reversed * 10 + digit;     = 0*10+3=3
            num = num / 10;     123/10  = remove the last digit = 3
             reveresd=43
*
*case 3
*     while (num != 0) {
            int digit = num % 10;  =   in this stage we get 12%10 = 2          
            reversed = reversed * 10 + digit;     = 0*10+2=2
            num = num / 10;     12/10  = remove the last digit = 2
             reveresd=432
             
*
*case 3
*     while (num != 0) {
            int digit = num % 10;  =   in this stage we get 1%10 = 1       
            reversed = reversed * 10 + digit;     = 0*10+1=1
            num = num / 10;     1/10  = remove the last digit = 1
             reveresd=4321
*
*case 4
*     while (num != 0)  0!= 0 false {
            
*
*
*/

