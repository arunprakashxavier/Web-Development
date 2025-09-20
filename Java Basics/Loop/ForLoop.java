package Loop;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many time dou you want to print your name? ");
        int a = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your name : ");
        String name = sc.nextLine();
        int i;
        for(i=0;i<a;i++){
            System.out.println(name);
        }
    }
}
