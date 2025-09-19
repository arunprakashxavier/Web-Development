import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your salary : ");
        int income = sc.nextInt();
        if(income > 10000){
            System.out.println("Sorry! you are not eligible for scholarship!");
        }
        else{
            System.out.println("Congrats! you are eligible for scholarship!");
        }
    }
}
