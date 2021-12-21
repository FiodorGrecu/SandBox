def smallest_positive_int(A):
  sorted_A = sorted(A)
  last_in_sorted_A = sorted_A[-1]
  #check if straight continuous list
  if len(sorted_A) == last_in_sorted_A:
    return last_in_sorted_A + 1
  else:
    #incomplete list, iterate to find the smallest missing number
    sol=1
    for x in sorted_A:
        if x == sol:
          sol += 1
        else:
          break
    return sol

A = [1,2,7,4,5,6]
print(smallest_positive_int(A))