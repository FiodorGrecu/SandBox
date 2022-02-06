def findSmallest(arr):
    smallest = arr[0]
    smallest_index = 0
    for i in range(len(arr)):
        if arr[i] < smallest:
            smallest = arr[i]
            smallest_index = i
    return smallest_index

def selectionSort(arr):
    newArr  = []
    for i in range(len(arr)):
        smallest = findSmallest(arr)
        newArr.append(arr.pop(smallest))
    return newArr

print(selectionSort([0,3,5,3,14,34]))
print(selectionSort([13,-1,5,3,14,34]))
print(selectionSort([13,-2.2,0.3,-0.03,5,3,14,34]))