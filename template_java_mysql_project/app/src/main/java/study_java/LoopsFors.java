// refer : https://www.w3schools.com/java/java_for_loop.asp
package study_java;
import java.util.ArrayList;

public class LoopsFors {
    public static void main(String[] args) {

        /*
            for 동작 위한 조건 : 시작점, 반복횟수, 종료조건
            statment 1 : 시작점
            statment 2 : 종료 조건
            statment 3 : 반복 횟수
        for (statment 1 ; statment 2 ; statment 3){
        }   
        */

        ArrayList<String> listFirst = new ArrayList<String>();
        listFirst.add("Volvo");
        listFirst.add("BMW");
        listFirst.add("Ford");
        
        for(int i = 0 ; i < listFirst.size() ; i++){
            System.out.println("for count " + listFirst.get(i));
        }

        for(String str : listFirst) {
            System.out.println("for each :" + str);
        }

        /*
         예제 1 부터 5까지 1씩증가하며 출력하는것
        */

        for(int count = 1 ; count <= 5 ; count++){
            System.out.println("For count : " + count);
        }

        String strFirst = new String("Hello World");
        // for (type variableName : arrayName) {
        // code block to be executed
        // }
          
    }
}