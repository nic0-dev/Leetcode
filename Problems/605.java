// LeetCode 75: Array/String

class Solution {
  public boolean canPlaceFlowers(int[] flowerbed, int n) {
      int emptyCtr = 0, allowed = 0;
      if (flowerbed[0] == 0) 
          emptyCtr++;
      for (int flower : flowerbed) {
          if (flower == 1) {
              allowed += ((emptyCtr - 1) / 2);
              emptyCtr = 0;
          } 
          else {
              emptyCtr++;
          } 
      }
      if (flowerbed[flowerbed.length-1] == 0) 
          allowed += (emptyCtr/2);
      return n <= allowed;
  }
}