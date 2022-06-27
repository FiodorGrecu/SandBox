def shut_down(x):    
    if x == True:
        return "SHUTDOWN"
    elif x == False:
        return "SHUTDOWN ABORTED"
    else: 
        return '.'
# result = data(x)
# result = data(x)
print(shut_down(True))