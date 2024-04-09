package co_templates.quests;

public class EncapsulationMain {
    public static void main(String[] args) {
        EncapsulationInputOutput enio = new EncapsulationInputOutput();
        int[] numbers = enio.inputNumber();

        enio.outputSource(numbers);

        return;
    }
}
