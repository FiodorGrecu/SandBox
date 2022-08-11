from turtle import clear


letters  = ["a", "b","c"]

letters.append("d")
letters.insert(0,'_')

letters.pop(0)
letters.remove('b')

# del letters[0:3]
letters.clear() # removes all
print(letters)