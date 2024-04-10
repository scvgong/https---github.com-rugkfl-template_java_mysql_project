// refer : https://www.w3schools.com/java/java_arraylist.asp
package study_java;
import java.util.ArrayList;

public class DataTypeArrayLists {
    public static void main(String[] args) {
        ArrayList listFirst = new ArrayList<>();
        listFirst.add("Volvo");
        listFirst.add("BMW");
        listFirst.add("Ford");

        // listFirst.get(1)
        // "BMW"
        // listFirst.get(3)
        // IndexOutOfBoundsException@36 "java.lang.IndexOutOfBoundsException: Index 3 out of bounds for length 3"

        // listFirst.size()
        // 3

        // listFirst.remove(1)
        // "BMW"
        // listFirst.size()
        // 2

        System.out.println("Hello World!");
       // return 0; 
    }
}