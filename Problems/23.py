# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        res = []
        
        for linkedList in lists:
            ll = linkedList
            while ll != None:
                res.append(ll.val)
                ll = ll.next
        res.sort(reverse=True)

        if len(res) > 0:
            sortedList = ListNode(val=res[0])
            for i in range(1, len(res)):
                sortedList = ListNode(val=res[i], next=sortedList)
            return sortedList