package array;

public class ArrayDio4 {

    public static void main(String[] args) {
        // 2x3 2차원 배열을 만든다.
        int[][] arr = new int [10][10];

        // 2차원 배열에 값을 넣는다.
        int i = 1;
        // 순서대로 1씩 증가는 값을 입력한다.
        for (int row = 0; row < arr.length; row++) {
             for (int column = 0; column < arr[row].length; column++) {
                 arr[row][column] = i++;
             }
        }

        // 2차원 배열의 값을 출력한다.
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인을 변경한다.
        }
    }
}
