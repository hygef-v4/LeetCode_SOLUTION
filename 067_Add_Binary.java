class Solution {
  public String addBinary(String a, String b) {
    StringBuilder str = new StringBuilder();
    int carry = 0;
    int indexA = a.length() - 1;
    int indexB = b.length() - 1;

    while (indexA >= 0 || indexB >= 0) {
      int sum = carry;
      if (indexA >= 0) {
        sum += a.charAt(indexA) - '0';
      }
      if (indexB >= 0) {
        sum += b.charAt(indexB) - '0';
      }

      str.append(sum % 2);
      carry = sum / 2;
      indexA--;
      indexB--;
    }
    // if still have carry (run out of both strings length)
    if (carry == 1) {
      str.append(carry);
    }
    return str.reverse().toString();
  }
}