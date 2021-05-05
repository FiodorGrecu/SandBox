
line = input('Enter a word and I will check if is paindrome: ')
is_palindrome = []

if line == line[::-1]:
    is_palindrome.append(line[::-1])
    print('This word is palindrome')
else:
    pass

print(is_palindrome)