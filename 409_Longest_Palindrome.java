class Solution {
  public int longestPalindrome(String s) {
      // if have middle -> length is odd number 
      // if count = odd and length is even then add 1 for the middle character  

      // array to count frequency 
      int maxLength = 0; 
      int [] charCount = new int[128]; 
      for (char c : s.toCharArray()){
        charCount[c] ++; 
      }
      for(int freqC : charCount){
        // take even number 
        maxLength += freqC/2*2; 
        // take middle character for palindrome string
        if(maxLength % 2 == 0 && freqC %2 == 1){
          maxLength += 1; 
        }
      }
      return maxLength; 
  }
}