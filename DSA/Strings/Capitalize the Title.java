//! Leetcode 2129. Capitalize the Title
//* TC: O(n)
class Solution {
	public String capitalizeTitle(String title) {

		char[] ch = title.toCharArray();
		int len = ch.length;

		for(int i = 0; i < len; ++i) {

			int firstIndex = i; // store the first index of the word

			while(i < len && ch[i] != ' ') {
				ch[i] = Character.toLowerCase(ch[i]); // converting the character at ith index to lower case ony by one
				++i;
			}
			
			// if word is of length greater than 2, then turn the first character of the word to upper case
			if(i - firstIndex > 2) {
				ch[firstIndex] =  Character.toUpperCase(ch[firstIndex]); // converting the first character of the word to upper case
			}
		}

		return String.valueOf(ch); // return the final result by converting the char array into string
	}
}

//! MY APPROACH
class Solution {
    public String capitalizeTitle(String title) {

        String[] words = title.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.length() > 2) {
                String cap = Character.toUpperCase(word.charAt(0)) +
                              word.substring(1).toLowerCase();
                result.append(cap);
            } else {
                result.append(word.toLowerCase());
            }
            result.append(" ");
        }

        return result.toString().trim();
    }
}

or
class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() <= 2) {
                words[i] = words[i].toLowerCase();
            } else {
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1).toLowerCase();
            }
        }
        return String.join(" ", words);
    }
}