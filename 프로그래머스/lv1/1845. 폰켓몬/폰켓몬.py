def solution(nums):
    choose = len(nums)/2
    kinds = set(nums)
    return min(choose , len(kinds))