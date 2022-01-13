def binary_search(list, item):
    low = 0
    high = len(list)-1

    while low <= high:
        mid = (low + high) // 2
        guess = list[mid]
        if guess == item:
            return mid
        if guess > item:
            high = mid - 1
        else:
            low = mid + 1
    return None

# The original list  
# my_list = [1, 3, 5, 7, 9]


# The case of non sorted list    
my_list = [1, 3, 5, 7, 9, 11, 1] #---> # The item is at the position zero 
     

my_list.sort()
# After the sort the istem is found at the position 1 because it repaets itself    

print(my_list)
# print(binary_search(my_list, 1))

# print(binary_search(my_list, 4)) 
# If we are looking for item 4 we get None beacuse is no such an item

print(binary_search(my_list, 9)) 
# If we are looking for item 9 we get 5 beacuse is the 6th element in the array items start from 0
