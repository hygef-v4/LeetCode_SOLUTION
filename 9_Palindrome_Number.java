class Solution {
  public boolean isPalindrome(int x) {
    String word = String.valueOf(x); 
    StringBuilder s1 = new StringBuilder(word); 
    StringBuilder s2 = new StringBuilder(word).reverse(); 
    if (!s1.toString().equals(s2.toString())){
      return false;
    }
    return true; 
  }
}