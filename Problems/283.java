// LeetCode 75: Two pointers

class Solution {
  public void moveZeroes(int[] nums) {
      int n = nums.length;
      for (int left = 0; left < n-1; left++) {
          if (nums[left] == 0) {
              int right = left + 1;
              while (right < n-1 && nums[right] == 0) 
                  right++;
              int temp = nums[left];
              nums[left] = nums[right];
              nums[right] = temp;
          }
      }
  }
}