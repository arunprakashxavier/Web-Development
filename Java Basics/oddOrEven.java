import java.util.Scanner;

public class oddOrEven {
    public static void main(String[] args){
        try(Scanner sc =  new Scanner(System.in))
        {
            System.out.print("Enter an integer : ");
            if(sc.hasNextInt()){
                int num = sc.nextInt();
                String result = (num%2 == 0) ? "Even" : "Odd";
                System.out.println("The number " + num + " is an " + result + "number");
            }
            else{
                System.out.println("Invalid input! Please enter an integer");
            }

        }
    }
}
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number : ");
//        int num = sc.nextInt();
//        {
//            if(num%2 == 0){
//                System.out.println("The number is Even!");
//            }
//            else{
//                System.out.println("The number is Odd!");
//            }
//        }
//    }
//}
