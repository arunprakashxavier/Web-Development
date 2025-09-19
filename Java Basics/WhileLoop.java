//printing 5 among the random numbers using while loop
// Whileloop and for loop works the same except that while loop will be used when you don't know about the iteration and
// in for loop you will be knowing the loop iteration.
import java.util.Random;

public class  WhileLoop{
    public static void main(String[] args){
        Random rand = new Random();
        int newNum = 0;
        while(newNum!=5){
            newNum = rand.nextInt(10);
            System.out.println(newNum);
        }
    }
}
