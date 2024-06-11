from typing import List


# Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
# Output: [2,2,2,1,4,3,3,9,6,7,19]

def relativeSortArray(arr1: List[int], arr2: List[int]) -> List[int]:
    sorted = []
    for num2 in arr2:
        for num1 in arr1:
            if num1 == num2:
                sorted.append(num1)
    rest = [i for i in arr1 if i not in arr2]
    rest.sort()
    sorted.extend(rest)
    return sorted


arr1 = [2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19]
arr2 = [2, 1, 4, 3, 9, 6]
print(relativeSortArray(arr1, arr2))
