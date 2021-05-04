
line = input('Enter a word and I will check if is paindrome: ')

if line == line[::-1]:
    print('This word is palindrome')
else:
    print('This word is not palindrome')