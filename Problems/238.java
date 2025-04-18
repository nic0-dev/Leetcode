// LeetCode 75: Array/String

class Solution {
  public int[] productExceptSelf(int[] nums) {
      int len = nums.length, product = 1, cnt = 0;
      int[] res = new int[len];

      for (int n : nums) {
          if (n != 0) 
              product *= n;
          else 
              cnt++;
      }

      if (cnt > 1)
          return new int[len];

      for (int i = 0; i < len; i++) {
          if (cnt == 1 && nums[i] != 0) 
              res[i] = 0;
          else if (nums[i] == 0)
              res[i] = product;
          else 
              res[i] = product/nums[i]; 
      }
      
      return res;
  }
}