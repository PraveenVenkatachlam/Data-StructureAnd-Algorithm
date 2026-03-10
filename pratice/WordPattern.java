// class Solution {
//     public boolean wordPattern(String pattern, String s) {
        
//     }
// }


class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        
        if (pattern.length() != words.length) {
            return false;
        }

        Map<String, String> seen = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char p = pattern.charAt(i);
            String w = words[i];

            String keyP = "p_" + p;
            String keyW = "w_" + w;

            if (seen.containsKey(keyP) && !seen.get(keyP).equals(w)) {
                return false;
            }

            if (seen.containsKey(keyW) && !seen.get(keyW).equals(String.valueOf(p))) {
                return false;
            }

            seen.put(keyP, w);
            seen.put(keyW, String.valueOf(p));
        }

        return true;
    }
}