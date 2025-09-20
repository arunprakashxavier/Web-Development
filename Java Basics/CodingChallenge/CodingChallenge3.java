package CodingChallenge;

import java.util.Scanner;

public class CodingChallenge3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        System.out.print("Enter your age : ");
        byte age = sc.nextByte();
        sc.nextLine();
        System.out.print("Enter your address : ");
        String address = sc.nextLine();
        System.out.println("My personal details");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Address : " + address);
    }
}
