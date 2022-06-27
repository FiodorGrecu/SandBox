mark = int(input("Tell me how many points you have and I will tell you the grade :"))
if mark > 100:
    print('Invalid number please check the number and Enter again !')
elif  mark >= 90 and mark <= 100:
    print('You got an A')
elif mark >=70 and mark <= 89:
    print('You have a B')
elif mark >=50 and mark <= 69:
    print('You have a C')
elif mark >=35 and mark <= 49:
    print('You have a D')
else:
    print('You FAILED')
