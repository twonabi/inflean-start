package operator;

public class Operator1 {
    public static void main(String[] args) {
        // 변수 초기화
        int a = 5;
        int b = 2;

        // 덧셈
        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b  = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b; // -> 2.5  ( 정수만 출력 가능)
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);
        
        /*int z = 10 / 0 ;
        // 수학에서 허용 하지 않음. 그러므로 오류 발생되는 상황.
        // 예외가 발생 괴면 해당 시점 이후의 결과가 출력되지 않고 프로그램이 종료 된다.
        System.out.println("z = " + z);*/

    }
}
