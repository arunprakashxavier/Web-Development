import java.util.Scanner;

public class passOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your  mark : ");
        int mark = sc.nextInt();
        if(mark<35){
            System.out.println("fail");
        }
        else{
            System.out.println("pass");
        }
    }
}

