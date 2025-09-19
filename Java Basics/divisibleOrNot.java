import java.util.Scanner;

public class divisibleOrNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int a = sc.nextInt();
        if( (a%3 == 0) && (a%5 == 0)){
            System.out.println(a + " is divisible by both 3 & 5");
        }
        else if((a%3 != 0) && (a%5 == 0)){
            System.out.println(a + " is divisible by 5");
        }
        else if((a%3 == 0) && (a%5 != 0)){
            System.out.println(a + " is divisible by 3 only");
        }
        else{
            System.out.println(a+ " is not divisible by both 3 & 5");
        }
    }
}
