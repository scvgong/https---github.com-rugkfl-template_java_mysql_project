package co_templates;

public class MethodsMain {
    public static void main(String[] args) {
        MethodsSub sub = new MethodsSub(); // 인스턴스화
        // sub.methodsSub();
        // sub.methodsSubWithParams("myeongyun",3);
        int result = sub.methodsSubWithParamsReturn(5, 6);
        return ;
    }
}
