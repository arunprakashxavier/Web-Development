package CodingChallenge;//print a range of values eg 1 to 10

import java.util.Scanner;

public class CodingChallenge7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the range!");
        System.out.print("Enter range 1 : ");
        a = sc.nextInt();
        System.out.print("Enter range 2 : ");
        b = sc.nextInt();
        int i;
        for(i=a;i<=b;i++){
            System.out.print(i +" ");
        }
    }
}
