# Given an array of integers nums which is sorted in ascending order, and an integer target, 
# write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

# You must write an algorithm with O(log n) runtime complexity.

# Example 1

# Input: nums = [-1,0,3,5,9,12], target = 9
# Output: 4
# Explanation: 9 exists in nums and its index is 4

from pickle import LIST


class Solution:
    def search(self, nums: LIST[int], target: int) -> int:
        for i ,num in enumerate(nums):
            if num == target:
                return i
        return -1

lst = Solution()
print(lst.search())
