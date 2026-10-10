num_one = 0
num_two = 1
fibonacci = []
fibonacci.append(num_one)

for i in range (64):
  num_three = num_one + num_two
  fibonacci.append(num_three)

  num_one = num_two
  num_two = num_three

print(fibonacci)
   
   
