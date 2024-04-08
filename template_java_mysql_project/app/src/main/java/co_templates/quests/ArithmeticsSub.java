package co_templates.quests;

import java.util.ArrayList;
import java.util.Scanner;

public class ArithmeticsSub {

    public int add(int inFirst, int inSecond){
        
        int result = 0;

        try {
            System.out.print("두 정수의 합 : ");
            result = inFirst + inSecond;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    public int subtraction(int inFirst, int inSecond){
        int result = 0;

        try {
            System.out.print("두 정수의 합 : ");
            result = inFirst - inSecond;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    // public int multiplication(){

    // }

    // public int division(){

    // }

    // public int remain(){

    // }

    
}
