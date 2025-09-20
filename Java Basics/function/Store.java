package function;

public class Store {
    void iceCream(int money){
        System.out.println("Amount spent : " + money);
        System.out.println("Ice-Cream purchased!");
    }
    void chocolate(int money){
        System.out.println("Amount spent : " + money);
        System.out.println("Chocolate purchased!");
    }

    public static void main(String[] args) {
        Store object1 = new Store();
        object1.iceCream(60);
        object1.chocolate(100);
    }
}
