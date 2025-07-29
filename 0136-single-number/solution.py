class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        unq = 0
        for i in nums:
            unq ^= i
        return unq
