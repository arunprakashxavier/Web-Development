import java.util.Scanner;
import java.util.Arrays;
public class Array {
    public static void main(String[] args){
        int[] num = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array value");
        num[0] = sc.nextInt();
        num[1] = sc.nextInt();
        num[2] = sc.nextInt();
        num[3] = sc.nextInt();
        num[4] = sc.nextInt();
        int i;
        for(i=0;i<num.length;i++){
            System.out.print("The value of the array num is : ");
            System.out.println(num[i]);
        }
                System.out.println(Arrays.toString(num));
                sc.close();

    }
}

