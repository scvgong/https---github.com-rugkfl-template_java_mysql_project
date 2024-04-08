package co_templates.quests;

public class AdditionsMain {
    public static void main(String[] args) {
       AdditionsSub addSub = new AdditionsSub();
       int result = addSub.additions();
       System.out.println("두 정수의 합 : " + result);
    }
}
