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
        String origLowCase = origString.toLowerCase();
        String searchLowCase = searchString.toLowerCase();
        String index;

        for (int i = 0; i < origLowCase.length();i++) {
            if (i + searchLowCase.length() <= origLowCase.length()) {
                index = origLowCase.substring(i, i + searchLowCase.length());
                if (index.equals(searchLowCase)) {
                    count++;
                }
            }
        }
        return count;
    }

    public String removeString(String searchString, String origString)
    {
        while (origString.indexOf(searchString) != -1) {
            origString = origString.substring(0, origString.indexOf(searchString)) + origString.substring(origString.indexOf(searchString) + searchString.length());
        }
        return origString;
    }

    public String replaceCharacter(String searchChar, String origStr, String replaceChar)
    {
        while (origStr.indexOf(searchChar) != -1) {
            origStr = origStr.substring(0, origStr.indexOf(searchChar)) + replaceChar + origStr.substring(origStr.indexOf(searchChar) + 1);
        }
        return origStr;
    }
}
