package ch08;

public class CharacterTest {
    public static void main(String[] args) {
        char ch1 = 'A';
        System.out.println(ch1);
        System.out.println((int)ch1);   // 강제 형변환

        char ch2 = 66;
        System.out.println(ch2);    // B
        System.out.println((char)ch2);  // B

        int ch3 = 67;
        System.out.println(ch3);
        System.out.println((char)ch3);  // C

//        char ch = -66;    Error. 음수는 쓸 수 없다.

        char han = '한';
        char ch = '\uD55C'; // unicode = \\u + 16진수
        System.out.println(han);
        System.out.println(ch); // 한
    }
}
