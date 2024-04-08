package codingtestBackjoon.onearr;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // 입력할 정수의 갯수
        int x = sc.nextInt(); // 비교할 숫자 

        int[] arr = new int[n]; // 입력받을 배열의 갯수

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt(); // 배열에 입력한 정수들 넣기
        }

        for(int j = 0 ; j < arr.length ; j++){ // arr 길이만큼 반복
            
            if(arr[j] < x){ // arr 배열 인덱스에 할당된 숫자가 x보다 작으면 출력
                System.out.print(arr[j] + " ");
            }
        }

    }
}

/*
문제 
정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.

출력
X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

예제 입력 1
10 5
1 10 4 9 2 3 8 5 7 6

예제 출력 1
1 4 2 3
 */