//1. to get the value of 5 subject and all and get average. If the average is less than 35,
//    special class is needed to be printed else print you are good to go
import java.util.Scanner;

public class markAverage {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        int tamil, english, maths, science, social;
        System.out.print("Enter your tamil mark : ");
        tamil = sc.nextInt();
        System.out.print("Enter your english mark : ");
        english = sc.nextInt();
        System.out.print("Enter your maths mark : ");
        maths = sc.nextInt();
        System.out.print("Enter your science mark : ");
        science = sc.nextInt();
        System.out.print("Enter your social mark : ");
        social = sc.nextInt();
        double total = tamil+english+maths+science+social;
        double average = total/5;
        System.out.println("Your total mark is : " + total);
        System.out.println("Your average mark is : " + average);
        if(average<35){
            System.out.println("Sorry! Special class is needed!");
        }
        else{
            System.out.println("Yor are good to go! but keep practicing!");
        }
    }
}
