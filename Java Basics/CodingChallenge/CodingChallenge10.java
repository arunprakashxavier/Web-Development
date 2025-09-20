/*
    ```Fuction program to do sum and return the value to the main function to print the result
 */


package CodingChallenge;

public class CodingChallenge10 {
    int sum(int a, int b){
        int add = (a+b);
        return add;
    }
    public static void main(String[] args0){
        CodingChallenge10 object1 = new CodingChallenge10();
        int result = object1.sum(6,6);
        System.out.println("Sum of two numbers is : " + result);
    }
}
