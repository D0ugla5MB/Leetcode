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

}
