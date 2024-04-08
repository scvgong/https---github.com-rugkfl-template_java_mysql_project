package codingtestProgrammers.Lv0;
import java.util.Scanner;

public class Pythagoras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = (int)Math.pow(c,2) - (int)Math.pow(a,2);

        System.out.println(b_square);
    }    
}

/*
문제 
직각삼각형의 한 변의 길이를 나타내는 정수 a와 빗변의 길이를 나타내는 정수 c가 주어질 때, 다른 한 변의 길이의 제곱, b_square 을 출력하도록 한 줄을 수정해 코드를 완성해 주세요.
디버깅 문제, 완성된 코드에서 버그를 찾아 수정하는 문제 타입

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int c = sc.nextInt();

        int b_square = c - a;

        System.out.println(b_square);
    }
}

입출력 예1
3
5

출력 예1
16



 */