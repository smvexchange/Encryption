public class Decryption {
    private final StringBuilder message;
    private final StringBuilder originalMessage = new StringBuilder();
    private final StringBuilder keyPass;
    private final int[] overflow;

    public Decryption(StringBuilder message, StringBuilder keyPass, int[] overflow) {
        this.message = message;
        this.keyPass = keyPass;
        this.overflow = overflow;
    }

    public StringBuilder getOriginalMessage() {
        return startDecryption();
    }

    private StringBuilder startDecryption() {
        for (int i = 0; i < message.length(); i++) {
            if (overflow[i] == 0) {
                originalMessage.append((char) ((int) message.charAt(i) - (int) keyPass.charAt(i)));
            } else {
                originalMessage.append((char) ((255 + (int) message.charAt(i)) - (int) keyPass.charAt(i)));
            }
        }
        return originalMessage;
    }
}
