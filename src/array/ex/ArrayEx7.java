package array.ex;

import java.util.Scanner;

public class ArrayEx7 {

    // 문제8. 2차원 배열
    // 사용자로부터 4명의 학생의 국어, 수락, 영어 점수를 입력받아 각 학생의 총점과 편균을 계산하는
    // 프로그램을 작성하자.
    // 2차원 배열을 사용

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scores = new int[4][3];
        String[] subjects = {"국어" , "영어", "수학"};

        for (int i = 0; i < 4; i++) {
            System.out.println((i+1) + "번 학생의 성적을 입력하세여:");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수:");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 4; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            System.out.println((i+1) + "번 학생이 총점: " + total + ", 평균" + average);
        }
    }
}
