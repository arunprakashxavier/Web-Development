package function;/*
This is to practice function
 */

import java.util.Scanner;

public class Garden {
    void total_money(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of apples you have : ");
        int apple_count = sc.nextInt();
        System.out.println("Enter the price for each apple : ");
        double apple_price = sc.nextDouble();
        double total_amount = apple_count * apple_price;
        System.out.println("The total amount you can earn through selling apple is : " + total_amount + " Rs");
    }

    public static void main(String[] args) {
        Garden object1 = new Garden();
        object1.total_money();
    }

}
