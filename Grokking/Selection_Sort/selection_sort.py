# def find_min_elem(arr):
#     min = 10000000
#     for i in range(len(arr)):
#         if arr[i] < min:
#             min = arr[i]
#     return min


def selection_sort(arr):
    size = len(arr)
    for i in range(size-1):
        min_index = i
        for j in range(min_index+1, size):
            if arr[j] < arr[min_index]:
                min_index = j
        if i != min_index:

            arr[i], arr[min_index] = arr[min_index], arr[i]

if __name__ == '__main__':
    test  = [
        [68,45,6,77,54,7868,3,45,],
        [],
        [98,87,76,65,43,32,21,12,6,3,1],
        [679,345,223,567,8867,44,33,5,3,0],
        [32,4,5,6,7,9,1],
        [5]
    ]

    for elements in test:

        # elements = [78, 56, 23, 74, 25, 3, 44]

        selection_sort(elements)
    # print(find_min_elem(elements))
        print(elements)