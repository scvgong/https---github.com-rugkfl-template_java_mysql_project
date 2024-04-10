package study_java.quest;

import java.util.Scanner;

public class Forslfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        for(int i = 1 ; i <= number ; i++ ){
            int result = (int)Math.pow(2, i);

            if(result % 8 == 0){
                System.out.println("2 ** " + i + "= " + result );
            }
            else{
                System.out.println("8의 배수 아님");
            }
                        
        }
        sc.close();
    }
}