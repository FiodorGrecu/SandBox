# You are given the array paths, where paths[i] = [cityAi, cityBi] 
# means there exists a direct path going from cityAi to cityBi. 
# Return the destination city, that is, 
# the city without any path outgoing to another city.
# It is guaranteed that the graph of paths forms a line without any loop, 
# therefore, there will be exactly one destination city.


# Example 1

# Input: paths = [["London","New York"],["New York","Lima"],["Lima","Sao Paulo"]]
# Output: "Sao Paulo" 
# Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. 
# Your trip consist of: "London" -> "New York" -> "Lima" -> "Sao Paulo".

# Example 2

# Input: paths = [["B","C"],["D","B"],["C","A"]]
# Output: "A"
# Explanation: All possible trips are: 
# "D" -> "B" -> "C" -> "A". 
# "B" -> "C" -> "A". 
# "C" -> "A". 
# "A". 
# Clearly the destination city is "A".


from bleach import clean



class Solution:
    def destCity(self, paths:List[List[str]]) -> str:
        outgoing_count = {}
        for path in paths:
            city_a, city_b = path
            outgoing_count[city_a] = outgoing_count.get(city_a, 0) + 1
            outgoing_count[city_b] = outgoing_count.get(city_b, 0) 
        for city in outgoing_count:
            if outgoing_count[city] == 0:
                return city



solut = Solution()
print(solut.destCity(['a','b'], ['c','d']))