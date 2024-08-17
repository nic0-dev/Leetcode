class Solution:
    def kClosest(self, points: List[List[int]], k: int) -> List[List[int]]:
        from heapq import heapify, heappop
        min_heap, ans = [], []

        for x, y in points:
            min_heap.append((sqrt(x**2 + y**2), [x, y]))

        heapq.heapify(min_heap)
        return [heapq.heappop(min_heap)[1] for _ in range(k)]