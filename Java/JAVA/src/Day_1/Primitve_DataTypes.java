package Day_1;

public class Primitve_DataTypes {
    public static void main(String[] args){
        System.out.println("\t\t\t\t\tJAVA PRIMITIVE DATA TYPES, SIZE & RANGE");
        System.out.println("--- Integer Types ---");
        System.out.println("* Byte : " + Byte.SIZE + " Bits OR " +Byte.BYTES +" Byte : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("* Short : " + Short.SIZE + " Bits : "  + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("* Int : " + Integer.SIZE + " Bits : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("* Long : " + Long.SIZE + " Bits : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println();
        System.out.println("--- Decimal & Character Types --- :");
        System.out.println("* Float : " + Float.SIZE + " Bits : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("* Double : " + Double.SIZE + " Bits : " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("* Char :" + Character.SIZE + " Bits : " +(int)Character.MIN_VALUE + " to " +(int)Character.MAX_VALUE);
        System.out.println();
        System.out.println("--- Boolean Type ---");
        System.out.println("* Boolean : " + Boolean.FALSE + " OR " + Boolean.TRUE);
        System.out.println("Here, a boolean logically takes 1 bit, but in java its storage size is JVM-dependent.\nTypically it is stored as 1 byte in arrays! ");
    }
}
