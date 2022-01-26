import random as r
# string = "one"
# integer = int(string) 
# print(integer)

# letters = ['abcdefghijklmnoprstqvwxyz']
# num = ['one','two','three','four','five','six','seven','eight','nine','zero']
# digit = [1,2,3,4,5,6,7,8,9,0]
# for i in letters:
#     if 'one' in letters:
#       print('yay')


# So given a randon clearly defined mix strings that represent numbers from 0-9 throug input.
# we need to represent them in integers in ascended order.    
# for Example: input = "reuonnoinfe"
# our print staemen has to be 149 in integers.

def find_numbers(input):
        number_list = [ "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" ]
        numbers = []
        while len(input) > 0:
            startInput = input
            for  numeral in number_list:
                storedInput = input
                numeralFound = False
                for cn in numeral:
                    count = input.count(cn) 
                    if count > 0:
                        numeralFound = True
                        index = input.index(cn)
                        if len(input) > index:
                            input = input[:index:] + input[index+1::]
                    else:
                        numeralFound = False
                        input = storedInput
                        break
                if numeralFound :
                    number = number_list.index(numeral)
                    numbers.append(str(number))

            if startInput == input:
                break

        numbers.sort()
        output = "".join(numbers)
        return output

# input = "reuonnoinfe"
# input = "nzerinextneiootnrnoeneeeeuoeoheetehounzoiuetrhfefeezuivirfwieotgoottfnrnneghetserhrwsgesfherhtiitrerevreernhveofiouver"
input = "nzerinextneiootnruivirfwieotgoottfnrnneghetserhrwsgesfherhtiitrerev"
print(find_numbers(input))
# strings = 'nineeightthree'
# listOfLetters = []
# listOfLetters.append(list(strings))
# l = listOfLetters[0]
# # for i in l:
# print(l)
# splitStr = strings.split('')
# randString = strings.random()
# print(splitStr)


# input = ""
# output = find_numbers(input)
# print(output)