
public class Smileys {

    public static void main(String[] args) {
        printWithSmileys("Method");
        printWithSmileys("Beerbottle");
        printWithSmileys("Interface");
    }

    private static void printWithSmileys(String characterString) {
        String words = handleWords(characterString);
        
        printSmileys(words.length() /2);
        System.out.println(words);
        printSmileys(words.length() /2);
        
    }
    
    private static void printSmileys(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(":)");
        }
        System.out.println("");
    }
    
    private static String handleWords(String characterString) {
        if (characterString.length() % 2 == 1) {
            return ":) " + characterString + "  :)";
        }
        return ":) " + characterString + " :)";
    }
}
