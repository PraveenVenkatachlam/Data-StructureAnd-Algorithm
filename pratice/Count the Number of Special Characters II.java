//!     3121. Count the Number of Special Characters II
class Solution {
    public int numberOfSpecialChars(String word) {

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet();
        char[] ch = word.toCharArray();

        // for (int i = 0; i < ch.length(); i++) {// for(int i:word)
        for (char c : ch) {
            set.add(c);
        }

        int count = 0;
        for (char c = 'a'; c <= 'z'; c++) {

            if (set.contains(c) && set.contains(Character.toUpperCase(c))) {

                count++;
            }
        }

        return count;

    }
}