import java.util.ArrayList;
import java.util.List;

public class ProblemSolutions implements ProblemList {

    @Override
    public String mergeAlternately(String word1, String word2) {

        /*
         * if (word1.length() <= 0 && word2.length() <= 0) {
         * return "";
         * }
         * if (word1 == "" || word1.length() == 0) {
         * return word2;
         * }
         * if (word2 == "" || word2.length() == 0) {
         * return word1;
         * }
         */

        int newSize = word1.length() + word2.length();
        char[] newString = new char[newSize];
        int j = 0;

        if (word1.length() == word2.length()) {
            newSize = newString.length / 2;
            j = -1;
            for (int i = 0; i < newSize; i++) {
                newString[2 * i] = word1.charAt(i);
                newString[j += 2] = word2.charAt(i);
            }
        } else {
            for (int i = 0; i < newSize; i++) {
                if (i < word1.length()) {
                    newString[j++] = word1.charAt(i);
                }
                if (i < word2.length()) {
                    newString[j++] = word2.charAt(i);
                }
            }
        }

        return new String(newString);
    }

    @Override
    public  String gcdOfStrings(String str1, String str2) {
       
        
        if (!str1.startsWith(str2) && !str2.startsWith(str1)) {
            return "";
        }

        int gcdLength = AuxOperations.gcd(str1.length(), str2.length());

        return str1.substring(0, gcdLength);
    }


    public String gcdOfStringsV2(String word1, String word2) {
        List<Integer> ranges = new ArrayList<>();
        int mainStrSize = word1.length();
        int patternSize = word2.length();

        for (int i = 0; i <= mainStrSize - patternSize; i++) {
            if (word1.substring(i, i + patternSize).equals(word2)) {
                ranges.add(i);
                ranges.add(i + patternSize - 1);
                i += patternSize - 1;
            }
        }

        StringBuilder newString = new StringBuilder();

        int charPos = 0;

        for (int i = 0; i < ranges.size(); i += 2) {
            int start = ranges.get(i);
            int end = ranges.get(i + 1);

            newString.append(word1.substring(charPos, start));
            charPos = end + 1;
        }

        if (charPos < mainStrSize) {
            newString.append(word1.substring(charPos));
        }

        return newString.toString();

    }


}
