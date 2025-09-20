/* function program to return your name& phone number
*/
package function;

public class GetName {
    String getName() {
        return "Arun";
    }

    String getPhone() {
        return "9080890020";
    }
    String getAddress(){
        return "Chennai";
    }

    public static void main(String[] args) {
        GetName object1 = new GetName();
        String myName = object1.getName();
        System.out.println("Your name is : " + myName);
        String myNumber = object1.getPhone();
        System.out.println("Your number is : " + myNumber);
        String myAddress = object1.getAddress();
        System.out.println("Your address is : " + myAddress);
    }
}