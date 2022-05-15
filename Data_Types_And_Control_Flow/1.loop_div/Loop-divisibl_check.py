data = []
# for x in range( 355 ):
for x in range( int(input("Please Enter the nuber: ")) ):
    if (x % 5 == 0) and (x % 7 == 0):
        data.append(str(x))
print(','.join(data))
