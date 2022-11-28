package ch10;

public class ConstantTest {
    public static void main(String[] args) {
        final int MAX_NUM = 100;
//        MAX_NUM = 10; Error. 상수기 때문에 한번 정해진 값을 바꿀 수 없다.

        final int MIN_NUM;
        MIN_NUM = 0;
//        MIN_NUM = 1;  Error. 초기화가 된 값을 바꿀 수 없다.

        System.out.println(MAX_NUM);
        System.out.println(MIN_NUM);
    }
}
