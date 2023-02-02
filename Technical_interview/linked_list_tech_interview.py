class Node:
    def __init__(self, data, next):
        self.data = data
        self.next = next

class LinkedList:
    def __init__(self):
        self.head = None


    def insert_at_the_beginning(self, data):
        node = Node(data, self.head)
        self.head = node
    
    def print(self):
        if self.head:
            self.print("My list is empty")
        itr = self.head
        llstr = ''
        while itr:
            llstr += str(itr.data) + ' --> '
            itr = itr.next
        self.print(llstr)

if __name__ == '__main__':
    ll = LinkedList()
    ll.insert_at_the_beginning(1)
    ll.insert_at_the_beginning(5)
    ll.insert_at_the_beginning(6)
    ll.insert_at_the_beginning(8)
    ll.insert_at_the_beginning(9)
    ll.print()

    