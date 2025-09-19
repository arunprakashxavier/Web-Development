////print even numbers between a range of values
import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of range 1 : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of range 2 : ");
        int b = sc.nextInt();
        int i;
        int count = 0, c=0;

        for(i=a;i<=b;i++){
            if(i%2==0){
//                System.out.println("Even number : "+ i);
            }
            else{
                count = ++c;
                System.out.println("Odd number : "+ i);
            }
        }System.out.println("number of off numbers : " + count);
    }
}

//```BOTH THE METHODS CAN BE USED```

//import java.util.Scanner;
//
//public class Assignment8 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the value of range 1 : ");
//        int a = sc.nextInt();
//        System.out.print("Enter the value of range 2 : ");
//        int b = sc.nextInt();
//        int i;
//        for(i=a;i<=(b/2);i++){
//            System.out.println(a*2);
//            a=a+1;
//        }
//    }
//}

