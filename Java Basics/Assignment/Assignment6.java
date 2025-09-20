package Assignment;//Check whether numb1 and numb2 are equal
import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] Args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of number 1 : ");
        int numb1 = sc.nextInt();
        System.out.print("Enter the value of number 2 : ");
        int numb2 = sc.nextInt();
        if(numb1 == numb2){
            System.out.println("both the numbers are equal");}
        else{
            System.out.println("both the numbers are not equal");
            }
        }
    }
