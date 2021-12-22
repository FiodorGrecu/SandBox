import random as rand

password = "Sebastian"
print(password.upper())

print(''.join([password.lower()[rand.randint(0,len(password)-1)] for i in range(9)]))