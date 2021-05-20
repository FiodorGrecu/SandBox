def data(x):    
    x == input(" What would you like to do: ")
    if x == "True":
        print("SHUTDOWN")
    if x == "False":
        print("SHUTDOWN ABORTED")
    return data

print(data(x=True))