def lengh( *args ):
    result = args[0]
    for num in args:
        if num < result:
            result = num
    return result
print(4,6,7,8,2,4)
print(4,8,7,8,3,4)