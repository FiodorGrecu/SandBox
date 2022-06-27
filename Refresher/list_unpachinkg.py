num = [1,2,3,4,4,4,4,4,5]
first, *other, last = num
print(other,num)
# print(first,last) #1 and 5 is printed

letters  = ["a", "b","c"]

for index,letter in enumerate(letters): #we get a dctionary of tuples
    print(index, letter)