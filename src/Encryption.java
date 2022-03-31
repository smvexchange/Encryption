public class Encryption {
    private final StringBuilder message;
    private final StringBuilder keyPass;
    private final int[] overflow;


    public Encryption(StringBuilder message, StringBuilder keyPass) {
        this.message = message;
        this.keyPass = keyPass;
        overflow = new int[message.length()];
    }

    public StringBuilder getMessage() {
        return startEncryption();
    }

    public int[] getOverflow() {
        return overflow;
    }

    private StringBuilder startEncryption() {
        int index = 0;
        for (int i = 0; i < this.message.length(); i++) {
            if (((int) message.charAt(i)) + ((int) keyPass.charAt(i)) <= 255) {
                this.message.setCharAt(i, (char) (((int) message.charAt(i)) + ((int) keyPass.charAt(i))));
            } else {
                this.message.setCharAt(i, (char) ((((int) message.charAt(i)) + ((int) keyPass.charAt(i))) % 255));
                overflow[index] = 1;
                index++;
            }
        }
        return message;
    }
}
