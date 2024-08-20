class Solution {
  public int romanToInt(String s) {
    int total = 0;
    for (int i = 0; i < s.length(); i++) {
      int value = getValue(s.charAt(i));
      if (i + 1 < s.length() && value < getValue(s.charAt(i + 1))) {
        total -= value;
      } else {
        total += value;
      }
    }
    return total;

  }

  public int getValue(char roman) {
    switch (roman) {
      case 'I':
        return 1;
      case 'V':
        return 5;
      case 'X':
        return 10;
      case 'L':
        return 50;
      case 'C':
        return 100;
      case 'D':
        return 500;
      case 'M':
        return 1000;
      default:
        return 0;

    }
  }
}