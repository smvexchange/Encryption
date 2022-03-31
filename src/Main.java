import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time time = new Time();
        System.out.println("Enter your message:");
        StringBuilder message = new StringBuilder(time.getTime().append(" ").append(scanner.nextLine()));
        System.out.println("Enter key word:");
        KeyWord keyWord = new KeyWord(scanner.nextLine(), message.length());
        Encryption encryption = new Encryption(message, keyWord.getKeyPass());
        System.out.println(encryption.getMessage());

        System.out.println("Enter your encryption:");
        StringBuilder encryptedMessage = new StringBuilder(scanner.nextLine());
        System.out.println("Enter key word:");
        KeyWord key = new KeyWord(scanner.nextLine(), encryptedMessage.length());
        Decryption decryption = new Decryption(encryptedMessage, key.getKeyPass(), encryption.getOverflow());
        System.out.println(decryption.getOriginalMessage());
    }
}
