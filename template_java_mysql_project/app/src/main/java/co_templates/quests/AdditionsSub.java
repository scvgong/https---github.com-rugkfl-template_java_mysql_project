package co_templates.quests;

import java.util.Scanner;

public class AdditionsSub {
    public int additions(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("intFirst : ");
        int intFirst = scanner.nextInt();
        System.out.print("intSecond : ");
        int intSecond = scanner.nextInt();

        System.out.println("intFirst : " + intFirst + " intSecond : " + intSecond);

        int result = intFirst + intSecond;

        scanner.close();

        return result;
    }
     
}
