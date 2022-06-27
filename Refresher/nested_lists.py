alist = [1,3,5,6]
# print(alist)

# nesting the list intop our existeting one
alist.append([7,8,9,0]) 

nested = alist[4] 

# accesing the nested list 
# print(nested)
# print(alist)

# nesting anopther list even deeper

nested.append([11,22,33])

nested1 = nested[4]

# print(alist)

# now accesing the depest list

print(alist)
print(nested)
print(nested1)

# accesing the deepest element of the list

print(alist[4][4][2])

# I can even assingn that number to n object 

deo_my_list = alist[4][4][2]
print(deo_my_list)