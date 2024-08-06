package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647L; // int 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1(초과)
        int intValue = 0;

        intValue = (int) maxIntValue; // 형변환
        System.out.println("maxIntValue casting= " + intValue);

        intValue = (int) maxIntOver; // 형변환 -> 오버플로우가 발생된다. 시계처럼 돌아가서 제일 작은 숫자부터 표현.
        System.out.println("maxIntOver casting = " + intValue); // 출력: -2147483648
    }
}
