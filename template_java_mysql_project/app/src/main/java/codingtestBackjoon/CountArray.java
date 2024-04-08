package codingtestBackjoon;

import java.util.Scanner;

public class CountArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;          // 입력한 정수와 같은 정수의 갯수
        int n = sc.nextInt();   // 입력할 정수의 총 갯수
        int[] arr = new int[n]; // arr라는 배열 생성, 길이는 n만큼

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt(); // 배열에 입력한 정수들 넣기
        }

        int b = sc.nextInt();   // 입력할 정수의 숫자

        for(int j = 0 ; j < arr.length ; j++){  
            if(b == arr[j]){    // 입력한 정수와 배열의 정수가 맞는지 확인하는 조건문
                count++;        // 맞으면 count를 1씩 증가
            }
        }

        System.out.println(count);

    }
}

/*
문제 : 갯수세기
총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N(1 ≤ N ≤ 100)이 주어진다. 둘째 줄에는 정수가 공백으로 구분되어져있다. 셋째 줄에는 찾으려고 하는 정수 v가 주어진다. 입력으로 주어지는 정수와 v는 -100보다 크거나 같으며, 100보다 작거나 같다.

출력
첫째 줄에 입력으로 주어진 N개의 정수 중에 v가 몇 개인지 출력한다.

예제1
11
1 4 1 2 4 2 4 2 3 4 4
2

출력1
3

 */
