package co_templates;

public class MethodsSub {
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
        System.out.println("MethodsSub - methodsSubWithParams(int firstNumber, int secondNumber)");
        System.out.println("params : firstNumber-" + firstNumber + ", secondNumber-"+secondNumber);
        int resultNumber = firstNumber + secondNumber;
        return resultNumber;
    } 
}
