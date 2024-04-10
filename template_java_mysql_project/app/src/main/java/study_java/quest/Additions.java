package study_java.quest;
// 외부 입력 
import java.util.Scanner;
public class Additions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("intFirst : ");
        int intFirst = scanner.nextInt();
        System.out.print("intSecond : ");
        int intSecond = scanner.nextInt();
        int add = intFirst + intSecond;

        System.out.println("두 정수의 합 = " + add);

        scanner.close();
    }
}
