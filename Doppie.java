public class Doppie {
    public static void main(String[] args) {
        
        System.out.println(checkDoubleChars("Ciao"));
        System.out.println(checkDoubleChars("Hello"));
    }

    public static boolean checkDoubleChars(String phrase) {
        boolean hasDoubleChars = false;
        int length = phrase.length();
        for( int i = 0; i < length-1; i++){
            if (phrase.charAt(i) == phrase.charAt(i+1) ) {
                    hasDoubleChars = true;
                    break;
                }
        }
        return hasDoubleChars;
    }
}
