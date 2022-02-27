def bubble_sort(elements):
    size = len(elements)

    for i in range(size-1):
        if elements[1] > elements[i+1]:
            tmp = elements[i]
            elements[i] = elements[i+1]
            elements[i+1] =  tmp

elements =[5,8,14,2,25,1,28,55,41]


print(bubble_sort(elements))
# print(elements)