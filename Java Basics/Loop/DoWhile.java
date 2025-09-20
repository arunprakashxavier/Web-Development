package Loop;/*
*   In do while loop, the loop will be executed at least for once even if the condition is evaluated to false
*   SYNTAX :      do{
                       }while(condition);
 */

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numb;
        do{
            System.out.print("Enter a number > 10 : ");
            numb = sc.nextInt();
        }while(numb<=10);
        System.out.println("Number greater than 10 is successfully entered!!!!!");
    }
}
