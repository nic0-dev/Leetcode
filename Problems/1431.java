// LeetCode 75: Array/String

import java.util.ArrayList;
import java.util.List;

class Solution {
  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
      List<Boolean> res = new ArrayList<>();
      int maxCandies = 0;
      for (int candy : candies) 
          maxCandies = Math.max(maxCandies, candy);
      maxCandies -= extraCandies;
      for (int candy : candies) 
          res.add(candy >= maxCandies);
      return res;
  }
}