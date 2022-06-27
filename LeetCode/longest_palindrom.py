class Solution:
    def longestPalindrome(self, s: str) -> str:
        count = 0
        dict = {}
        for i in s:
            dict[i] = dict.get(i, 0) +  1
            if dict[i] == 2:
                count += 2
                del dict[i]
        if len(dict):
            count += 1
        return count
    
palindrome = Solution()

print(palindrome.longestPalindrome("abccccdd"))
print(palindrome.longestPalindrome("abccccjdjdjdkriehgdjkdkdd"))
print(palindrome.longestPalindrome("eye"))
print(palindrome.longestPalindrome("civicor"))

