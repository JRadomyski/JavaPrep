package PPJ;

public class LAB03 {
    public static void main(String[] args) {
        task1();
        task02();
        task03();
        task04();
        task05();
        task06();
        task07();
    }

    public static void task1(){
        byte lowestByteVal = -128;
        byte highestByteVal = 127;

        short lowestShortVal = -32768;
        short highestShortVal = 32767;

        int lowestIntVal = -2147483648;
        int highestIntVal = 2147483647;


        float lowestFloatVal = 1.4444444444444444f;
        float highestFloatVal = 2147483647;


        double lowestDoubleVal = -2147483648;
        double highestDoubleVal = 2147483647;

//        boolean lowestBoolValue = 0;
//        boolean highestBoolValue = (boolean) 1;

    }

    public static void task02(){
        boolean boolVar = true;
        int intVar = 2023;
        double doubleVar = 3.14;
        char charVar = 'x';

//        boolVar == intVar;
//        boolVar == intVar;
//        boolVar == doubleVar;
//        boolVar == charVar;

//        intVar == doubleVar;
//        intVar == charVar;

//        doubleVar == intVar;
//        doubleVar == charVar;
    }

    public static void task03(){
//        int int1 = x2000;
//        int int2 = 20x;
//        int int3 = @abc;
//        int static = 3333;
//        int int5 = "null";
    }

    public static void task04(){
        int v = 21;
        System.out.println(v);
    }

    public static void task05(){
        char charValue = 'a';
        char charvalue = 'b';
        //Output: a
        //Output: b
        System.out.println(charValue);
        System.out.println(charvalue);
    }

    public static void task06(){
        int a = 5;
        double b = 3.14;
//        a = b;
        b = a;
        System.out.println(a);
        System.out.println(b);
    }

    public static void task07(){
        byte byteVariable = 5;
        char charVariable = 'c';
        int intVariable = 22;
        float floatVariable = 33f;
        double doubleVariable = 20.22;

//        char res1 = charVariable + intVariable;
        char res1 = (char) (charVariable + intVariable);
        int res2 = intVariable + charVariable;
//        float res3 = floatVariable + doubleVariable;
        float res3 = (float) (floatVariable + doubleVariable);
//        byte res4 = byteVariable + intVariable;
        byte res4 = (byte) (byteVariable + intVariable);
    }


}
