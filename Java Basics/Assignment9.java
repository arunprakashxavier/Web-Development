//```print numbers divisible by number 3&5```
import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of range 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of range 2 : ");
        int b = sc.nextInt();
        int i;
        for(i=a;(i<=b);i++){
            if((i%3==0)&&(i%5==0)){
                System.out.println(i);
            }
        }
    }
}
