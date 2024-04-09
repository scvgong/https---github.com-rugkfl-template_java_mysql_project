package co_templates.quests;


public class EncapsulationSub {
    private int inFirst, inSecond;
    private int result;

    public void setInFirst(int inFirst){
        this.inFirst = inFirst;
    }

    public int getInFirst(){
        return this.inFirst;
    }

    public void setInSecond(int inSecond){
        this.inSecond = inSecond;
    }

    public int getInSecond(){
        return this.inSecond;
    }

    public void setResult(int result){
        this.result = result;
    }

    public int getResult(){
        return result;
    }
    
    public int division(int inFirst, int inSecond){
        int result = 0;
        try {
            result = inFirst / inSecond;
        } catch (Exception e) {
            System.out.println("0으로 나눌수 없습니다.");
            
        }
        return result;
    }

    public int remain(int inFirst, int inSecond){
        int result = 0;

        try {
            result = inFirst % inSecond;
        } catch (Exception e) {
            System.out.println("0으로 나머지 값을 구할수 없습니다.");
        }

        return result;
    }

    
}
