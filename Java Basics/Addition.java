/*
        Addition through calling function
 */

import java.util.Scanner;

public class Addition {
    void sum(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {
        Addition object1 = new Addition();
        object1.sum();
    }
}
