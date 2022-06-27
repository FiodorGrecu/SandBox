# a function to find the smalles element ain an array.     

def findSmallest(arr):
    smallest = arr[0]
    smallest_index = 0
    for i in range(1,len(arr)):
        if arr[i] < smallest:
            smallest = arr[i]
            smallest_index = i
    return smallest_index

def sellectionSort(arr):
    newArr = []
    for i in range(len(arr)):
        smallest = findSmallest(arr)
        newArr.append(arr.pop(smallest))
    return newArr

print(sellectionSort([8,5,8,9,3]))
print(sellectionSort([-8,5,8,9,3]))
print(sellectionSort([-8,-22,5,8,9,32]))

# The equivalent built in function in python sorted     
# arr = [3,6,8,9,8]
# print(sorted(arr, reverse=True))

# print(help("sorted"), reverse=True)