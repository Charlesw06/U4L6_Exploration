import java.util.Locale;

public class StringLoops {
    // default constructor; no instance variables
    public StringLoops() {
    }

    public int countCharacters(String character, String searchString) {
        int count = 0;
        for (int i = 0; i < searchString.length(); i++) {
            if (searchString.substring(i, i + 1).equals(character)) {
                count++;
            }
        }
        return count;
    }

    public String reverseString(String origString) {
        String reverse = "";
        for (int i = origString.length() - 1; i >= 0; i--) {
            reverse += origString.substring(i, i + 1);
        }
        return reverse;
    }

    public String reverseString2(String origString) {
        String reverse = "";
        for (int i = 0; i < origString.length(); i++) {
            reverse = origString.charAt(i) + reverse;
        }
        return reverse;
    }

    public int countVowels(String origString)
    {
        int count = 0;
        String indexChar;
        for (int i = 0; i < origString.length(); i++) {
            indexChar = (origString.substring(i, i + 1)).toLowerCase(Locale.ROOT);
            if (indexChar.equals("a") || indexChar.equals("e") || indexChar.equals("i") || indexChar.equals("o") || indexChar.equals("u")) {
                count++;
            }
        }
        return count;
    }

    public int countString(String searchString, String origString)
    {
        int count = 0;
        while (origString.indexOf(searchString) != -1) {
            origString = origString.substring(1, origString.indexOf(searchString)) + origString.substring(origString.indexOf(searchString) + searchString.length());
            count++;
        }
        return count;
    }

}
