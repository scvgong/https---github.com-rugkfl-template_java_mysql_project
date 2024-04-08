package co_templates.quests;

public class ArithmeticsMain {
    public static void main(String[] args) {
        ArithmeticsInputOutput arprint = new ArithmeticsInputOutput();

        int[] numbers = arprint.inputNumber();

        arprint.outputSource(numbers);

        return;
    }
}
