package function;

public class Function   {
    static void demo(){
        System.out.println("This is demo");

    }
    void dummy() {
        System.out.println("This is dummy");
    }

    public static void main(String[] args) {
        Function object1 = new Function();
        object1.demo();
        object1.dummy();
    }
}
