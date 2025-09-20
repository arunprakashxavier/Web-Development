package function;

public class Calc {
    void add(int a,int b){
        System.out.println("sum = "+ (a+b));
    }
    void sub(int a,int b){
        System.out.println("difference = " + (a-b));
    }
    void div(int a,int b){
        System.out.println("division = " + (a/b));
    }
    void mul(int a,int b){
        System.out.println("multiplication = " + (a*b));
    }
    public static void main(String[] args){
        Calc object1 = new Calc();
        object1.add(5,6);
        object1.sub(5,9);
        object1.div(50,10);
        object1.mul(5,6);
    }
}
