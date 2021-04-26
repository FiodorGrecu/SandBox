list_dup = ['a','b', 'c', 'n', 'a', 'b', 'a']
tot = []
total = 0
for i in list_dup:
    if i == 'a':
        total += 1
tot.append(total)
print(tot)