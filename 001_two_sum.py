class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        #create a hashmap of value and index 
        prevMap = {}
        # iterate through the list and find the difference of target and value 
        for i, n in enumerate(nums): 
            diff = target - n   
            # if diff in hashmap, return the array of index of diff and current index
            if (diff in prevMap): 
                return [prevMap[diff], i]
            #if diff not exist in hashmap, add current number to hashmap with its index 
            prevMap[n] = i 
        