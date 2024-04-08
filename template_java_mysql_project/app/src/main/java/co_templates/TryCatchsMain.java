package co_templates;

public class TryCatchsMain {
    public static void main(String[] args) {

        // try {
        // // Block of code to try
        // }
        // catch(Exception e) {
        // // Block of code to handle errors
        // }

        try {
            TryCatchSub sub = new TryCatchSub(); // 인스턴스화
            // sub.methodsSub();
            // sub.methodsSubWithParams("myeongyun",3);
            // int result = sub.methodsSubWithParamsReturn(5, 6);
            int result = sub.returnException(3);
            return;
        } catch (Exception e) {
            // Block of code to handle errors
            System.out.println("catch (Exception e)");
        }
        return ;
    }
}
