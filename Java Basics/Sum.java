import java.lang.System;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        float b = sc.nextFloat();
        double c = sc.nextDouble();
        sc.nextLine();
        String funct = sc.nextLine();
        double d = a+b+c;
        System.out.println("The function used here is : " + funct);
        System.out.println("The " + funct + " of three numbers is " + d);
    }
}
