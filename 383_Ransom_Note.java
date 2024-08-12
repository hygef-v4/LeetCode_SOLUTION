import java.util.Arrays;
import java.util.HashMap;

class Solution {
  public boolean canConstruct(String ransomNote, String magazine) {
    HashMap<Character, Integer> map = new HashMap<>();
    // put all char from magazine to map 
    for (char c : magazine.toCharArray()) {
      map.put(c, map
          .getOrDefault(c, 0) + 1);
    }
    // check frequency of ransomNote 
    for (char c : ransomNote.toCharArray()){
      if (!map.containsKey(c) || map.get(c) == 0){
        return false; 
      }
      map.put(c, map.get(c) - 1); 
    }
    return true; 
  }
}