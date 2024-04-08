package co_templates.quests;

import java.util.Scanner;

public class AdditionsSub {
    public void additions(){
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
