heroes=['spider man','thor','hulk','iron man','captain america']

print(len(heroes))

heroes.append("Black Panther")
print(heroes)

heroes.pop()
heroes.insert(3,"Black Panther")
print(heroes)
heroes[1:3] = ["doctor strange"]
heroes.sort()
print(heroes)