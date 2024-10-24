class Solution:
    def fourSum(self, nums: List[int], target: int) -> List[List[int]]:
        nums.sort()
        res = set()
        for i in range(len(nums)-3):
            for j in range(i+1,len(nums)-2):
                k, l = j + 1, len(nums) - 1
                while k != l:
                    total = nums[i] + nums[j] + nums[k] + nums[l]
                    if total < target:
                        k += 1
                    elif total > target:
                        l -= 1
                    else: 
                        res.add((nums[i], nums[j], nums[k], nums[l]))
                        k += 1
        return [list(x) for x in res]