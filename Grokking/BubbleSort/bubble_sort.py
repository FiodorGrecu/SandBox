
def bubble_sort(elements):
    size = len(elements)

    for i in range(size-1):
        if elements[i] > elements[i+1]:
            tmp = elements[i]
            elements[i] = elements[i+1]
            elements[i+1] = tmp

if __name__ == '__main__':

    elements = [5,8,14,2,25,1,28,55,41]
    bubble_sort(elements)
    print(elements)