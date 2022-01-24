class Node:
    def __init__(self, data=None, next=None, prev=None):
        self.data = data
        self.next = next
        self.prev = prev

class DoublyLinkedLists:
    def __init__(self):
        self.head = None

    def insert_at_the_beggining(self,data, prev):
        node = Node(data, self.head)
        self.head = node.prev
    
    def print_forward(self):
        if self.head is None:
            print("My list is empty")
            return
            
        itr = self.head
        llstr = ''
        while itr:
            llstr += str(itr.data) + '-->'
            itr = itr.next
        print(llstr)

    def print_backward(self):
        if self.head is None:
            print("Linked list is empty")
            return

        last_node = self.get_last_node()
        itr = last_node
        llstr = ''
        while itr:
            llstr += itr.data + '-->'
            itr = itr.prev
        print("Link list in reverse: ", llstr)

    def insert_at_the_end(self,data):
        if self.head is None:
            self.head = Node(data,None)
            return
        itr = self.head
        while itr.next:
            itr = itr.next
        
        itr.next = Node(data, None)

    def insert_value(self, data_list):
        self.head = None
        for data in data_list:
            self.insert_at_the_end(data)

    def get_last_node(self):
        itr = self.head
        while itr.next:
            itr = itr.next

    def get_length(self):
        count = 0
        itr = self.head
        while itr:
            count += 1
            itr = itr.next
        return count     
        
# print("Lenght:", ll.get_length()) but exxept print it all the way down when calling the Function

    def remove_at(self, index):
        if index < 0 or index >= self.get_length():
            raise Exception("invalid index")
        
        if index == 0:
            self.head = self.head.next
            return
    
        count = 0
        itr = self.head
        while itr:
            if count == index - 1:
                itr.next = itr.next.next
                break
            itr = itr.next
            count += 1

    def insert_at(self, index, data, next, prev):
        if index < 0 or index > self.get_length():
            raise Exception("Invalid index")

        if index == 0:
            self.insert_at_the_beggining(data) # because we already hve the function for the beggining might as well use it
            return
        
        count = 0 
        itr = self.head
        while itr:
            if count == index - 1:
                node = Node(data, itr.next)
                itr.next = node.prev
                break

            itr = itr.next
            count += 1
        



if __name__ == '__main__':
    dll = DoublyLinkedLists()
    dll.insert_value(["banana","mango", "apple", "oranges"])
    dll.print_forward()
    dll.print_backward()
    dll.insert_at_the_end("figs")
    dll.print_forward()
    dll.print_backward()
    dll.get_last_node()
    print(dll.get_last_node())
