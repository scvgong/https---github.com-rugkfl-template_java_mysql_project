package study_java.quest;
import java.util.ArrayList;
import java.util.Scanner;

public class PollsWithoutDB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList movieName = new ArrayList<>();
        movieName.add("1. 인터스텔라 선호도");
        movieName.add("2. 해리포터");
        movieName.add("3. 반지의 제왕");

        ArrayList<String> listAnswer = new ArrayList<String>();

        for(int i = 0 ; i < movieName.size() ; i++){
            
            System.out.println(movieName.get(i));
            System.out.println("1) 좋음 2) 중간 3) 나쁨");
            String answer = sc.nextLine();
            System.out.println("답하기 : " + answer);
            listAnswer.add(answer);
        }
        System.out.println("답한 내용 : " + listAnswer.get(0) + "," + listAnswer.get(1) + "," + listAnswer.get(2));
    }
}