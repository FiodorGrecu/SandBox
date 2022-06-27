from ast import Return


class Node:
    def __init__(self, data = None, next = None):
        self.data = data
        self.next = next

class LinkedLists:
    def __init__(self):
        self.head = None

    def insert_at_the_beggining(self,data):
        node = Node(data, self.head)
        self.head = node
    
    def print(self):
        if self.head is None:
            print("My list is empty")

        itr = self.head
        llstr = ''
        while itr:
            llstr += str(itr.data) + '-->'
            itr = itr.next
        print(llstr)

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

    def insert_at(self, index, data):
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
                itr.next = node
                break

            itr = itr.next
            count += 1

    def insert_after_value(self, data_after, data_to_insert):
        if self.head is None:
            return
        
        if self.head.data == data_after:
            self.head.next = Node(data_to_insert, self.head.next)
            return
        
        
        itr = self.head
        while itr:
            if itr.data == data_after:
                itr.next = Node(data_to_insert, itr.next) #aici main intii
                break

            itr = itr.next
            
    def remove_by_value(self,data):

        if self.head is None:
            return

        
        
        if self.head.data == data:
            self.head = self.head.next
            return

        itr = self.head
        while itr.next:
            if itr.next.data == data:
                itr.next = itr.next.next
                break
            itr = itr.next



if __name__ == '__main__':
    ll = LinkedLists()
    ll.insert_value(["banana","mango", "oranges"])
    ll.print()
    ll.insert_after_value("mango", "apples")
    ll.print()
    ll.remove_by_value("oranges")
    ll.print()
    ll.remove_by_value("mango")
    ll.print()
    ll.remove_by_value("figs")
    ll.print()
    ll.remove_by_value("banana")
    ll.remove_by_value("mango")
    ll.remove_by_value("apple")
    ll.remove_by_value("grapes")
    ll.print()
    ll.remove_by_value("apple")
    ll.print()