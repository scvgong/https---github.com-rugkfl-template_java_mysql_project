package co_templates;

import java.util.ArrayList;

public class TryCatchSub {
    // 접근자 리턴 메소드이름(파라메터) {
    //      return 0;
    //} -> 기본 구조

    public void MethodsSub() {
        System.out.println("MethoidsSub - methodsSub()");
    }

    public void methodsSub() {
        System.out.println("MethoidsSub - methodsSub()");
    }

    // with params
    public void methodsSubWithParams(String fname, int count){
        System.out.println("MethodsSub - methodsSubWithParams(String fName)");
        System.out.println("params : fname-" + fname);
        return ;
    }

    // with params
    public int methodsSubWithParamsReturn(int firstNumber, int secondNumber){
        int resultNumber = 0;
        try {
            // Block of code to try
            System.out.println("MethodsSub - methodsSubWithParams(int firstNumber, int secondNumber)");
            System.out.println("params : firstNumber-" + firstNumber + ", secondNumber-"+secondNumber);
            resultNumber = firstNumber + secondNumber;
        } catch(Exception e) {
            // Block of code to handle errors
            System.out.println("catch(Exception e)");
        }
        
        return resultNumber;
    } 

    public int returnException(int fisrtNumber){
        ArrayList<Integer> myNumbers = new ArrayList<Integer>(); 
        myNumbers.add(1);
        myNumbers.add(2);
        myNumbers.add(3);

        int result = 0;

        try {
            System.out.println(myNumbers.get(10));
            result = myNumbers.get(10);
        } catch(Exception e) {
            System.out.println("catch(Exception e) : " + e.getMessage()); //e.getMessage() -> error 메세지 출력
            result = myNumbers.get(0);
        }
        return result;
    }
}
