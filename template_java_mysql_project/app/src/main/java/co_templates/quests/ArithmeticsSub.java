package co_templates.quests;


public class ArithmeticsSub {

    public int add(int inFirst, int inSecond){
        
        int result = 0;

        try {
            result = inFirst + inSecond;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    public int subtraction(int inFirst, int inSecond){
        int result = 0;

        try {
            result = inFirst - inSecond;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    public int multiplication(int inFirst, int inSecond){
        int result = 0;

        try {
            result = inFirst * inSecond;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    public int division(int inFirst, int inSecond){
        int result = 0;

        try {
            result = inFirst / inSecond;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    public int remain(int inFirst, int inSecond){
        int result = 0;

        try {
            result = inFirst % inSecond;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    
}
