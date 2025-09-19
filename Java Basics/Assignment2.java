//Asks the user for:
//1. Name
//2. Age
//3. Favorite Color
//4. Whether they are a student (true/false)

import java.util.Scanner;

public class Assignment2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();
        System.out.print("Please enter your age : ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Please enter your favourite color : ");
        String favColor = sc.nextLine();
        System.out.print("Are you a student (true/false) : ");
        boolean isStudent = sc.nextBoolean();
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Favourite color : " + favColor);
        {
            if (isStudent == true) {
                System.out.print("Am i a student : YES");
            } else {
                System.out.print("Am i a student : NO");
            }
        }
    }

}