
def bubble_sort(elements):
    size = len(elements)

    # for k in range(2): #this line iterates through last 2 elements elements
    for k in range(size-1): #this line iterates through all elements
        for i in range(size - 1 - k): # the minus 'k' here ignores the elementsto the right of the swaped 2 element to save the running time each time we ares swaping the items
            if elements[i] > elements[i+1]:
                tmp = elements[i]
                elements[i] = elements[i+1]
                elements[i+1] = tmp

if __name__ == '__main__':

    elements = [5,8,14,2,25,1,28,55,41]
    bubble_sort(elements)
    print(elements)