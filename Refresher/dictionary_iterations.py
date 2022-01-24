# expenses = {
#     "january": [1234,1235],
#     "february": [1275,3],
#     "march": [1250,1],
#     "april": [1300,3],
#     "may": [1200,5],
# }

# Iterating through a list of dictionaries to find the value of each key and the key if we want     
expenses = [
   { "january": 1234},
    {"february": 1275},
    {"march": 1250},
   { "april": 1300},
    {"may": 1200}
]
print(expenses)

for index in range(len(expenses)):
    for item in expenses[index]:
        print(expenses[index][item]) 
        print(expenses[index]) 