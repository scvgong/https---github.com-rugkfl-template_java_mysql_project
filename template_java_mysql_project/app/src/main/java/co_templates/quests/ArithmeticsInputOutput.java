package co_templates.quests;

import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticsInputOutput {

    public void outputSource(){
        ArithmeticsSub arsub = new ArithmeticsSub();
        int[] getNumber = inputNumber();
        System.out.println("두 정수의 합 : " + arsub.add(getNumber[0], getNumber[1]));
     
    }
    
    public int[] inputNumber(){
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[2];

        try {
            System.out.print("첫 번째 정수 입력 : ");
            // numbers[0] = sc.nextInt();
            numbers[0] = 2;
            System.out.print("두 번째 정수 입력 : ");
            // numbers[1] = sc.nextInt();
            numbers[1] = 5;
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("잘못된 입력입니다.");       
        }
        sc.close();
        return numbers;
    }

    
}
