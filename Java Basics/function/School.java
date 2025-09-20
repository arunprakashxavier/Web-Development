package function;
import java.util.Scanner;

public class School {
    String PassOrFail(int score){
        if(score>=35){
            return "PASS";
        }
        else{
            return "FAIL";
        }
    }
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter your mark : ");
        int mark = sc.nextInt();
        School object1 = new School();
        String result = object1.PassOrFail(mark);
        System.out.println(result);
    }
}
