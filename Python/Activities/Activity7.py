numbers = input("Enter a sequence of comma separated values: ").split(",")  # Use split(',') without space

# Initialize sum variable
total_sum = 0

# Loop through the numbers and add them
for number in numbers:
    total_sum += int(number)  # Convert each string number to an integer

# Print the total sum
print("The sum of the numbers is:", total_sum)