public class StringUtils {
    private String line;

    public StringUtils(String line) {
        if (line == null)
            throw new IllegalArgumentException("ma zawierać jakąś warsość");
        this.line = line;
    }

    public String odwracanie(){
        return new StringBuilder(this.line).reverse().toString();
    }

    public String  szyfrowanie(int a){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        this.line = this.line.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < this.line.length(); i++) {
            int charPosition = alphabet.indexOf(this.line.charAt(i));
            int keyVal = (a + charPosition) % 26;
            char replaceVal = alphabet.charAt(keyVal);
            cipherText += replaceVal;
        }
        return cipherText;
    }

    public String naWieksze(){
        return this.line.toUpperCase();
    }
    public String naMniejsze(){
        return this.line.toLowerCase();
    }
}
