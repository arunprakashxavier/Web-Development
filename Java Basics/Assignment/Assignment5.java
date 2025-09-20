package Assignment;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your name : ");
        String name = sc.nextLine();
        int score = -1;
        while(score<0 || score > 100) {
            System.out.print("Please enter your score : ");
            score = sc.nextInt();
        }
        double cgpa = score/10.0;
        sc.nextLine();
        System.out.print("Please enter your department : ");
        String dept = sc.nextLine();
        System.out.println("Name : " + name);
        System.out.println("Department : " + dept);
        System.out.println("CGPA : " + cgpa);
        }
    }

