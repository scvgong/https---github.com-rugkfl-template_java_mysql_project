package study_java.quest;
import java.util.Scanner;

public class WhilesIfsBreak {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        while(true){
            
            System.out.println("점수를 입력 하세요 ");
            int score = sc.nextInt();

            if(score >= 90){
                System.out.println("A");
            }
            else if(score >= 80){
                System.out.println("B");
            }
            else if(score >= 70){
                System.out.println("C");
            }
            else {
                System.out.println("F");
            }

            if(score == -1){
                break;
            }
            
        }
    }
}