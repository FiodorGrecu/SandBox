# My Attempt

# arr = [1,2,3,4,2,4,1,2,3,4,1,1,2,1,4]
# n = []
# count = 0
# pairs = 0
# for i in arr:
#     if i == i:
#         count += 1
#     if count[enumerate] == 0:
#         pairs += 1
# print(pairs)

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'sockMerchant' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER n
#  2. INTEGER_ARRAY ar
#


def sockMerchant(n, ar):
        unq = set(ar)
        count = 0
        for i in unq:
           count_vals = ar.count(i)
           if count_vals>1:
            count = count + int(count_vals/2)
        return count


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    ar = list(map(int, input().rstrip().split()))

    result = sockMerchant(n, ar)

    fptr.write(str(result) + '\n')

    fptr.close()
