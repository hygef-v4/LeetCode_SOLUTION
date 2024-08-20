class Solution {
  public int strStr(String haystack, String needle) {
   
      StringBuilder s1 = new StringBuilder(haystack); 
      return s1.indexOf(needle); 
  }
}