package ch06;

public class VariableTest {
    public static void main(String[] args) {
        byte bnum = -128;   // -128~127
        System.out.println(bnum);

//        int num = 12345678900;    Error
//        long lnum = 12345678900;  Error
        long lnum = 12345678900L;   // long type은 끝에 L을 써준다.
        System.out.println(lnum);
    }
}
