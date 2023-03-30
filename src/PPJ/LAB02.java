package PPJ;

public class LAB02 {

    public static void main(String[] args) {
        task01();
        System.out.println("==========");
        task02();
        System.out.println("==========");
        task03();
        System.out.println("==========");
        task04();
    }

    public static void task01(){
        //wartość = 165
        System.out.println(0b10100101);
        System.out.println(0245);
        System.out.println(0xA5);
    }

    public static void task02(){
        int wrt = 14;

        int result1 = wrt >> 0;
        int result2 = result1 << 2;
        int result3 = result2 >> 4;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }

    public static void task03(){
        int val = 923456789;
        int temp = 0b11111;
        String result = Integer.toBinaryString((val & temp));
        System.out.println(result);

        if((val & (1 << 6)) !=0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }

        int b1, b2, b3, b4;
        b1 = val & 0xFF;
        b2 = ((val >> 8) & 0xFF);
        b3 = ((val >> 16) & 0xFF);
        b4 = ((val >> 24) & 0xFF);
        System.out.println(b1 + " " + b2 + " " + b3 + " " + b4);

        int bi1, bi2;
        bi1 = ((val >> 8) & 0xFF);
        bi2 = ((val >> 16) & 0xFF);
        int res = bi2 | bi1;
        System.out.println(res);
    }

    public static void task04(){
        int xxx = 13, yyy = 6, zzz = 13;

        int a1 = 0x6D , a2 = zzz , a = a1 & a2,
                b1 = 0xA , b2 = xxx , b = b1 | b2,
                c1 = 11 << 2 , c2 = yyy , c = c1 ^ c2;

        System.out.println(a + " " + b + " " + c);
    }
}
