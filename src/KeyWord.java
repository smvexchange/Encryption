public class KeyWord {
    private final String keyWord;
    private final int messageLength;
    private final StringBuilder keyPass = new StringBuilder();

    public KeyWord(String keyWord, int messageLength) {
        this.keyWord = keyWord;
        this.messageLength = messageLength;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public StringBuilder getKeyPass() {
        int i = 0;
        int j = 0;
        while (i < messageLength) {
            if (j >= keyWord.length()) {
                j = 0;
            }
            keyPass.append(keyWord.charAt(j));
            i++;
            j++;
        }
        return keyPass;
    }
}
