package method;

public class Method2 {

    public static void main(String[] args) {
        printHeader();
        System.out.println("프로그램이 동작합니다.");
        printFooter();
    }

    // 반환타입이 void 인 경우 return 을 넣지 않아도 자동으로 넣어준다.
    public static void printHeader() {
        System.out.println("= 프로그램을 시작합니다 =");
        // return;
    }

    public static void printFooter() {
        System.out.println("= 프로그램을 종료합니다 =");
    }
}
