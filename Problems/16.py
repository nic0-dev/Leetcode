class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        minSum = nums[0] + nums[1] + nums[2]
        minDist = abs(target - minSum)
        for i in range(len(nums)-1):
            j, k = i + 1, len(nums) - 1
            while j != k:
                total = nums[i] + nums[j] + nums[k]
                if total > target:
                    k -= 1
                elif total < target:
                    j += 1
                else:
                    return target
                if abs(target - total) < minDist:
                    minDist = abs(target - total)
                    minSum = total
        return minSum