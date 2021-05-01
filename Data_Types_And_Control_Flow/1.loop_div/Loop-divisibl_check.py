data = []
# for x in range( 355 ):
for x in range( int(input()) ):
    if (x % 5 == 0) and (x % 7 == 0):
        data.append(str(x))
print(','.join(data))
