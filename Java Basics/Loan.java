import java.util.Scanner;

public class Loan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary, age, loan;
        System.out.print("Enter your age : ");
        age = sc.nextInt();
        System.out.print("Enter your salary : ");
        salary = sc.nextInt();
        if (age <= 25 || salary >= 20000) {
            while (true) {
            System.out.print("Enter your loan amount");
            int loanAmount = sc.nextInt();
                if (loanAmount <= 50000 && loanAmount >= 0) {
                    System.out.println("Congratulations! you are eligible for the loan");
                } else {
                    System.out.println("Sorry the maximum loan amount is 50000 only");
                }
                sc.next();
            }
            }
         else{
                System.out.println("sorry! You are not eligible for the loan");
            }
        }

}
