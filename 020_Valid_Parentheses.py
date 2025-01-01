class Solution:
    def isValid(self, s: str) -> bool:
        map = {
            ')': '(',
            '}': '{',
            ']': '['
        }
        stack = []
        for c in s: 
            # if c not in map, append c to stack 
            if c not in map: 
                stack.append(c) 
            # if c is in map
            else: 
                
                # if stack is empty, return False because there is no opening bracket to match with closing bracket
                if not stack: 
                    return False 
                # if the last element in stack is the opening bracket of c, pop the last element in stack
                if stack[-1] == map[c]: 
                    stack.pop()
                # if the last element in stack is not the opening bracket of c, return False
                else: 
                   return False  
        # if stack is empty, return True, otherwise return False
        return not stack

