import java.util.Scanner;

public class biggest_of_2_num {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of num 1 : ");
        int num1= scan.nextInt();
        System.out.print("Enter the value of num 2 : ");
        int num2= scan.nextInt();
        String result = (num1<num2)?"true":"false";
        if(true){
            System.out.println(num2 + " is the biggest of two numbers");
        }
        else{
            System.out.println(num1 + " is the biggest of two numbers");
        }
    }
}
