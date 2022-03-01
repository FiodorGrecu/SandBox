from pprint import pprint
# def bubble_sort_key(elements, key = 'transaction_amount'):
def bubble_sort_key(elements, key = 'name'):
    size = len(elements)

    for i in range(size-1):
        for j in range(size-1):
            if (elements[j])[key] > (elements[j+1])[key]:
                tmp = elements[j]
                elements[j] = elements[j+1]
                elements[j+1] = tmp
    # return elements

if __name__ == '__main__':

    elements = [
        { 'name': 'mona',   'transaction_amount': 1000, 'device': 'iphone-10'},
        { 'name': 'dhaval', 'transaction_amount': 400,  'device': 'google pixel'},
        { 'name': 'kathy',  'transaction_amount': 200,  'device': 'vivo'},
        { 'name': 'aamir',  'transaction_amount': 800,  'device': 'iphone-8'},
    ]
    bubble_sort_key(elements)
    pprint(elements)