class Solution:
    def isValid(self, s: str) -> bool:
        pair = {')': '(', '}': '{', ']': '['}
        stack = []
        for bracket in s:
            if bracket in '({[':
                stack.append(bracket)
            else:
                if len(stack) == 0 or stack[-1] != pair[bracket]:
                    return False
                else:
                    stack.pop()
        return len(stack) == 0