data = []
string = input("Enetr a string: ")
if string.lower():
    data.append(string.upper())
    print(string.upper())
if string.upper():
    data.append(string.lower())
    print(string.lower())
print(data)