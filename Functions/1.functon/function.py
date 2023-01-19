
def data(number):
    if number <= 100:
        return "Greatness!"
    else:
        return "OOPS!"
result = data(288)
print(result)
print(data(200))
print(data(100))