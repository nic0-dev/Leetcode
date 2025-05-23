class Solution:
    def letterCombinations(self, digits: str) -> List[str]:
        res = []
        buttons = {
            '2': 'abc', '3': 'def', '4': 'ghi', '5':'jkl', 
            '6':'mno', '7':'pqrs', '8':'tuv', '9':'wxyz'
        }
        def mapLetters(temp, n):
            if len(temp) == len(digits):
                res.append(temp)
                return
            for i in buttons[digits[n]]:
                temp += i
                mapLetters(temp, n + 1)
                temp = temp[:-1]
        if digits != "":
            mapLetters("", 0)
        return res