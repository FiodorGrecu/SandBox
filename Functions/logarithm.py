# from typing import Callable
import math


a = (float(input()))
base = (float(input()))
def log(a, base):
    result = ln(a) / ln(base)
    return result

def ln(a):
    n = 1000000.000000
    return n * ((a ** (1/n))-1)
print(log(base,a))

# print(math.log(27))