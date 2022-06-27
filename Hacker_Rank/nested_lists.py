
##############My Attempt
# records = [["Harry", 37.21], ["Berry", 37.21], ["Tina", 37.2], ["Art", 41], ["Harsh", 39]]
# print(records)
# for i in records:
    # i = sorted(str(i))
    # for j in records:
        # print (j[1])
    # print(i[0],i[1])


students = []
for _ in range(int(input())):
    name = input()
    score = float(input())
    students.append([score,name])

students.sort()
grade = students[0][0]

for i in range(1,len(students)):
    if grade < students[i][0]:
        grade = students[i][0]
        break
for i in range(1,len(students)):
    if students[i][0] == grade:
        print(students[i][1])
# print(students)

