# // 1. Letter Combinations of a Phone Number

# // Given a string containing digits from 2-9 inclusive, 
# // return all possible letter combinations that the number could represent. Return the answer in any order.
# // A mapping of digit to letters (just like on the telephone buttons) is given below. 
# // Note that 1 does not map to any letters.

# // Example 1:
# // Input: digits = "23"
# // Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]

# // Example 2:
# // Input: digits = ""
# // Output: []

# // Example 3:
# // Input: digits = "2"
# // Output: ["a","b","c"]


combinations = {1 : [None],
                2 : ['a','b','c'],
                3 : ['d','e','f'],
                4 : ['g','h','i'],
                5 : ['j','k','l'],
                6 : ['m','n','o'],
                7 : ['p','q','r','s'],
                8 : ['t','u','v'],
                9 : ['w','x','y','z']}

inp = input("Enter digits: ")
inp = [int(inp[i]) for i in range(len(inp))]
inp_combs = [combinations.get(i) for i in inp]

print(inp_combs)
res = []

for i in range(len(inp_combs[0])):
    for j in range(len(inp_combs[1])):
        res.append(inp_combs[0][i] + inp_combs[1][j])

print(res)