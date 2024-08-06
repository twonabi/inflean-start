package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0; // if 안에서만 사용하는 변수인데.
        // 스코프의 위치가 불필요한 메모리 낭비 밎 신경을 계속 써야 하기때문에 별로 좋지 못한 코드가 된다.
        if( m > 0) {
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
}

