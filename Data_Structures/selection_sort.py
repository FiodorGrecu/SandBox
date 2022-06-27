def selection_sort(arr):
    size = len(arr)
    for i in range(size - 1):
        min_index = i
        for  j in range(min_index +1, size):
            if arr[j] < arr[min_index]:
                min_index = j
        if i != min_index:

            arr[i], arr[min_index] = arr[min_index], arr[i]

# if __name__ == '__main__':

# Running test cases for multiple cases
test = [
    [96,77,5,43,45,23,1,56,6],
    [18,14,11,8,6,4,2,1],
    [],
    [5],
    [555,77,32,2,56,774,3,2],
]

for elements in test: 
# elements = [2,4,6,7,3,6,13]
    selection_sort(elements)
    print(elements)

