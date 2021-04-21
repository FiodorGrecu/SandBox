# string = "BYTE ACADEMY"
# string = "AUTONOMUS DRIVING"
string = "Autonomus Driving"
string.lower()
vowels = ['A', 'E', 'I', 'O', 'U', 'a', 'e','i','o','u']
data = []
for i in range(0,len(string),1):
    if string[i] in vowels:
        pass
    elif string[i] not in vowels:

        data.append(string[i])
print(data)