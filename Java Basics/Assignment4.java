import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();
        int d = a*b*c;
        float e = a+b+c;
        e = e/e;
        System.out.println("The multiplication of the three is " + d );
        System.out.println("The division of the sum of three numbers is " + e);
    }
}
