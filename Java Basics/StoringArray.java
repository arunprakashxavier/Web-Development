import java.util.Scanner;
import java.util.Arrays;

public class StoringArray {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number of subjects : ");
        int a = sc.nextInt();
        System.out.println("Enter each marks");
        int[] mark = new int[a];
        for(int i=0;i<a;i++){
            mark[i] = sc.nextInt();
        }
        System.out.println("Your marks are " + Arrays.toString(mark));
        int total=0;
        for(int i=0;i<a;i++){
            total=total+mark[i];
        }
        double avg = total/a;
        System.out.println("Your total is : " + total);
        System.out.println("Your average is : "+ avg);
    }
}
