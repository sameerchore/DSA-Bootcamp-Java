import java.util.Scanner;
public class CaesarCipher {

    static String encrypt(String text, int shift) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                result += (char) ((ch - 'A' + shift) % 26 + 'A');
            }

            else if (ch >= 'a' && ch <= 'z') {
                result += (char) ((ch - 'a' + shift) % 26 + 'a');
            }

            else {
                result += ch;
            }
        }
       return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the plain text: ");
        String text = sc.nextLine();

        System.out.print("Enter the shift value: ");
        int shift = sc.nextInt();

        System.out.println("Cipher Text: " + encrypt(text, shift));
        sc.close();
    }
}
