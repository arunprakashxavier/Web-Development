import java.sql.SQLOutput;

public class stringComparision {
    public static void main(String[] args){
        String a = "apple";
        String b = "apple";
        String c = "Apple";
        String f1 = new String("banana");
        String f2 = new String("banana");
        System.out.println(a==b);
        System.out.println(b==c);
        System.out.println(f1==f2);
        System.out.println(f1.equals(f2));
        System.out.println(a.equals(c));
    }
}

/*                                       ```What happened here?```
    * Here, while declaring string values, in this case the value of string a and b  are equal so it won't create
multiple apple inside the string pool, but it will crate a single value apple which will have a reference or address
which is shared by both a and b.
    * string c having value Apple is different from and b so a different entry is made inside the same string pool which
will be holding a different address or reference.
    * in line 8 & 9, this is similar to normal string declaration except that in line 8 the string value is stored in the
object inside the heap and in line 9 a different object will be created and stores the value apple inside the HEAP
i.e, 2 different objects are created which stores the value banana separately therefore both have different reference value
    * so basically in the above point, it is clear that java looks for the reference only, now how to check the value
no matter what the reference is, line 13 is used to check the string value and not the reference
    * in line 14 same method is used in line 13 and checks whether apple and Apple are equal or not, but the result is
false, Since Apple != apple.

 */