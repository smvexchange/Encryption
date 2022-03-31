import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message:");
        StringBuilder message = new StringBuilder(scanner.nextLine());
        System.out.println("Enter key word:");
        KeyWord keyWord = new KeyWord(scanner.nextLine(), message.length());
        Encryption encryption = new Encryption(message, keyWord.getKeyPass());
        System.out.println(encryption.getMessage());
    }
}
