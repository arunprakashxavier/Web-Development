import java.util.Scanner;

public class trafficLight{
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        while(true){
            System.out.print("Enter the color of the traffic light : ");
            String color = sc.nextLine().toLowerCase();
            if(color.equals("red")){
                System.out.println("STOP!!!");
//                break;
            }
            else if(color.equals("yellow")){
                System.out.println("GET READY!!!");
//                break;
            }
            else if(color.equals("green")){
                System.out.println("GO!!!!!!!!!");
//                break;
            }
            else {
                System.out.println("Please enter the correct color(red/yellow/green)");
            }
        }

    }
}