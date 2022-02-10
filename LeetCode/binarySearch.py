# Given an array of integers nums which is sorted in ascending order, and an integer target, 
# write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

# You must write an algorithm with O(log n) runtime complexity.

# Example 1

# Input: nums = [-1,0,3,5,9,12], target = 9
# Output: 4
# Explanation: 9 exists in nums and its index is 4

# from pickle import LIST
# LIST = [-1,0,3,5,9,12]


# This is the binary search for a sorted array. 
# If we have an unsorted array we just need to sort id first and we good to go with the same syntax:

class Solution:
    def search(self, nums, target: int) -> int: #this is the change to test it  
    # def search(self, nums: LIST[int], target: int) -> int: # This is leetCode syntax 
        for i ,num in enumerate(nums):
            if num == target:
                return i
        return -1

lst = Solution()
print(lst.search([2,5,6,8,6],8))


# The most Optimal Soluution to binary search is:

class Solution:
    def search(self, nums, target: int) -> int:
    # def search(self, nums: LIST[int], target: int) -> int:
        left, right = 0, len(nums)-1
        while left <= right:
            mid = left + (right - left)//2
            if nums[mid] == target:
                return mid
            if target < nums[mid]:
                right = mid - 1
            else:
                left = mid + 1
        return -1


lst1 = Solution()
print(lst1.search([2,5,6,8,6,12],12))

        # Time complexity : O(logN).