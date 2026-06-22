//!  1189. Maximum Number of Balloons
class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0;

        for (char c : text.toCharArray()) {
            if (c == 'b') b++;
            else if (c == 'a') a++;
            else if (c == 'l') l++;
            else if (c == 'o') o++;
            else if (c == 'n') n++;
        }

        return Math.min(Math.min(b, a),
               Math.min(Math.min(l / 2, o / 2), n));
    }
}
// class Solution {
//     public int maxNumberOfBalloons(String text) {

//         // HashMap<Integer,String> map=new HashMap<>();
//         HashMap<Character, Integer> map = new HashMap<>();
//         int count = 0;
//         // for(int i=0;i<text.length();i++){

//         // }
//         for (char ch : text.toCharArray()) {
//             map.put(ch, map.getOrDefault(ch, 0) + 1);
//         }
//         return count;
//     }
// }