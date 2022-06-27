letter = input("Ask a letter and I will tell you if is Vowel or Consonant: ")
vowels = ['a', 'e', 'i', 'o', 'u']
data = []
if letter in vowels:
    data.append(letter)
    print("This is a vowel !")
else:
    print("This is a consonant !")
    data.append(letter)
print(data)