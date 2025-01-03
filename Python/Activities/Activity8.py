user_input = input("Enter a list of numbers, separated by spaces: ")
numList = [int(num) for num in user_input.split()]

# Print the given list
print("Given list is:", numList)

# Get first element in the list
firstElement = numList[0]

# Get last element in the list
lastElement = numList[-1]

# Check if first and last elements are the same
if firstElement == lastElement:
    print(True)
else:
    print(False)