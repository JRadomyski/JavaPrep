package decoder;

public class MessageDecoder {
    public static void main(String[] args) {
        int n = 278905354;
        String message = decode(n);
        System.out.println("Zdekodowana wiadomość: " + message);
        String customMessage = "JAVA_";
        int encodedMessage = encode(customMessage);
        System.out.println("Zakodowana wiadomość dla " + customMessage + ": " + encodedMessage);
    }

    public static String decode(int n) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_".toCharArray();
        char[] decodedChars = new char[6];

        for (int i = 0; i < 6; i++) {
            int letterValue = (n >> (5 * i)) & 31;
            if (letterValue >= 1 && letterValue <= 26) {
                decodedChars[5 - i] = alphabet[letterValue - 1];
            } else if (letterValue == 31) {
                decodedChars[5 - i] = '_';
            } else {
                decodedChars[5 - i] = '?';
            }
        }
        return new String(decodedChars);
    }

    public static int encode(String message) {
        char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ_".toCharArray();
        int result = 0;
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            int index = new String(alphabet).indexOf(c) + 1;
            result |= (index << (5 * i));
        }
        return result;
    }
}