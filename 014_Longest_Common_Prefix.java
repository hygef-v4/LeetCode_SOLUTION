class Solution {
  public String longestCommonPrefix(String[] strs) {

    // we goona compare all the character of other string to the first string
    StringBuilder s = new StringBuilder();

    for (int i = 0; i < strs[0].length(); i++) { 
      for (String word : strs) {
        // If the index exceeds the length of the current word, or characters don't match
        if (i >= word.length() || strs[0].charAt(i) != word.charAt(i)) {
          return s.toString();
        }
      }
      s.append(strs[0].charAt(i)); // Append the matching character
    }

    return s.toString();
  }

}