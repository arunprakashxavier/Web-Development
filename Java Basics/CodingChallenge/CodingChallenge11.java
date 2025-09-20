/*
*   To find  a number entered by user is EVEN or ODD through function and to return the value to main function to print the value
*/

package CodingChallenge;
import java.util.Scanner;

public class CodingChallenge11 {
        String EvenOrOdd(int num){
            if(num%2 == 0){
                return "EVEN";
            }
            else{
                return "ODD";
            }
        }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a number to find odd or even : ");
        int number = sc.nextInt();
        CodingChallenge11 object1 = new CodingChallenge11();
        String result = object1.EvenOrOdd(number);
        System.out.println("Your number is an " + result + " number");
    }
}
