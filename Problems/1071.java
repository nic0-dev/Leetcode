// LeetCode 75: Array/String

class Solution {
  public String gcdOfStrings(String str1, String str2) {
      if (!(str1 + str2).equals(str2 + str1))
          return "";
      return str1.substring(0, gcd(str1.length(), str2.length()));
  }
  private int gcd(int a, int b) {
      while(b != 0) {
          int rem = a % b;
          a = b;
          b = rem;
      }
      return a;
  }
}