package loop.ex;

public class ForEx2 {
    public static void main(String[] args) {
        // 이렇게도 쓸수 있지만 좋은 로직은 아니다.
       /* for (int num = 2, count = 1; count <= 10; num += 2, count++) {
            System.out.println(num);*/
        // 아래 코드가 좀 더 깔끔하다.
        // 한 용도로 쓰는것이 깔끔하지, 다른 용도로 까지 사용하면 번잡해진다.
        int num = 2;
        for (int count = 1; count <= 10; count++) {
            System.out.println(num);
            num += 2;
        }
    }
}
