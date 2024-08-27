import java.util.*;

class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {
      HashMap <String, List<String>> map = new HashMap<>(); 

      for (String word : strs){
        char [] wordChar = word.toCharArray(); 
        Arrays.sort(wordChar); 
        String sortedWord = new String(wordChar); 
        
        // add to hashMap

        // if map dont contain anagram then create a new key for list 
        if (!map.containsKey(sortedWord)){
          map.put(sortedWord, new ArrayList<>()); 
        }
      // add new anagram word to the list 
        map.get(sortedWord).add(word); 
      }
      return new ArrayList<>(map.values()); 
  }
}