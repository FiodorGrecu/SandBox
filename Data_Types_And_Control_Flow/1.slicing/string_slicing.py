data = []
string_value = "HelloWorld"
string1 = string_value.replace(string_value,string_value[0:5])
string2 = string_value.replace(string_value,string_value[5:len(string_value)])
# data_val = data.append((f'{string1} {string2}')) I like f strings better
data_val = data.append(string1 + ' ' + string2)
print(data)
