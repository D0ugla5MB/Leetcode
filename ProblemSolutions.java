public class ProblemSolutions implements ProblemList {

    @Override
    public String mergeAlternately(String word1, String word2) {

        /* if (word1.length() <= 0 && word2.length() <= 0) {
            return "";
        }
        if (word1 == "" || word1.length() == 0) {
            return word2;
        }
        if (word2 == "" || word2.length() == 0) {
            return word1;
        } */

        int length = word1.length() + word2.length();
        char[] newString = new char[length];

        int index = 0;
        for (int i = 0; i < length; i++) {
            if (i < word1.length()) {
                newString[index++] = word1.charAt(i);
            }
            if (i < word2.length()) {
                newString[index++] = word2.charAt(i);
            }
        }

        return new String(newString);
    }

}
