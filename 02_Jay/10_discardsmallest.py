def solution(arr):
    if len(arr) > 1:
        smallest = min(arr)
        arr.remove(smallest)
        return arr
    else:
        return [-1]

