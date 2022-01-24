expenses = [2200,2350,2600,2130,2190]
    
# Feb_expences = expenses[1][1]

# print(expenses)
# print("In February the amount of extra money spent was","$",expenses[1]- expenses[0],"more than in January")
print(f"In February the amount of extra money spent was ${expenses[1]- expenses[0]} more than in January")
print(f"The total expenses in the first quarter of the year was ${expenses[0]+expenses[1]+expenses[2]}.")

if expenses == 2000:
    print("There was one monthe that we spent $2000")
else:
    print("No $2000 amount was found")
print("did I spend $2000 in any month?", 2000 in expenses)

expenses.append(1980)
expenses[3] = expenses[3] - 200
print(expenses)