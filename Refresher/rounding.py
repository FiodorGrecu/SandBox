my_float = 1.2645667
print(my_float)

# the rounding of a float example

limit_2 = round(my_float,2)
print(limit_2)

# same goes with 1 number after the decimal three numbers afetr the decimal and so on      

limit_1 = round(my_float,1)
limit_3 = round(my_float,3)

print(limit_1,"...",limit_2, "...", limit_3)

# The modern way and the profesional way of doing this is with string format    

f = "{0:.2f}".format(my_float)
# f = "{0:.3f}".format(my_float)
# f = "{0:.4f}".format(my_float)
print(f)