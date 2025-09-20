/*
Syntax to create object
    ClassName objectName = New className()
 */

public class classNobject {
    String name = " ";
    char grade = ' ';
    int total = 0;
    boolean isPassed = true;
    public static void main(String[] args0){
        classNobject student1 = new classNobject();
        student1.name = "Arun";
        student1.grade = 'o';
        student1.total = 453;
        student1.isPassed = true;
        System.out.println(student1.name);
        classNobject student2 = new classNobject();
        student2.name = "Priya";
        student2.grade = 'o';
        student2.total = 490;
        student2.isPassed = true;
        System.out.println(student2.name);
    }


}
