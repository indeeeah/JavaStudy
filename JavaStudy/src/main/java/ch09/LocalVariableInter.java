package ch09;

public class LocalVariableInter {
    public static void main(String[] args) {

        var i = 10;
        var j = 10.0;
        var str = "test";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        var str2 = str;
        System.out.println(str2);

        str = "hello";
//        str = 3;  Error. 데이터형이 String으로 잡혔기 때문에 정수형으로 쓸 수 없다.
        System.out.println(str);
    }
}
