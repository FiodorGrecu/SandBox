list_dup = ['a','b', 'c', 'n', 'a', 'b', 'a']
tot = []
total = 0
for i in list_dup:
    if i == 'n':
        total += 1
tot.append(total)
print(tot)


# Now I will  ry with the COUNTER function to see the results

# from collections import Counter

# list_dup = ['a', 'c', 'b','r', 't', 'c', 't','a', 'c',]
# dupes_times = Counter(list_dup)
# print(list_dup)
# print(dupes_times)