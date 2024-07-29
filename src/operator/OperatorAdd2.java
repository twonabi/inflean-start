package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        // 전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가 시키고, 그 결과를 b에 대입
        System.out.println("a = " + a + ", b = " + b);

        // 후위 증감 연산자 사용 예 ( 증감되는 시점이 다르다.)
        a = 1; // a 값을 다시 1로 지정
        b = 0; // b 값을 다시 0으로 지정

        b = a++; // a의 현재 값을 b에 먼저 대입하고, 그 후 a 값을 증가시킴.
        System.out.println("a = " + a + ", b = " + b);

        // 참고로 ++a; ,a++; 처럼 단독으로 사용할때 다른 연산이 없기 때문에, 본인의 값만 증가한다.
        // 따라서 전위이든 후위 이든 둘다 결과가 같다.
        a++;
        System.out.println("a = " + a);
        ++a;
        System.out.println("a = " + a);
    }
}
