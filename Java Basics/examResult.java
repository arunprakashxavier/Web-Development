//1. To check whether the value is an integer value or any other value like string
//2. to check whether the input is between 0 and 100
import java.util.Scanner;

public class examResult {
   public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int mark;
       while(true){
           System.out.print("Please enter your mark : ");
           if(sc.hasNextInt()){
                mark = sc.nextInt();
                if((mark>=0)&&(mark<=100)) {
                    if ((mark >= 0) && (mark <= 35)) {
                        System.out.println("your Need more improvements!");
                    } else if ((mark > 35) && (mark <= 70)) {
                        System.out.println("Good job!");
                    } else if ((mark > 70) && (mark < 101)) {
                        System.out.println("Excellent Work!");
                    }
                    break;
                }
                else{
                    System.out.println("Please enter a valid mark(1-100)!");
                }

           }
           else{
               System.out.println("Enter a valid integer value(1-100)");
               sc.next();
           }
       }


   }
}




