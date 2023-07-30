package toolbox;
public class Main {
    public static void main(String[] args) {
        String result = ToolBox.encrypt("FBI", 3);
        System.out.println(result);
        String result2 = ToolBox.decrypt(result, 3);
        System.out.println(result2);

        String resultCaesar = ToolBox.encryptCaesar("FBI", 3);
        System.out.println(resultCaesar);
        String resultCaesar2 = ToolBox.decryptCaesar(resultCaesar, 3);
        System.out.println(resultCaesar2);
    }
}
