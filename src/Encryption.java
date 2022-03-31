public class Encryption {
    private StringBuilder message;
    private final StringBuilder keyPass;
    private int[] overflow;


    public Encryption(StringBuilder message, StringBuilder keyPass) {
        Time time = new Time();
        this.message = time.getTime().append(message);
        this.keyPass = time.getTime().append(keyPass);
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
                overflow[index] = i;
                index++;
            }
        }
        return message;
    }
}
