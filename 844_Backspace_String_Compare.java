class Solution {
  public boolean backspaceCompare(String s, String t) {
    StringBuilder s1 = new StringBuilder(); 
    StringBuilder s2 = new StringBuilder(); 
    // if encounter # then remove previous character, else add character 
      for (char c : s.toCharArray()){
        if (c == '#'){
          if(s1.length() > 0){
            s1.deleteCharAt(s1.length()-1); 
          }
        }else{
          s1.append(c); 
        }
      }
  

      for (char c : t.toCharArray()){
        if (c == '#'){
          if(s2.length() > 0){
            s2.deleteCharAt(s2.length()-1); 
          }
        }else{
          s2.append(c); 
        }
      }

      if  (s1.toString().equals(s2.toString())){
        return true; 
      }
      return false; 
  }
}