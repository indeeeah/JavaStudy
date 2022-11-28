package ch10;

public class TypeConversionTest {
    public static void main(String[] args) {
        byte bnum = 125;
        int inum = bnum;
        System.out.println(bnum);
        System.out.println(inum);

        inum = 255;
//        bnum = inum;  Error
        bnum = (byte)inum;  // 강제 형변환

        System.out.println(inum);
        System.out.println(bnum);   // -1

        double dnum = 3.14;
//        inum = dnum;  Error
        inum = (int)dnum;

        System.out.println(dnum);
        System.out.println(inum);   // 3

        dnum = 1.2;
        float fnum = 0.9f;

        int inum1 = (int) dnum + (int) fnum;
        int inum2 = (int)(dnum + fnum);
        System.out.println(inum1);  // 1
        System.out.println(inum2);  // 2
    }
}
