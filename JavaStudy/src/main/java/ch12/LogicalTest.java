package ch12;

public class LogicalTest {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);

        System.out.println(value);  // false
        System.out.println(num1);   // 20
        System.out.println(i);  // 2 앞의 항이 이미 false이기 때문에 뒤에 항을 보지 않음

        value = ((num1 = num1 + 10) < 10) || ((i = i + 2) < 10);

        System.out.println(value);  // true
        System.out.println(num1);   // 30
        System.out.println(i);  // 4
    }
}
