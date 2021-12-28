# Function for binary Representation
def binaryNumber(N):
    return bin(N)
print(binaryNumber(3))

# Maximum binary Gap
def max_gap(N):
    xs = bin(N)[2:].strip('0').split('1')
    return max([len(x) for x in xs])
print(max_gap(90))